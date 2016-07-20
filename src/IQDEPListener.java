// Generated from IQDEP.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface IQDEPListener extends ParseTreeListener {
	void enterSequenceEvents(IQDEPParser.SequenceEventsContext ctx);
	void exitSequenceEvents(IQDEPParser.SequenceEventsContext ctx);

	void enterPredicates(IQDEPParser.PredicatesContext ctx);
	void exitPredicates(IQDEPParser.PredicatesContext ctx);

	void enterSelect_statment(IQDEPParser.Select_statmentContext ctx);
	void exitSelect_statment(IQDEPParser.Select_statmentContext ctx);

	void enterColumn_name(IQDEPParser.Column_nameContext ctx);
	void exitColumn_name(IQDEPParser.Column_nameContext ctx);

	void enterSingleEvent(IQDEPParser.SingleEventContext ctx);
	void exitSingleEvent(IQDEPParser.SingleEventContext ctx);

	void enterEvent_name(IQDEPParser.Event_nameContext ctx);
	void exitEvent_name(IQDEPParser.Event_nameContext ctx);

	void enterColumn_core(IQDEPParser.Column_coreContext ctx);
	void exitColumn_core(IQDEPParser.Column_coreContext ctx);
}