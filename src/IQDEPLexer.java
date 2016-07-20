// Generated from IQDEP.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IQDEPLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, KW_ON=5, KW_SELECT=6, KW_WITHIN=7, KW_RADIUS=8, 
		KW_KNN=9, KW_FROM=10, KW_WHERE=11, KW_AND=12, KW_OR=13, LPAREN=14, RPAREN=15, 
		COMMA=16, STAR=17, ID=18, NEWLINE=19, SPACES=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<>'", "'!='", "'=='", "'='", "'on'", "KW_SELECT", "'within'", "'radius'", 
		"KW_KNN", "'from'", "'where'", "'&'", "'|'", "'('", "')'", "','", "'*'", 
		"ID", "NEWLINE", "SPACES"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "KW_ON", "KW_SELECT", "KW_WITHIN", "KW_RADIUS", 
		"KW_KNN", "KW_FROM", "KW_WHERE", "KW_AND", "KW_OR", "LPAREN", "RPAREN", 
		"COMMA", "STAR", "ID", "NEWLINE", "SPACES"
	};


	public IQDEPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IQDEP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19: SPACES_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SPACES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\26\u0084\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7F\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\6\23x\n\23\r\23\16\23y\3\24\5\24}\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\2\26\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b"+
		"\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1"+
		"!\22\1#\23\1%\24\1\'\25\1)\26\2\3\2\4\5\62;C\\c|\5\13\r\17\17\"\"\u0088"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2\2\7\61\3\2"+
		"\2\2\t\64\3\2\2\2\13\66\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21N\3\2\2\2\23"+
		"]\3\2\2\2\25_\3\2\2\2\27d\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2"+
		"\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%w\3\2\2\2\'|\3\2\2\2)\u0080\3\2\2\2+"+
		",\7>\2\2,-\7@\2\2-\4\3\2\2\2./\7#\2\2/\60\7?\2\2\60\6\3\2\2\2\61\62\7"+
		"?\2\2\62\63\7?\2\2\63\b\3\2\2\2\64\65\7?\2\2\65\n\3\2\2\2\66\67\7q\2\2"+
		"\678\7p\2\28\f\3\2\2\29:\7u\2\2:;\7g\2\2;<\7n\2\2<=\7g\2\2=>\7e\2\2>F"+
		"\7v\2\2?@\7U\2\2@A\7G\2\2AB\7N\2\2BC\7G\2\2CD\7E\2\2DF\7V\2\2E9\3\2\2"+
		"\2E?\3\2\2\2F\16\3\2\2\2GH\7y\2\2HI\7k\2\2IJ\7v\2\2JK\7j\2\2KL\7k\2\2"+
		"LM\7p\2\2M\20\3\2\2\2NO\7t\2\2OP\7c\2\2PQ\7f\2\2QR\7k\2\2RS\7w\2\2ST\7"+
		"u\2\2T\22\3\2\2\2UV\7m\2\2VW\7P\2\2W^\7P\2\2XY\7M\2\2YZ\7P\2\2Z^\7P\2"+
		"\2[\\\7p\2\2\\^\7p\2\2]U\3\2\2\2]X\3\2\2\2][\3\2\2\2^\24\3\2\2\2_`\7h"+
		"\2\2`a\7t\2\2ab\7q\2\2bc\7o\2\2c\26\3\2\2\2de\7y\2\2ef\7j\2\2fg\7g\2\2"+
		"gh\7t\2\2hi\7g\2\2i\30\3\2\2\2jk\7(\2\2k\32\3\2\2\2lm\7~\2\2m\34\3\2\2"+
		"\2no\7*\2\2o\36\3\2\2\2pq\7+\2\2q \3\2\2\2rs\7.\2\2s\"\3\2\2\2tu\7,\2"+
		"\2u$\3\2\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z&\3\2\2"+
		"\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\f\2\2\177(\3\2\2\2"+
		"\u0080\u0081\t\3\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\25\2\2\u0083*\3"+
		"\2\2\2\7\2E]y|";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}