package com;

public class ConditionOperatorGreaterThan implements IConditionOperator
{
	private double arg1;
	private double arg2;
	
	public ConditionOperatorGreaterThan(double arg1, double arg2)
	{
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	public boolean evaluateCondition() {
		
		/*
		 *  If (NodeValueType = 'NUMBER' || NodeValueType = 'DATE') {
		 */
		if (this.arg1 > this.arg2)
		{
			return true;
		} else
			return false;
		
		/*
		 * }
		 * 
		 * Throw new InvalidOperatorException("Invalid Operator for String types Node.name");
		 */
	}
}
