package com;

public abstract class ConditionOperatorBase implements ICondition
{
//	public abstract boolean evaluateCondition();
//	public abstract boolean decorateExpression();
	
	public static IConditionOperator createOperatorCondition(double arg1, double arg2, String operator)
	        throws InvalidOperatorException
	{
		if (isGreaterThanOperator(operator))
		{
			return new ConditionOperatorGreaterThan(arg1, arg2);
		}
		if (isLessThanOperator(operator))
		{
			return new ConditionOperatorLessThan(arg1, arg2);
		}
		if (isEqualToNumericOperator(operator))
		{
			return new ConditionOperatorEqualTo(arg1, arg2);
		}
		
		throw new InvalidOperatorException("Invalid Operator: '" + operator + "'");
	}
	
	// Trying to introduce Strings as values.
	public static IConditionOperator createCharacterOperatorCondition(String arg1, String arg2, String operator)
	        throws InvalidOperatorException
	{
		Object okay = null;
		return null;
	}
	
	private static boolean isGreaterThanOperator(String operator)
	{
		return operator.equals(">");
	}
	
	private static boolean isLessThanOperator(String operator)
	{
		return operator.equals("<");
	}
	
	private static boolean isEqualToNumericOperator(String operator)
	{
		return operator.equals("=");
	}
	
	private static boolean isd(String operator)
	{
		return false;
	}
}