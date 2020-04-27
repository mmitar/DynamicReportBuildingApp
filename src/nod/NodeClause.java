package nod;

import java.util.List;

import com.ICondition;

public class NodeClause
{
	List<ICondition> conditions;
	NodeClause inner;
	NodeClause next;
	double returnValue;
	
	public NodeClause(NodeClause next) {
		this.next = next;
	}
	
	public double evaluate() {
		
		if (!conditions.isEmpty()) {
			
		}
		
		return returnValue;
	}
}