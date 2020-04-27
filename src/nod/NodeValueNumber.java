package nod;

public class NodeValueNumber implements INode
{
	int number;

	@Override
	public INode evaluateNode()
	{
		return this;
	}
}
