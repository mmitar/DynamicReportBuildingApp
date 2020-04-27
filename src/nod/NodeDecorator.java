package nod;

/*
 * Base Decorator
 */
public abstract class NodeDecorator implements INode
{
	protected INode node;
	
	public NodeDecorator(INode node) {
		this.node = node;
	}
	
	public INode evaluateNode() {
		return node;
	}
}
