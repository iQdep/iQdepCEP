import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class IDEAPVisitor implements IQDEPVisitor{

	@Override
	public Object visit(ParseTree parseTree) {
		return null;
	}

	@Override
	public Object visitChildren(RuleNode ruleNode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitErrorNode(ErrorNode errorNode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTerminal(TerminalNode terminalNode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitSequenceEvents(IQDEPParser.SequenceEventsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitPredicates(IQDEPParser.PredicatesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitSelect_statment(IQDEPParser.Select_statmentContext ctx) {
		
		return null;
	}

	@Override
	public Object visitColumn_name(IQDEPParser.Column_nameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitSingleEvent(IQDEPParser.SingleEventContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitEvent_name(IQDEPParser.Event_nameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitColumn_core(IQDEPParser.Column_coreContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
