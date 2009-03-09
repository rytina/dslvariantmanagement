
		@echo off
	    mkdir .
		echo Using Graphviz in path "%GRAPHVIZ_BIN%/" 
		
			echo processing ecoremetamodel.dot ...
			"%GRAPHVIZ_BIN%/dot.exe" -Tgif ecoremetamodel.dot -o ./ecoremetamodel.gif
		
	