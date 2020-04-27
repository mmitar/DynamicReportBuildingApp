package com;

public class Comparitor
{
	public ICondition condition;
//	public IResult result;
	
	
	
//	public boolean compareValuesWithOperator(double arg1, double arg2, String operator) throws InvalidOperatorException {
//		IOperatorCondition condition = new ConditionBuilder().argumentOne(arg1).argumentTwo(arg2).operator(operator).create();
//		return condition.evaluateCondition();
//	}
//	
	
//	public Object R
	
	public boolean compareValuesWithOperator(double arg1, double arg2, String operator) throws InvalidOperatorException {
		IConditionOperator condition = new ConditionBuilder().argumentOne(arg1).argumentTwo(arg2).operator(operator).create();
		return condition.evaluateCondition();
	}
}