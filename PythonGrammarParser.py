# Generated from PythonGrammar.g4 by ANTLR 4.9.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17")
        buf.write("\64\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2")
        buf.write("\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3%\n\3")
        buf.write("\f\3\16\3(\13\3\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3")
        buf.write("\5\3\5\2\3\4\6\2\4\6\b\2\5\3\2\3\4\3\2\5\6\3\2\f\r\2\66")
        buf.write("\2\22\3\2\2\2\4\34\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n\r\5")
        buf.write("\6\4\2\13\r\5\4\3\2\f\n\3\2\2\2\f\13\3\2\2\2\r\16\3\2")
        buf.write("\2\2\16\17\7\13\2\2\17\21\3\2\2\2\20\f\3\2\2\2\21\24\3")
        buf.write("\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2\2\2\24\22")
        buf.write("\3\2\2\2\25\26\b\3\1\2\26\35\7\r\2\2\27\30\7\7\2\2\30")
        buf.write("\31\5\4\3\2\31\32\7\b\2\2\32\35\3\2\2\2\33\35\5\b\5\2")
        buf.write("\34\25\3\2\2\2\34\27\3\2\2\2\34\33\3\2\2\2\35&\3\2\2\2")
        buf.write("\36\37\f\7\2\2\37 \t\2\2\2 %\5\4\3\b!\"\f\6\2\2\"#\t\3")
        buf.write("\2\2#%\5\4\3\7$\36\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2")
        buf.write("\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2)*\7\16\2\2*+\7\t\2")
        buf.write("\2+.\t\4\2\2,.\7\17\2\2-)\3\2\2\2-,\3\2\2\2.\7\3\2\2\2")
        buf.write("/\60\7\n\2\2\60\61\5\4\3\2\61\62\7\b\2\2\62\t\3\2\2\2")
        buf.write("\b\f\22\34$&-")
        return buf.getvalue()


class PythonGrammarParser ( Parser ):

    grammarFileName = "PythonGrammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'/'", "'+'", "'-'", "'('", "')'", 
                     "'='", "'print('" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "NEWLINE", "STRING", "INT", "ID", "WS" ]

    RULE_start = 0
    RULE_expr = 1
    RULE_variable = 2
    RULE_printRule = 3

    ruleNames =  [ "start", "expr", "variable", "printRule" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    NEWLINE=9
    STRING=10
    INT=11
    ID=12
    WS=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(PythonGrammarParser.NEWLINE)
            else:
                return self.getToken(PythonGrammarParser.NEWLINE, i)

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PythonGrammarParser.VariableContext)
            else:
                return self.getTypedRuleContext(PythonGrammarParser.VariableContext,i)


        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PythonGrammarParser.ExprContext)
            else:
                return self.getTypedRuleContext(PythonGrammarParser.ExprContext,i)


        def getRuleIndex(self):
            return PythonGrammarParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = PythonGrammarParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << PythonGrammarParser.T__4) | (1 << PythonGrammarParser.T__7) | (1 << PythonGrammarParser.INT) | (1 << PythonGrammarParser.ID) | (1 << PythonGrammarParser.WS))) != 0):
                self.state = 10
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [PythonGrammarParser.ID, PythonGrammarParser.WS]:
                    self.state = 8
                    self.variable()
                    pass
                elif token in [PythonGrammarParser.T__4, PythonGrammarParser.T__7, PythonGrammarParser.INT]:
                    self.state = 9
                    self.expr(0)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 12
                self.match(PythonGrammarParser.NEWLINE)
                self.state = 18
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(PythonGrammarParser.INT, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PythonGrammarParser.ExprContext)
            else:
                return self.getTypedRuleContext(PythonGrammarParser.ExprContext,i)


        def printRule(self):
            return self.getTypedRuleContext(PythonGrammarParser.PrintRuleContext,0)


        def getRuleIndex(self):
            return PythonGrammarParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = PythonGrammarParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [PythonGrammarParser.INT]:
                self.state = 20
                self.match(PythonGrammarParser.INT)
                pass
            elif token in [PythonGrammarParser.T__4]:
                self.state = 21
                self.match(PythonGrammarParser.T__4)
                self.state = 22
                self.expr(0)
                self.state = 23
                self.match(PythonGrammarParser.T__5)
                pass
            elif token in [PythonGrammarParser.T__7]:
                self.state = 25
                self.printRule()
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 36
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 34
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                    if la_ == 1:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 28
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 29
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__0 or _la==PythonGrammarParser.T__1):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 30
                        self.expr(6)
                        pass

                    elif la_ == 2:
                        localctx = PythonGrammarParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 31
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 32
                        _la = self._input.LA(1)
                        if not(_la==PythonGrammarParser.T__2 or _la==PythonGrammarParser.T__3):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 33
                        self.expr(5)
                        pass

             
                self.state = 38
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class VariableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(PythonGrammarParser.ID, 0)

        def STRING(self):
            return self.getToken(PythonGrammarParser.STRING, 0)

        def INT(self):
            return self.getToken(PythonGrammarParser.INT, 0)

        def WS(self):
            return self.getToken(PythonGrammarParser.WS, 0)

        def getRuleIndex(self):
            return PythonGrammarParser.RULE_variable

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable" ):
                listener.enterVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable" ):
                listener.exitVariable(self)




    def variable(self):

        localctx = PythonGrammarParser.VariableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_variable)
        self._la = 0 # Token type
        try:
            self.state = 43
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [PythonGrammarParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 39
                self.match(PythonGrammarParser.ID)
                self.state = 40
                self.match(PythonGrammarParser.T__6)
                self.state = 41
                _la = self._input.LA(1)
                if not(_la==PythonGrammarParser.STRING or _la==PythonGrammarParser.INT):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [PythonGrammarParser.WS]:
                self.enterOuterAlt(localctx, 2)
                self.state = 42
                self.match(PythonGrammarParser.WS)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrintRuleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(PythonGrammarParser.ExprContext,0)


        def getRuleIndex(self):
            return PythonGrammarParser.RULE_printRule

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrintRule" ):
                listener.enterPrintRule(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrintRule" ):
                listener.exitPrintRule(self)




    def printRule(self):

        localctx = PythonGrammarParser.PrintRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_printRule)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 45
            self.match(PythonGrammarParser.T__7)
            self.state = 46
            self.expr(0)
            self.state = 47
            self.match(PythonGrammarParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 4)
         




