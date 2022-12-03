// Generated from PythonGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, NEWLINE=44, CHAR=45, 
		INT=46, FLOAT=47, STRING=48, DSTRING=49, SSTRING=50, STR=51, ID=52, TAB=53, 
		SPACE=54, WS=55, COMMENT=56, BLOCKCOMMENT=57;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_expr = 2, RULE_printRule = 3, RULE_variable = 4, 
		RULE_conds = 5, RULE_ifblock = 6, RULE_elseblock = 7, RULE_whileblock = 8, 
		RULE_forblock = 9, RULE_type = 10, RULE_varname = 11, RULE_ctype = 12, 
		RULE_cast = 13, RULE_space = 14, RULE_tab = 15, RULE_newline = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "expr", "printRule", "variable", "conds", "ifblock", 
			"elseblock", "whileblock", "forblock", "type", "varname", "ctype", "cast", 
			"space", "tab", "newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'*'", "'/'", "'+'", "'-'", "'%'", "' * '", "' / '", "' + '", 
			"' - '", "' % '", "'='", "'+='", "'-='", "'*='", "'/='", "' = '", "' += '", 
			"' -= '", "' *= '", "' /= '", "'('", "')'", "'print'", "'if'", "':'", 
			"'elif'", "'else'", "'while'", "'for'", "'in'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'and'", "'or'", "'not'", "'str'", "'int'", "'float'", 
			null, null, null, null, null, null, null, null, null, "'  '", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NEWLINE", "CHAR", "INT", 
			"FLOAT", "STRING", "DSTRING", "SSTRING", "STR", "ID", "TAB", "SPACE", 
			"WS", "COMMENT", "BLOCKCOMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonGrammarParser.EOF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(34);
				block();
				setState(35);
				match(T__0);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrintRuleContext printRule() {
			return getRuleContext(PrintRuleContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileblockContext whileblock() {
			return getRuleContext(WhileblockContext.class,0);
		}
		public ForblockContext forblock() {
			return getRuleContext(ForblockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				printRule();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				ifblock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				whileblock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				forblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PythonGrammarParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(54);
				match(INT);
				}
				break;
			case T__21:
				{
				setState(55);
				match(T__21);
				setState(56);
				expr(0);
				setState(57);
				match(T__22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(62);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(63);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(65);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintRuleContext extends ParserRuleContext {
		public PrintRuleContext printRule() {
			return getRuleContext(PrintRuleContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PythonGrammarParser.STRING, 0); }
		public PrintRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterPrintRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitPrintRule(this);
		}
	}

	public final PrintRuleContext printRule() throws RecognitionException {
		PrintRuleContext _localctx = new PrintRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printRule);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__23);
				setState(73);
				match(T__21);
				setState(74);
				printRule();
				setState(75);
				match(T__22);
				}
				break;
			case T__21:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				expr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				varname();
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(83);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				varname();
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				cast();
				setState(88);
				match(T__21);
				setState(89);
				type();
				setState(90);
				match(T__22);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public CondsContext conds() {
			return getRuleContext(CondsContext.class,0);
		}
		public CondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterConds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitConds(this);
		}
	}

	public final CondsContext conds() throws RecognitionException {
		CondsContext _localctx = new CondsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conds);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				type();
				setState(95);
				space(0);
				setState(96);
				ctype();
				setState(97);
				space(0);
				setState(98);
				conds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfblockContext extends ParserRuleContext {
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public CondsContext conds() {
			return getRuleContext(CondsContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterIfblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitIfblock(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifblock);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__24);
				setState(104);
				space(0);
				setState(105);
				conds();
				setState(106);
				match(T__25);
				setState(107);
				newline(0);
				setState(108);
				tab(0);
				setState(109);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__24);
				setState(112);
				space(0);
				setState(113);
				conds();
				setState(114);
				match(T__25);
				setState(115);
				newline(0);
				setState(116);
				tab(0);
				setState(117);
				block();
				setState(118);
				newline(0);
				setState(119);
				elseblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseblockContext extends ParserRuleContext {
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public CondsContext conds() {
			return getRuleContext(CondsContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterElseblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitElseblock(this);
		}
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseblock);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__26);
				setState(124);
				space(0);
				setState(125);
				conds();
				setState(126);
				match(T__25);
				setState(127);
				newline(0);
				setState(128);
				tab(0);
				setState(129);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__26);
				setState(132);
				space(0);
				setState(133);
				conds();
				setState(134);
				match(T__25);
				setState(135);
				newline(0);
				setState(136);
				tab(0);
				setState(137);
				block();
				setState(138);
				newline(0);
				setState(139);
				elseblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(T__27);
				setState(142);
				match(T__25);
				setState(143);
				newline(0);
				setState(144);
				tab(0);
				setState(145);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileblockContext extends ParserRuleContext {
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public CondsContext conds() {
			return getRuleContext(CondsContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public WhileblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterWhileblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitWhileblock(this);
		}
	}

	public final WhileblockContext whileblock() throws RecognitionException {
		WhileblockContext _localctx = new WhileblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__28);
			setState(150);
			space(0);
			setState(151);
			conds();
			setState(152);
			match(T__25);
			setState(157); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					newline(0);
					setState(154);
					tab(0);
					setState(155);
					block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForblockContext extends ParserRuleContext {
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ForblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterForblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitForblock(this);
		}
	}

	public final ForblockContext forblock() throws RecognitionException {
		ForblockContext _localctx = new ForblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__29);
			setState(162);
			space(0);
			setState(163);
			varname();
			setState(164);
			space(0);
			setState(165);
			match(T__30);
			setState(166);
			space(0);
			setState(167);
			varname();
			setState(168);
			match(T__25);
			setState(173); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(169);
					newline(0);
					setState(170);
					tab(0);
					setState(171);
					block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PythonGrammarParser.STRING, 0); }
		public TerminalNode INT() { return getToken(PythonGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PythonGrammarParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(PythonGrammarParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(PythonGrammarParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarnameContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(PythonGrammarParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(PythonGrammarParser.ID, 0); }
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitVarname(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtypeContext extends ParserRuleContext {
		public CtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterCtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitCtype(this);
		}
	}

	public final CtypeContext ctype() throws RecognitionException {
		CtypeContext _localctx = new CtypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ctype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitCast(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(PythonGrammarParser.SPACE, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		return space(0);
	}

	private SpaceContext space(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SpaceContext _localctx = new SpaceContext(_ctx, _parentState);
		SpaceContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_space, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(186);
			match(SPACE);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SpaceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_space);
					setState(188);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(189);
					space(2);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(PythonGrammarParser.TAB, 0); }
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitTab(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		return tab(0);
	}

	private TabContext tab(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TabContext _localctx = new TabContext(_ctx, _parentState);
		TabContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_tab, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(196);
			match(TAB);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TabContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tab);
					setState(198);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(199);
					tab(2);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonGrammarListener ) ((PythonGrammarListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		return newline(0);
	}

	private NewlineContext newline(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NewlineContext _localctx = new NewlineContext(_ctx, _parentState);
		NewlineContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_newline, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(206);
			match(T__0);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NewlineContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_newline);
					setState(208);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(209);
					newline(2);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 14:
			return space_sempred((SpaceContext)_localctx, predIndex);
		case 15:
			return tab_sempred((TabContext)_localctx, predIndex);
		case 16:
			return newline_sempred((NewlineContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean space_sempred(SpaceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tab_sempred(TabContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean newline_sempred(NewlineContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4F\n\4\f\4\16\4I\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00a0\n\n\r\n\16\n\u00a1\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00b0\n\13\r\13"+
		"\16\13\u00b1\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00c1\n\20\f\20\16\20\u00c4\13\20\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u00cb\n\21\f\21\16\21\u00ce\13\21\3\22\3\22\3\22\3\22\3\22\7\22\u00d5"+
		"\n\22\f\22\16\22\u00d8\13\22\3\22\2\6\6\36 \"\23\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"\2\t\3\2\4\r\3\2\16\27\4\2\16\16\23\23\4\2/\62\66"+
		"\66\4\2//\66\66\3\2\"*\3\2+-\2\u00de\2)\3\2\2\2\4\65\3\2\2\2\6=\3\2\2"+
		"\2\bQ\3\2\2\2\n^\3\2\2\2\fg\3\2\2\2\16{\3\2\2\2\20\u0095\3\2\2\2\22\u0097"+
		"\3\2\2\2\24\u00a3\3\2\2\2\26\u00b3\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3"+
		"\2\2\2\34\u00b9\3\2\2\2\36\u00bb\3\2\2\2 \u00c5\3\2\2\2\"\u00cf\3\2\2"+
		"\2$%\5\4\3\2%&\7\3\2\2&(\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2"+
		"\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2.\66\3\2\2\2/\66\5\n\6\2"+
		"\60\66\5\b\5\2\61\66\5\16\b\2\62\66\5\6\4\2\63\66\5\22\n\2\64\66\5\24"+
		"\13\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2"+
		"\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\b\4\1\28>\7\60\2\29:\7"+
		"\30\2\2:;\5\6\4\2;<\7\31\2\2<>\3\2\2\2=\67\3\2\2\2=9\3\2\2\2>G\3\2\2\2"+
		"?@\f\6\2\2@A\t\2\2\2AF\5\6\4\7BC\f\5\2\2CD\t\3\2\2DF\5\6\4\6E?\3\2\2\2"+
		"EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG\3\2\2\2JK\7\32\2"+
		"\2KL\7\30\2\2LM\5\b\5\2MN\7\31\2\2NR\3\2\2\2OR\5\6\4\2PR\7\62\2\2QJ\3"+
		"\2\2\2QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\5\30\r\2TU\t\4\2\2UV\5\26\f\2"+
		"V_\3\2\2\2WX\5\30\r\2XY\t\4\2\2YZ\5\34\17\2Z[\7\30\2\2[\\\5\26\f\2\\]"+
		"\7\31\2\2]_\3\2\2\2^S\3\2\2\2^W\3\2\2\2_\13\3\2\2\2`a\5\26\f\2ab\5\36"+
		"\20\2bc\5\32\16\2cd\5\36\20\2de\5\f\7\2eh\3\2\2\2fh\5\26\f\2g`\3\2\2\2"+
		"gf\3\2\2\2h\r\3\2\2\2ij\7\33\2\2jk\5\36\20\2kl\5\f\7\2lm\7\34\2\2mn\5"+
		"\"\22\2no\5 \21\2op\5\4\3\2p|\3\2\2\2qr\7\33\2\2rs\5\36\20\2st\5\f\7\2"+
		"tu\7\34\2\2uv\5\"\22\2vw\5 \21\2wx\5\4\3\2xy\5\"\22\2yz\5\20\t\2z|\3\2"+
		"\2\2{i\3\2\2\2{q\3\2\2\2|\17\3\2\2\2}~\7\35\2\2~\177\5\36\20\2\177\u0080"+
		"\5\f\7\2\u0080\u0081\7\34\2\2\u0081\u0082\5\"\22\2\u0082\u0083\5 \21\2"+
		"\u0083\u0084\5\4\3\2\u0084\u0096\3\2\2\2\u0085\u0086\7\35\2\2\u0086\u0087"+
		"\5\36\20\2\u0087\u0088\5\f\7\2\u0088\u0089\7\34\2\2\u0089\u008a\5\"\22"+
		"\2\u008a\u008b\5 \21\2\u008b\u008c\5\4\3\2\u008c\u008d\5\"\22\2\u008d"+
		"\u008e\5\20\t\2\u008e\u0096\3\2\2\2\u008f\u0090\7\36\2\2\u0090\u0091\7"+
		"\34\2\2\u0091\u0092\5\"\22\2\u0092\u0093\5 \21\2\u0093\u0094\5\4\3\2\u0094"+
		"\u0096\3\2\2\2\u0095}\3\2\2\2\u0095\u0085\3\2\2\2\u0095\u008f\3\2\2\2"+
		"\u0096\21\3\2\2\2\u0097\u0098\7\37\2\2\u0098\u0099\5\36\20\2\u0099\u009a"+
		"\5\f\7\2\u009a\u009f\7\34\2\2\u009b\u009c\5\"\22\2\u009c\u009d\5 \21\2"+
		"\u009d\u009e\5\4\3\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\23\3\2\2\2\u00a3"+
		"\u00a4\7 \2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\5"+
		"\36\20\2\u00a7\u00a8\7!\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\5\30\r\2"+
		"\u00aa\u00af\7\34\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00ad\5 \21\2\u00ad\u00ae"+
		"\5\4\3\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\t\5\2"+
		"\2\u00b4\27\3\2\2\2\u00b5\u00b6\t\6\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\t"+
		"\7\2\2\u00b8\33\3\2\2\2\u00b9\u00ba\t\b\2\2\u00ba\35\3\2\2\2\u00bb\u00bc"+
		"\b\20\1\2\u00bc\u00bd\78\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\f\3\2\2\u00bf"+
		"\u00c1\5\36\20\4\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c6\b\21\1\2\u00c6\u00c7\7\67\2\2\u00c7\u00cc\3\2\2\2\u00c8\u00c9\f"+
		"\3\2\2\u00c9\u00cb\5 \21\4\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd!\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d0\b\22\1\2\u00d0\u00d1\7\3\2\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3"+
		"\f\3\2\2\u00d3\u00d5\5\"\22\4\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7#\3\2\2\2\u00d8\u00d6\3"+
		"\2\2\2\21)\65=EGQ^g{\u0095\u00a1\u00b1\u00c2\u00cc\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}