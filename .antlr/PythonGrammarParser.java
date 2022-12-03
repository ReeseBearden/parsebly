// Generated from /Users/rylan/Desktop/4450_Parser_Project/parsebly/PythonGrammar.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		WS=54, COMMENT=55, BLOCKCOMMENT=56;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_expr = 2, RULE_variable = 3, RULE_printRule = 4, 
		RULE_conds = 5, RULE_ifblock = 6, RULE_elseblock = 7, RULE_whileblock = 8, 
		RULE_forblock = 9, RULE_type = 10, RULE_varname = 11, RULE_ctype = 12, 
		RULE_cast = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "expr", "variable", "printRule", "conds", "ifblock", 
			"elseblock", "whileblock", "forblock", "type", "varname", "ctype", "cast"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'*'", "'/'", "'+'", "'-'", "'%'", "' * '", "' / '", "' + '", 
			"' - '", "' % '", "'='", "'+='", "'-='", "'*='", "'/='", "' = '", "' += '", 
			"' -= '", "' *= '", "' /= '", "'('", "')'", "'print('", "'if'", "':'", 
			"'elif'", "'else'", "'while'", "'for'", "'in'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'and'", "'or'", "'not'", "'str'", "'int'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NEWLINE", "CHAR", "INT", 
			"FLOAT", "STRING", "DSTRING", "SSTRING", "STR", "ID", "TAB", "WS", "COMMENT", 
			"BLOCKCOMMENT"
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << CHAR) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(28);
				block();
				setState(29);
				match(T__0);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(45);
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
				setState(39);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				printRule();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				ifblock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				whileblock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
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
		public PrintRuleContext printRule() {
			return getRuleContext(PrintRuleContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(48);
				match(INT);
				}
				break;
			case T__21:
				{
				setState(49);
				match(T__21);
				setState(50);
				expr(0);
				setState(51);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(53);
				printRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(66);
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				varname();
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(69);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				varname();
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				cast();
				setState(74);
				match(T__21);
				setState(75);
				type();
				setState(76);
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

	public static class PrintRuleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printRule; }
	}

	public final PrintRuleContext printRule() throws RecognitionException {
		PrintRuleContext _localctx = new PrintRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__23);
			setState(81);
			expr(0);
			setState(82);
			match(T__22);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public CtypeContext ctype() {
			return getRuleContext(CtypeContext.class,0);
		}
		public CondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conds; }
	}

	public final CondsContext conds() throws RecognitionException {
		CondsContext _localctx = new CondsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
			ctype();
			setState(86);
			type();
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
		public CondsContext conds() {
			return getRuleContext(CondsContext.class,0);
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
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifblock);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__24);
				setState(89);
				conds();
				setState(90);
				match(T__25);
				setState(91);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__24);
				setState(94);
				conds();
				setState(95);
				match(T__25);
				setState(96);
				block();
				setState(97);
				match(T__0);
				setState(98);
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
		public CondsContext conds() {
			return getRuleContext(CondsContext.class,0);
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
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseblock);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__26);
				setState(103);
				conds();
				setState(104);
				match(T__25);
				setState(105);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__26);
				setState(108);
				conds();
				setState(109);
				match(T__25);
				setState(110);
				block();
				setState(111);
				match(T__0);
				setState(112);
				elseblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__27);
				setState(115);
				match(T__25);
				setState(116);
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
		public CondsContext conds() {
			return getRuleContext(CondsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileblock; }
	}

	public final WhileblockContext whileblock() throws RecognitionException {
		WhileblockContext _localctx = new WhileblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__28);
			setState(120);
			conds();
			setState(121);
			match(T__25);
			setState(122);
			block();
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
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forblock; }
	}

	public final ForblockContext forblock() throws RecognitionException {
		ForblockContext _localctx = new ForblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__29);
			setState(125);
			varname();
			setState(126);
			match(T__30);
			setState(127);
			varname();
			setState(128);
			match(T__25);
			setState(129);
			block();
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
	}

	public final CtypeContext ctype() throws RecognitionException {
		CtypeContext _localctx = new CtypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ctype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u008e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bg"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tx"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\2\3\6\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\t\3\2\4\r\3\2\16\27\4\2\16\16\23\23\4\2/\62\66\66\4\2//\66\66"+
		"\3\2\"*\3\2+-\2\u008e\2#\3\2\2\2\4/\3\2\2\2\68\3\2\2\2\bP\3\2\2\2\nR\3"+
		"\2\2\2\fV\3\2\2\2\16f\3\2\2\2\20w\3\2\2\2\22y\3\2\2\2\24~\3\2\2\2\26\u0085"+
		"\3\2\2\2\30\u0087\3\2\2\2\32\u0089\3\2\2\2\34\u008b\3\2\2\2\36\37\5\4"+
		"\3\2\37 \7\3\2\2 \"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2"+
		"$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(\60\3\2\2\2)\60\5\b\5\2*\60"+
		"\5\n\6\2+\60\5\16\b\2,\60\5\6\4\2-\60\5\22\n\2.\60\5\24\13\2/(\3\2\2\2"+
		"/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\5\3\2"+
		"\2\2\61\62\b\4\1\2\629\7\60\2\2\63\64\7\30\2\2\64\65\5\6\4\2\65\66\7\31"+
		"\2\2\669\3\2\2\2\679\5\n\6\28\61\3\2\2\28\63\3\2\2\28\67\3\2\2\29B\3\2"+
		"\2\2:;\f\7\2\2;<\t\2\2\2<A\5\6\4\b=>\f\6\2\2>?\t\3\2\2?A\5\6\4\7@:\3\2"+
		"\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2\2\2EF\5"+
		"\30\r\2FG\t\4\2\2GH\5\26\f\2HQ\3\2\2\2IJ\5\30\r\2JK\t\4\2\2KL\5\34\17"+
		"\2LM\7\30\2\2MN\5\26\f\2NO\7\31\2\2OQ\3\2\2\2PE\3\2\2\2PI\3\2\2\2Q\t\3"+
		"\2\2\2RS\7\32\2\2ST\5\6\4\2TU\7\31\2\2U\13\3\2\2\2VW\5\26\f\2WX\5\32\16"+
		"\2XY\5\26\f\2Y\r\3\2\2\2Z[\7\33\2\2[\\\5\f\7\2\\]\7\34\2\2]^\5\4\3\2^"+
		"g\3\2\2\2_`\7\33\2\2`a\5\f\7\2ab\7\34\2\2bc\5\4\3\2cd\7\3\2\2de\5\20\t"+
		"\2eg\3\2\2\2fZ\3\2\2\2f_\3\2\2\2g\17\3\2\2\2hi\7\35\2\2ij\5\f\7\2jk\7"+
		"\34\2\2kl\5\4\3\2lx\3\2\2\2mn\7\35\2\2no\5\f\7\2op\7\34\2\2pq\5\4\3\2"+
		"qr\7\3\2\2rs\5\20\t\2sx\3\2\2\2tu\7\36\2\2uv\7\34\2\2vx\5\4\3\2wh\3\2"+
		"\2\2wm\3\2\2\2wt\3\2\2\2x\21\3\2\2\2yz\7\37\2\2z{\5\f\7\2{|\7\34\2\2|"+
		"}\5\4\3\2}\23\3\2\2\2~\177\7 \2\2\177\u0080\5\30\r\2\u0080\u0081\7!\2"+
		"\2\u0081\u0082\5\30\r\2\u0082\u0083\7\34\2\2\u0083\u0084\5\4\3\2\u0084"+
		"\25\3\2\2\2\u0085\u0086\t\5\2\2\u0086\27\3\2\2\2\u0087\u0088\t\6\2\2\u0088"+
		"\31\3\2\2\2\u0089\u008a\t\7\2\2\u008a\33\3\2\2\2\u008b\u008c\t\b\2\2\u008c"+
		"\35\3\2\2\2\n#/8@BPfw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}