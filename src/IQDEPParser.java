// Generated from IQDEP.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IQDEPParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, KW_ON=5, KW_SELECT=6, KW_WITHIN=7, KW_RADIUS=8, 
		KW_KNN=9, KW_FROM=10, KW_WHERE=11, KW_AND=12, KW_OR=13, LPAREN=14, RPAREN=15, 
		COMMA=16, STAR=17, ID=18, NEWLINE=19, SPACES=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'<>'", "'!='", "'=='", "'='", "'on'", "KW_SELECT", "'within'", 
		"'radius'", "KW_KNN", "'from'", "'where'", "'&'", "'|'", "'('", "')'", 
		"','", "'*'", "ID", "NEWLINE", "SPACES"
	};
	public static final int
		RULE_select_statment = 0, RULE_column_name = 1, RULE_column_core = 2, 
		RULE_conditions = 3, RULE_on_core = 4, RULE_event_name = 5;
	public static final String[] ruleNames = {
		"select_statment", "column_name", "column_core", "conditions", "on_core", 
		"event_name"
	};

	@Override
	public String getGrammarFileName() { return "IQDEP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public IQDEPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Select_statmentContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode KW_FROM() { return getToken(IQDEPParser.KW_FROM, 0); }
		public TerminalNode KW_WHERE() { return getToken(IQDEPParser.KW_WHERE, 0); }
		public TerminalNode KW_SELECT() { return getToken(IQDEPParser.KW_SELECT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public On_coreContext on_core() {
			return getRuleContext(On_coreContext.class,0);
		}
		public Select_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).enterSelect_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).exitSelect_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IQDEPVisitor ) return ((IQDEPVisitor<? extends T>)visitor).visitSelect_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statmentContext select_statment() throws RecognitionException {
		Select_statmentContext _localctx = new Select_statmentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_select_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(KW_SELECT);
			setState(13); column_name();
			setState(14); match(KW_FROM);
			setState(15); on_core();
			setState(18);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(16); match(KW_WHERE);
				setState(17); conditions();
				}
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

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(IQDEPParser.STAR, 0); }
		public Column_coreContext column_core() {
			return getRuleContext(Column_coreContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IQDEPVisitor ) return ((IQDEPVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_column_name);
		try {
			setState(22);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); match(STAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); column_core();
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

	public static class Column_coreContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IQDEPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IQDEPParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(IQDEPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IQDEPParser.ID, i);
		}
		public Column_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).enterColumn_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).exitColumn_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IQDEPVisitor ) return ((IQDEPVisitor<? extends T>)visitor).visitColumn_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_coreContext column_core() throws RecognitionException {
		Column_coreContext _localctx = new Column_coreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_column_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(ID);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(25); match(COMMA);
				setState(26); match(ID);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	 
		public ConditionsContext() { }
		public void copyFrom(ConditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicatesContext extends ConditionsContext {
		public List<TerminalNode> ID() { return getTokens(IQDEPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IQDEPParser.ID, i);
		}
		public PredicatesContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).enterPredicates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).exitPredicates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IQDEPVisitor ) return ((IQDEPVisitor<? extends T>)visitor).visitPredicates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditions);
		int _la;
		try {
			_localctx = new PredicatesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(ID);
			setState(33);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(34); match(ID);
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

	public static class On_coreContext extends ParserRuleContext {
		public On_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_core; }
	 
		public On_coreContext() { }
		public void copyFrom(On_coreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SequenceEventsContext extends On_coreContext {
		public List<TerminalNode> COMMA() { return getTokens(IQDEPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IQDEPParser.COMMA, i);
		}
		public Event_nameContext event_name(int i) {
			return getRuleContext(Event_nameContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(IQDEPParser.LPAREN, 0); }
		public List<Event_nameContext> event_name() {
			return getRuleContexts(Event_nameContext.class);
		}
		public TerminalNode RPAREN() { return getToken(IQDEPParser.RPAREN, 0); }
		public SequenceEventsContext(On_coreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).enterSequenceEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).exitSequenceEvents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IQDEPVisitor ) return ((IQDEPVisitor<? extends T>)visitor).visitSequenceEvents(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleEventContext extends On_coreContext {
		public Event_nameContext event_name() {
			return getRuleContext(Event_nameContext.class,0);
		}
		public SingleEventContext(On_coreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).enterSingleEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).exitSingleEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IQDEPVisitor ) return ((IQDEPVisitor<? extends T>)visitor).visitSingleEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_coreContext on_core() throws RecognitionException {
		On_coreContext _localctx = new On_coreContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_on_core);
		int _la;
		try {
			setState(48);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new SingleEventContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36); event_name();
				}
				break;
			case LPAREN:
				_localctx = new SequenceEventsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37); match(LPAREN);
				setState(38); event_name();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(39); match(COMMA);
					setState(40); event_name();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46); match(RPAREN);
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

	public static class Event_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IQDEPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IQDEPParser.ID, i);
		}
		public Event_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).enterEvent_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IQDEPListener ) ((IQDEPListener)listener).exitEvent_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IQDEPVisitor ) return ((IQDEPVisitor<? extends T>)visitor).visitEvent_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_nameContext event_name() throws RecognitionException {
		Event_nameContext _localctx = new Event_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_event_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(ID);
			setState(52);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(51); match(ID);
				}
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

	public static final String _serializedATN =
		"\2\3\269\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\25\n\2\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\7\4\36\n\4\f\4\16"+
		"\4!\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6,\n\6\f\6\16\6/\13\6\3"+
		"\6\3\6\5\6\63\n\6\3\7\3\7\5\7\67\n\7\3\7\2\b\2\4\6\b\n\f\2\3\3\3\68\2"+
		"\16\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\"\3\2\2\2\n\62\3\2\2\2\f\64\3"+
		"\2\2\2\16\17\7\b\2\2\17\20\5\4\3\2\20\21\7\f\2\2\21\24\5\n\6\2\22\23\7"+
		"\r\2\2\23\25\5\b\5\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26\31\7"+
		"\23\2\2\27\31\5\6\4\2\30\26\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\37\7"+
		"\24\2\2\33\34\7\22\2\2\34\36\7\24\2\2\35\33\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\37\3\2\2\2\"#\7\24\2\2#$\t\2\2\2$%\7"+
		"\24\2\2%\t\3\2\2\2&\63\5\f\7\2\'(\7\20\2\2(-\5\f\7\2)*\7\22\2\2*,\5\f"+
		"\7\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60"+
		"\61\7\21\2\2\61\63\3\2\2\2\62&\3\2\2\2\62\'\3\2\2\2\63\13\3\2\2\2\64\66"+
		"\7\24\2\2\65\67\7\24\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67\r\3\2\2\2\b\24"+
		"\30\37-\62\66";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}