# Parsebly
Parsebly is a project that aims to replicate a Python parser. The goal is to make it as similar as possible to the syntax as Python. It's relatively straightforward, if you enter some python code, the parser should be able to detect the validity of the input.

Members:
Jessica Melkumian,
Rylan Chamberlin,
Reese Bearden


Set up:
1. Clone the repo down
2. Setup ANTLR:


   A. Download and install ANTLR4: https://www.antlr.org/download/antlr-4.9.2-complete.jar
   
   B: Copy the downloaded tool where you usually put third-party java libraries
   
   C: add the tool to your CLASSPATH. Add it to your startup script
   
2. Execute the following instructions on Linux/Mac OS:


   A: 'sudo cp antlr-4.9.2-complete.jar /usr/local/lib/'
   
   B: add the following to you .bash_profile:
        export CLASSPATH=".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH"
        alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
        
   C: alias grun='java -Xmx 500M -cp "/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
   


How to use the parser:
1. run command 'antlr4 PythonGrammar.g4'
2. run command 'javac PythonGrammar*.java'
3. run command 'grun PythonGrammar start test.py -gui'

   A. Add your valid python code and press command ctrl + D and then a Java applet should launch. In the interface of the Java applet, you'll see the parse tree that was generated based on your input.


Link to demo: https://youtu.be/nq12LxjEZBg


The file PythonGrammar.g4 contains the code for the parser. You can reference any of the functions inside of there and test each function individually. In order to do that, in step 3 you would run command 'grun PythonGrammar <function> test.py -gui'. You can see what the functions are named inside of the PythonGrammar.g4 file.

We have a Python file called test.py that exists within the project, we have pre-existing code in there to test the function basics. If you want to add more code in there or modify anything, that's perfectly fine.

On another note, to see the full output of the parse tree, download antlr4_parse_tree.png. On GitHub it is a dark background, so you'll need to download it and open it in a browser which will automatically apply a white background to the image and rendering a more legible image. 
   
