package com;

public class ConditionOperatorEqualTo implements IConditionOperator
{
	private double arg1;
	private double arg2;
	
	public ConditionOperatorEqualTo(double arg1, double arg2)
	{
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	public boolean evaluateCondition() {
		if (this.arg1 == this.arg2)
		{
			return true;
		} else
			return false;
	}
}
