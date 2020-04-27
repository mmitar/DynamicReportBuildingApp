package unimpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.IConditionOperator;
import com.InvalidOperatorException;
import com.ConditionOperatorBase;

/*
 * Creater / Builder Pattern
 */
public class ConditionBuilder
{
	double arg1;
	double arg2;
	String operator;
	
	public ConditionBuilder argumentOne(double arg)
	{
		this.arg1 = arg;
		return this;
	}
	
	public ConditionBuilder argumentTwo(double arg)
	{
		this.arg2 = arg;
		return this;
	}
	
	public ConditionBuilder operator(String op)
	{
		this.operator = op;
		return this;
	}
	
	public IConditionOperator create() throws InvalidOperatorException
	{
		return ConditionOperatorBase.createOperatorCondition(this.arg1, this.arg2, this.operator);
	}
	
	private boolean isNumeric(String value)
	{
		if (value == null)
		{
			return false;
		}
		try
		{
			double d = Double.parseDouble(value);
		} catch (NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}
	
	private boolean isDate(String value, String dateFormat)
	{
		DateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setLenient(false);
		try
		{
			sdf.parse(value);
		} catch (ParseException e)
		{
			return false;
		}
		return true;
	}
}
