/**************************************************
 * Copyright (c) pure-systems GmbH 
 * All rights reserved. 
 **************************************************/
package org.openarchitectureware.var.pv.xtextrelbuilder.acquire;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.openarchitectureware.var.pv.xtextrelbuilder.Config;
import org.openarchitectureware.var.pv.xtextrelbuilder.ElementMapEntry;
import org.openarchitectureware.var.pv.xtextrelbuilder.RelCache;
import org.openarchitectureware.var.pv.xtextrelbuilder.TextfileTarget;

import com.ps.consul.eclipse.core.model.IPVConstant;
import com.ps.consul.eclipse.core.model.IPVElement;
import com.ps.consul.eclipse.core.model.IPVProperty;
import com.ps.consul.eclipse.core.model.ModelConstants;
import com.ps.consul.eclipse.core.relinfo.CacheItem;
import com.ps.consul.eclipse.core.relinfo.ICacheItem;
import com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire;
import com.ps.consul.eclipse.core.relinfo.IElementRelationInfo;
import com.ps.consul.eclipse.core.relinfo.IVolatileAcquire;
import com.ps.consul.eclipse.core.relinfo.RestrictionAcquire;
import com.ps.xml.CollectionSerializer;

public class TextfileAcquire implements IElementRelationAcquire, IVolatileAcquire {

  // type strings
  public static final String      HAS_FEATURE      = RestrictionAcquire.HAS_FEATURE;

  private final static String[]   m_Classes        = { Config.EXTENSION };

  private final static String[][] m_Types          = { { HAS_FEATURE } };

  private final static HashSet    m_HideClasses    = new HashSet();
  private final static HashSet    m_HideTypes      = new HashSet();
  private final static HashMap    m_ClassTypes     = new HashMap();
  
  /**
   * Static constructor to initialize the required sets
   */
  static {
    for (int i = 0; i < m_Classes.length; ++i) {
      m_ClassTypes.put(m_Classes[i], m_Types[i]);
    }
    // use m_HideTypes.add() for adding a class to the hide-structure
    m_HideTypes.addAll(Arrays.asList((String[]) m_ClassTypes.get(Config.EXTENSION)));
    // use m_HideClasses.add() for adding a class to the hide-structure
    // m_HideClasses.add(CONDITIONS_CLASS);

  }

  public TextfileAcquire() {}

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire#getRelations(com.ps.consul.eclipse.core.model.IElement)
   */
  public Set getRelations(IPVElement element) {
    HashSet result = new HashSet();
    if (element == null) return result;
    String name = element.getName();
    RelCache cache = RelCache.getInstance();
    if( element.getKlass().equals(ModelConstants.FEATURE_CLASS) == true ) {
      addRelations(result, name, cache);
    }
    return result;
  }

  private void addRelations(HashSet result, String name, RelCache cache) {
    if (cache.containsKey(name)) {
      Set set = (Set) cache.get(name);
      Iterator iter = set.iterator();
      while (iter.hasNext()) {
        ElementMapEntry entry = (ElementMapEntry) iter.next();
        if (entry.getFile() != null) {
          result.add(new CacheItem(entry.getTarget()));
        }
      }
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire#getOutRelationInfoData(com.ps.consul.eclipse.core.model.IElement,
   *      com.ps.consul.eclipse.core.relinfo.ICacheItem,
   *      com.ps.consul.eclipse.core.relinfo.IElementRelationInfo)
   */
  public void getOutRelationInfoData(IPVElement element, ICacheItem item, IElementRelationInfo info) {
    if (element == null || item == null || item.isElement()) return;
    String name = element.getName();
    RelCache cache = RelCache.getInstance();
    if( element.getKlass().equals(ModelConstants.FEATURE_CLASS) == true ) {
      addRelationInfoData(item, info, name, cache,Config.EXTENSION,HAS_FEATURE);
    }
  }

  private void addRelationInfoData(ICacheItem item, IElementRelationInfo info, String name, RelCache cache,
      String className, String typeName) {
    String classKey = className;
    String typeKey = typeName + "-source";
    if (cache.containsKey(name)) {
      Set set = (Set) cache.get(name);
      Iterator iter = set.iterator();
      while (iter.hasNext()) {
        ElementMapEntry entry = (ElementMapEntry) iter.next();
        if (entry.getFile() != null && item.getTarget() instanceof TextfileTarget) {
          TextfileTarget fileTarget = (TextfileTarget) item.getTarget();
          if (fileTarget.equals(entry.getTarget())) {
            info.insertInfo(classKey, className, typeKey, typeName, item, true, this);
          }
        }
      }
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire#getInRelationInfoData(com.ps.consul.eclipse.core.model.IElement,
   *      com.ps.consul.eclipse.core.relinfo.ICacheItem,
   *      com.ps.consul.eclipse.core.relinfo.IElementRelationInfo)
   */
  public void getInRelationInfoData(IPVElement element, ICacheItem item, IElementRelationInfo info) {}

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire#getKey()
   */
  public String getKey() {
    return Config.ACQUIRE_ID;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire#doSkipType(java.lang.String)
   */
  public boolean doSkipType(String typeName) {
    return m_HideTypes.contains(typeName) || typeName.equals("");
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire#doSkipClass(java.lang.String)
   */
  public boolean doSkipClass(String className) {
    return m_HideClasses.contains(className);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire#getClasses()
   */
  public String[] getClasses() {
    return m_Classes;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ps.consul.eclipse.core.relinfo.IElementRelationAcquire#getTypesForClass(java.lang.String)
   */
  public String[] getTypesForClass(String className) {
    return (String[]) m_ClassTypes.get(className);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
   */
  public Object getAdapter(Class adapter) {
    return Platform.getAdapterManager().getAdapter(this, adapter);
  }

}
