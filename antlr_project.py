from antlr4 import *
from antlr4.tree.Trees import Trees
from PythonGrammarLexer import PythonGrammarLexer
from PythonGrammarListener import PythonGrammarListener
from PythonGrammarParser import PythonGrammarParser
import sys




def main(agrv):
    io_stream = FileStream(agrv[1])
    lexer = PythonGrammarLexer(io_stream)
    stream = CommonTokenStream(lexer)
    parser = PythonGrammarParser(stream)
    tree = parser.start()
    print(Trees.toStringTree(tree, None, parser))
    

if __name__ == '__main__':
    main(sys.argv)

"""
class HelloPrintListener(PythonGrammarListener):
    def enterHi(self, ctx):
        print("Hello: %s" % ctx.ID())

def main():
    lexer = PythonGrammarLexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = PythonGrammarParser(stream)
    tree = parser.hi()
    printer = HelloPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()
"""