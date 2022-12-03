# Generated from PythonGrammar.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PythonGrammarParser import PythonGrammarParser
else:
    from PythonGrammarParser import PythonGrammarParser

# This class defines a complete listener for a parse tree produced by PythonGrammarParser.
class PythonGrammarListener(ParseTreeListener):

    # Enter a parse tree produced by PythonGrammarParser#block.
    def enterBlock(self, ctx:PythonGrammarParser.BlockContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#block.
    def exitBlock(self, ctx:PythonGrammarParser.BlockContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#start.
    def enterStart(self, ctx:PythonGrammarParser.StartContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#start.
    def exitStart(self, ctx:PythonGrammarParser.StartContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#expr.
    def enterExpr(self, ctx:PythonGrammarParser.ExprContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#expr.
    def exitExpr(self, ctx:PythonGrammarParser.ExprContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#variable.
    def enterVariable(self, ctx:PythonGrammarParser.VariableContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#variable.
    def exitVariable(self, ctx:PythonGrammarParser.VariableContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#printRule.
    def enterPrintRule(self, ctx:PythonGrammarParser.PrintRuleContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#printRule.
    def exitPrintRule(self, ctx:PythonGrammarParser.PrintRuleContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#conds.
    def enterConds(self, ctx:PythonGrammarParser.CondsContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#conds.
    def exitConds(self, ctx:PythonGrammarParser.CondsContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#ifblock.
    def enterIfblock(self, ctx:PythonGrammarParser.IfblockContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#ifblock.
    def exitIfblock(self, ctx:PythonGrammarParser.IfblockContext):
        pass


    # Enter a parse tree produced by PythonGrammarParser#whileBlock.
    def enterWhileBlock(self, ctx:PythonGrammarParser.WhileBlockContext):
        pass

    # Exit a parse tree produced by PythonGrammarParser#whileBlock.
    def exitWhileBlock(self, ctx:PythonGrammarParser.WhileBlockContext):
        pass



del PythonGrammarParser