// Generated from IQDEP.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class IQDEPBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements IQDEPVisitor<T> {
	@Override public T visitSequenceEvents(IQDEPParser.SequenceEventsContext ctx) { return visitChildren(ctx); }

	@Override public T visitPredicates(IQDEPParser.PredicatesContext ctx) { return visitChildren(ctx); }

	@Override public T visitSelect_statment(IQDEPParser.Select_statmentContext ctx) { return visitChildren(ctx); }

	@Override public T visitColumn_name(IQDEPParser.Column_nameContext ctx) { return visitChildren(ctx); }

	@Override public T visitSingleEvent(IQDEPParser.SingleEventContext ctx) { return visitChildren(ctx); }

	@Override public T visitEvent_name(IQDEPParser.Event_nameContext ctx) { return visitChildren(ctx); }

	@Override public T visitColumn_core(IQDEPParser.Column_coreContext ctx) { return visitChildren(ctx); }
}