package nod;

/*
 * Base Decorator
 */
public abstract class NodeFunctionBase
{
	private INode node;
	
	public NodeFunctionBase(INode node) {
		this.node = node;
	}
	
	public INode evaluateNode() {
		return node;
	}
}
