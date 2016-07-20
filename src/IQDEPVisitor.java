// Generated from IQDEP.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface IQDEPVisitor<T> extends ParseTreeVisitor<T> {
	T visitSequenceEvents(IQDEPParser.SequenceEventsContext ctx);

	T visitPredicates(IQDEPParser.PredicatesContext ctx);

	T visitSelect_statment(IQDEPParser.Select_statmentContext ctx);

	T visitColumn_name(IQDEPParser.Column_nameContext ctx);

	T visitSingleEvent(IQDEPParser.SingleEventContext ctx);

	T visitEvent_name(IQDEPParser.Event_nameContext ctx);

	T visitColumn_core(IQDEPParser.Column_coreContext ctx);
}