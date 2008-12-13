/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.dotvrelbuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.openarchitectureware.var.pv.dotvrelbuilder.Config;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.ps.xml.DocumentEx;
import com.ps.xml.NodeEx;

public class RelCache {

  private HashMap   m_Cache = new HashMap();
  private static RelCache  m_This = null;
  
  public static RelCache getInstance () {
    if( m_This == null ) {
      m_This = new RelCache();
      m_This.load(getStore(Config.CACHE_ID));
    }
    return m_This;
  }
  
  private static File getStore(String id) {
    return Activator.getDefault().getStateLocation().append(id).toFile();
  }

  public void store () {
    m_This.save(getStore(Config.CACHE_ID));
  }
  
  public synchronized void add (String sym,ElementMapEntry e) {
    Set set;
    if (!m_Cache.containsKey(sym)) {
      set = new HashSet();
      m_Cache.put(sym, set);
    }
    else set = (Set) m_Cache.get(sym);
    set.add(e);
  }

  public synchronized boolean containsKey (String sym) {
    return m_Cache.containsKey(sym);
  }

  public synchronized Set get (String sym) {
    Set s = (Set)m_Cache.get(sym);
    HashSet res = new HashSet();
    res.addAll(s);
    return res;
  }
  
  public synchronized void clear (IFile file) {
    Iterator idx = m_Cache.values().iterator();
    for( ; idx.hasNext(); ) {
      Set s = (Set)idx.next();
      if( s != null ) {
        Set tmp = new HashSet();
        tmp.addAll(s);
        Iterator sdx = tmp.iterator();
        for( ; sdx.hasNext(); ) {
          ElementMapEntry ee = (ElementMapEntry)sdx.next();
          if( ee.getFile().equals(file) == true ) {
//            System.out.println("Remove: '" + ee.getFile() + "' Line: " + ee.getLine());
            s.remove(ee);
          }
        }
      }
    }
  }

  public synchronized void clear (IProject project) {
    Iterator idx = m_Cache.values().iterator();
    for( ; idx.hasNext(); ) {
      Set s = (Set)idx.next();
      if( s != null ) {
        Set tmp = new HashSet();
        tmp.addAll(s);
        Iterator sdx = tmp.iterator();
        for( ; sdx.hasNext(); ) {
          ElementMapEntry ee = (ElementMapEntry)sdx.next();
          if( ee.getFile().getProject().equals(project) == true ) {
//            System.out.println("Remove: '" + ee.getFile() + "' Line: " + ee.getLine());
            s.remove(ee);
          }
        }
      }
    }
  }

  public synchronized void save (File store) {
    DocumentEx doc = new DocumentEx();
    try {
      doc.create();
      Document xmlStore = doc.getDoc();
      Node root = xmlStore.createElement("map");
      doc.setRootNode(root);
      Iterator iter = m_Cache.keySet().iterator();
      while (iter.hasNext()) {
        String uniqueName = (String) iter.next();
        Set row = (Set) m_Cache.get(uniqueName);
        // we store only non-empty entries
        if( row.size() > 0 ) {
          Node elementNode = xmlStore.createElement("e");
          NodeEx.setAttribute(elementNode, "name", uniqueName);
          root.appendChild(elementNode);
          appendRowNodes(xmlStore, elementNode, row);
        }
      }
      OutputStream stream = new FileOutputStream(store, false);
      doc.save(stream);
      stream.flush();
      stream.close();
    }
    catch (ParserConfigurationException e) {
      e.printStackTrace();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void appendRowNodes(Document xmlStore, Node elementNode, Set row) {
    Iterator idx = row.iterator();
    while (idx.hasNext()) {
      ElementMapEntry entry = (ElementMapEntry) idx.next();
      if (entry.getFile() != null && entry.getFile().isAccessible()) {
        Node fileNode = xmlStore.createElement("f");
        NodeEx.setAttribute(fileNode, "loc", entry.getFile().getFullPath().toString());
        NodeEx.setAttribute(fileNode, "line", Integer.toString(entry.getLine()));
        elementNode.appendChild(fileNode);
      }
    }
  }

  public synchronized void load (File store) {
    try {
      if (store != null && store.exists() && store.canRead()) {
        InputStream stream = new FileInputStream(store);
        DocumentEx doc = new DocumentEx();
        doc.create();
        doc.load(stream);
        parseFromStore(doc);
      }
    }
    catch (ParserConfigurationException e) {
      e.printStackTrace();
    }
    catch (SAXException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void parseFromStore(DocumentEx doc) {
    m_Cache.clear();
    Node root = doc.getRootNode();
    NodeList list = root.getChildNodes();
    if (list.getLength() <= 0) return;
    for (int i = 0; i < list.getLength(); i++) {
      Node elementNode = list.item(i);
      if (elementNode.getNodeName().equals("e")) {
        Set row = new HashSet();
        String uniqueName = NodeEx.getAttribute(elementNode, "name");
        m_Cache.put(uniqueName, row);
        addEntriesToRow(elementNode, row);
      }
    }
  }

  private void addEntriesToRow(Node elementNode, Collection row) {
    NodeList fileNodes = elementNode.getChildNodes();
    for (int j = 0; j < fileNodes.getLength(); j++) {
      Node fileNode = fileNodes.item(j);
      if (fileNode.getNodeName().equals("f")) {
        int line = Integer.parseInt(NodeEx.getAttribute(fileNode, "line"));
        String filePath = NodeEx.getAttribute(fileNode, "loc");
        IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath));
        if (file.exists()) {
          row.add(new ElementMapEntry(file, line));
        }
      }
    }
  }
  
}
