package main;

import com.Comparitor;

public class ResolverMain
{
	public static void main(String[] args) throws Exception
	{
		int one = 4;
		int two = 4;
		String operator = "d";
		
		Comparitor comp = new Comparitor();
		boolean result = comp.compareValuesWithOperator(one, two, operator);
		System.out.println("Result: " + result);
	}
}
