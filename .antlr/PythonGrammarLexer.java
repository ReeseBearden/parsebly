// Generated from /Users/rylan/Desktop/4450_Parser_Project/parsebly/PythonGrammar.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NEWLINE=13, CAST=14, INT=15, FLOAT=16, STRING=17, 
		ID=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NEWLINE", "CAST", "INT", "FLOAT", "STRING", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'('", "')'", "'print('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NEWLINE", "CAST", "INT", "FLOAT", "STRING", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\6\16L\n\16\r\16\16\16M\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17[\n\17\3\20\6\20^\n\20\r\20\16\20_\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\6\22h\n\22\r\22\16\22i\3\22\3\22\3\23\6\23"+
		"o\n\23\r\23\16\23p\3\24\6\24t\n\24\r\24\16\24u\3\24\3\24\2\2\25\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25\3\2\7\3\2\f\f\3\2\62;\3\2$$\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\2\177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2"+
		"\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\66\3\2\2\2\219\3\2\2\2\23"+
		"<\3\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33K\3\2\2\2\35Z\3\2\2\2"+
		"\37]\3\2\2\2!a\3\2\2\2#e\3\2\2\2%n\3\2\2\2\'s\3\2\2\2)*\7,\2\2*\4\3\2"+
		"\2\2+,\7\61\2\2,\6\3\2\2\2-.\7-\2\2.\b\3\2\2\2/\60\7/\2\2\60\n\3\2\2\2"+
		"\61\62\7?\2\2\62\f\3\2\2\2\63\64\7-\2\2\64\65\7?\2\2\65\16\3\2\2\2\66"+
		"\67\7/\2\2\678\7?\2\28\20\3\2\2\29:\7,\2\2:;\7?\2\2;\22\3\2\2\2<=\7\61"+
		"\2\2=>\7?\2\2>\24\3\2\2\2?@\7*\2\2@\26\3\2\2\2AB\7+\2\2B\30\3\2\2\2CD"+
		"\7r\2\2DE\7t\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2HI\7*\2\2I\32\3\2\2\2JL\t\2"+
		"\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\34\3\2\2\2OP\7u\2\2PQ\7"+
		"v\2\2Q[\7t\2\2RS\7k\2\2ST\7p\2\2T[\7v\2\2UV\7h\2\2VW\7n\2\2WX\7q\2\2X"+
		"Y\7c\2\2Y[\7v\2\2ZO\3\2\2\2ZR\3\2\2\2ZU\3\2\2\2[\36\3\2\2\2\\^\t\3\2\2"+
		"]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2` \3\2\2\2ab\5\37\20\2bc\7\60"+
		"\2\2cd\5\37\20\2d\"\3\2\2\2eg\7$\2\2fh\n\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7$\2\2l$\3\2\2\2mo\t\5\2\2nm\3\2\2\2op\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q&\3\2\2\2rt\t\6\2\2sr\3\2\2\2tu\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\24\2\2x(\3\2\2\2\t\2MZ_ipu\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}