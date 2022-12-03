// Generated from PythonGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonGrammarLexer extends Lexer {
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
		T__38=39, T__39=40, NEWLINE=41, CAST=42, CHAR=43, INT=44, FLOAT=45, STRING=46, 
		DSTRING=47, SSTRING=48, STR=49, ID=50, TAB=51, WS=52, COMMENT=53, BLOCKCOMMENT=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "NEWLINE", 
			"CAST", "CHAR", "INT", "FLOAT", "STRING", "DSTRING", "SSTRING", "STR", 
			"ID", "TAB", "WS", "COMMENT", "BLOCKCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'*'", "'/'", "'+'", "'-'", "'%'", "' * '", "' / '", "' + '", 
			"' - '", "' % '", "'='", "'+='", "'-='", "'*='", "'/='", "' = '", "' += '", 
			"' -= '", "' *= '", "' /= '", "'('", "')'", "'print('", "'if'", "':'", 
			"'elif'", "'else'", "'while'", "'for'", "'in'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NEWLINE", "CAST", "CHAR", "INT", "FLOAT", 
			"STRING", "DSTRING", "SSTRING", "STR", "ID", "TAB", "WS", "COMMENT", 
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


	public PythonGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0159\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)"+
		"\3)\3*\6*\u00f9\n*\r*\16*\u00fa\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0108"+
		"\n+\3,\3,\3-\6-\u010d\n-\r-\16-\u010e\3.\3.\3.\3.\3/\3/\5/\u0117\n/\3"+
		"\60\3\60\6\60\u011b\n\60\r\60\16\60\u011c\3\60\3\60\3\61\3\61\6\61\u0123"+
		"\n\61\r\61\16\61\u0124\3\61\3\61\3\62\6\62\u012a\n\62\r\62\16\62\u012b"+
		"\3\63\3\63\7\63\u0130\n\63\f\63\16\63\u0133\13\63\3\64\6\64\u0136\n\64"+
		"\r\64\16\64\u0137\3\65\6\65\u013b\n\65\r\65\16\65\u013c\3\65\3\65\3\66"+
		"\3\66\7\66\u0143\n\66\f\66\16\66\u0146\13\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u014f\n\67\f\67\16\67\u0152\13\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\u0150\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8\3\2\f\3\2\f\f\4\2C\\c|\3\2\62;\3\2$$\3\2))\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\3\2\13\13\5\2\f\f\17\17\"\"\4\2\f\f\17\17\2\u0165\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17"+
		"{\3\2\2\2\21\177\3\2\2\2\23\u0083\3\2\2\2\25\u0087\3\2\2\2\27\u008b\3"+
		"\2\2\2\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u0094\3\2\2\2\37\u0097\3\2"+
		"\2\2!\u009a\3\2\2\2#\u009d\3\2\2\2%\u00a1\3\2\2\2\'\u00a6\3\2\2\2)\u00ab"+
		"\3\2\2\2+\u00b0\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2"+
		"\63\u00c0\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00ca\3\2\2\2;\u00cf"+
		"\3\2\2\2=\u00d5\3\2\2\2?\u00d9\3\2\2\2A\u00dc\3\2\2\2C\u00de\3\2\2\2E"+
		"\u00e1\3\2\2\2G\u00e3\3\2\2\2I\u00e6\3\2\2\2K\u00e9\3\2\2\2M\u00ec\3\2"+
		"\2\2O\u00f0\3\2\2\2Q\u00f3\3\2\2\2S\u00f8\3\2\2\2U\u0107\3\2\2\2W\u0109"+
		"\3\2\2\2Y\u010c\3\2\2\2[\u0110\3\2\2\2]\u0116\3\2\2\2_\u0118\3\2\2\2a"+
		"\u0120\3\2\2\2c\u0129\3\2\2\2e\u012d\3\2\2\2g\u0135\3\2\2\2i\u013a\3\2"+
		"\2\2k\u0140\3\2\2\2m\u0149\3\2\2\2op\7\f\2\2p\4\3\2\2\2qr\7,\2\2r\6\3"+
		"\2\2\2st\7\61\2\2t\b\3\2\2\2uv\7-\2\2v\n\3\2\2\2wx\7/\2\2x\f\3\2\2\2y"+
		"z\7\'\2\2z\16\3\2\2\2{|\7\"\2\2|}\7,\2\2}~\7\"\2\2~\20\3\2\2\2\177\u0080"+
		"\7\"\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7\"\2\2\u0082\22\3\2\2\2\u0083"+
		"\u0084\7\"\2\2\u0084\u0085\7-\2\2\u0085\u0086\7\"\2\2\u0086\24\3\2\2\2"+
		"\u0087\u0088\7\"\2\2\u0088\u0089\7/\2\2\u0089\u008a\7\"\2\2\u008a\26\3"+
		"\2\2\2\u008b\u008c\7\"\2\2\u008c\u008d\7\'\2\2\u008d\u008e\7\"\2\2\u008e"+
		"\30\3\2\2\2\u008f\u0090\7?\2\2\u0090\32\3\2\2\2\u0091\u0092\7-\2\2\u0092"+
		"\u0093\7?\2\2\u0093\34\3\2\2\2\u0094\u0095\7/\2\2\u0095\u0096\7?\2\2\u0096"+
		"\36\3\2\2\2\u0097\u0098\7,\2\2\u0098\u0099\7?\2\2\u0099 \3\2\2\2\u009a"+
		"\u009b\7\61\2\2\u009b\u009c\7?\2\2\u009c\"\3\2\2\2\u009d\u009e\7\"\2\2"+
		"\u009e\u009f\7?\2\2\u009f\u00a0\7\"\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7\""+
		"\2\2\u00a2\u00a3\7-\2\2\u00a3\u00a4\7?\2\2\u00a4\u00a5\7\"\2\2\u00a5&"+
		"\3\2\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7/\2\2\u00a8\u00a9\7?\2\2\u00a9"+
		"\u00aa\7\"\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7,\2\2\u00ad"+
		"\u00ae\7?\2\2\u00ae\u00af\7\"\2\2\u00af*\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1"+
		"\u00b2\7\61\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7\"\2\2\u00b4,\3\2\2\2"+
		"\u00b5\u00b6\7*\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8\60\3\2\2\2"+
		"\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7*\2\2\u00bf\62\3\2\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7h\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4\66"+
		"\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7h\2\2\u00c98\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce:\3\2\2\2\u00cf\u00d0\7y\2\2\u00d0"+
		"\u00d1\7j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4<\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2"+
		"\2\u00d8>\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db@\3\2\2\2"+
		"\u00dc\u00dd\7>\2\2\u00ddB\3\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0\7?\2"+
		"\2\u00e0D\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2F\3\2\2\2\u00e3\u00e4\7@\2\2"+
		"\u00e4\u00e5\7?\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7\u00e8\7?\2"+
		"\2\u00e8J\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\7?\2\2\u00ebL\3\2\2\2"+
		"\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7f\2\2\u00efN\3\2\2"+
		"\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7t\2\2\u00f2P\3\2\2\2\u00f3\u00f4\7"+
		"p\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7v\2\2\u00f6R\3\2\2\2\u00f7\u00f9"+
		"\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fbT\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7v\2\2\u00fe"+
		"\u0108\7t\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0108\7v\2\2"+
		"\u0102\u0103\7h\2\2\u0103\u0104\7n\2\2\u0104\u0105\7q\2\2\u0105\u0106"+
		"\7c\2\2\u0106\u0108\7v\2\2\u0107\u00fc\3\2\2\2\u0107\u00ff\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0108V\3\2\2\2\u0109\u010a\t\3\2\2\u010aX\3\2\2\2\u010b"+
		"\u010d\t\4\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010fZ\3\2\2\2\u0110\u0111\5Y-\2\u0111\u0112"+
		"\7\60\2\2\u0112\u0113\5Y-\2\u0113\\\3\2\2\2\u0114\u0117\5_\60\2\u0115"+
		"\u0117\5a\61\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117^\3\2\2\2"+
		"\u0118\u011a\7$\2\2\u0119\u011b\n\5\2\2\u011a\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\7$\2\2\u011f`\3\2\2\2\u0120\u0122\7)\2\2\u0121\u0123\n\6\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7)\2\2\u0127b\3\2\2\2\u0128\u012a"+
		"\t\3\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012cd\3\2\2\2\u012d\u0131\t\7\2\2\u012e\u0130\t\b\2\2"+
		"\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132f\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\t\t\2\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138h\3\2\2\2\u0139\u013b\t\n\2\2\u013a\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\b\65\2\2\u013fj\3\2\2\2\u0140\u0144\7%\2\2\u0141\u0143\n\13\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\b\66\2\2"+
		"\u0148l\3\2\2\2\u0149\u014a\7$\2\2\u014a\u014b\7$\2\2\u014b\u014c\7$\2"+
		"\2\u014c\u0150\3\2\2\2\u014d\u014f\13\2\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7$\2\2\u0154\u0155\7$\2\2\u0155\u0156"+
		"\7$\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\67\2\2\u0158n\3\2\2\2\17\2\u00fa"+
		"\u0107\u010e\u0116\u011c\u0124\u012b\u0131\u0137\u013c\u0144\u0150\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}