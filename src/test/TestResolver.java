package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.Comparitor;
import com.InvalidOperatorException;

public class TestResolver
{
	private Comparitor comp;
	int bigNumber = 15;
	int smallNumber = 7;
	
	@Before
	public void before()
	{
		comp = new Comparitor();
	}
	
	@Test
	public void validCompareLessThan() throws InvalidOperatorException
	{
		assertTrue(this.comp.compareValuesWithOperator(smallNumber, bigNumber, "<"));
	}
	
	@Test
	public void invalidCompareLessThan() throws InvalidOperatorException
	{
		assertFalse(this.comp.compareValuesWithOperator(bigNumber, smallNumber, "<"));
	}
	
	@Test
	public void validCompareGreaterThan() throws InvalidOperatorException
	{
		assertTrue(this.comp.compareValuesWithOperator(bigNumber, smallNumber, ">"));
	}
	
	@Test
	public void invalidCompareGreaterThan() throws InvalidOperatorException
	{
		assertFalse(this.comp.compareValuesWithOperator(smallNumber, bigNumber, ">"));
	}
	
	@Test
	public void validCompareEqualTo() throws InvalidOperatorException
	{
		assertTrue(this.comp.compareValuesWithOperator(bigNumber, bigNumber, "=="));
	}
	
	@Test
	public void invalidCompareEqualTo() throws InvalidOperatorException
	{
		assertFalse(this.comp.compareValuesWithOperator(bigNumber, smallNumber, "=="));
	}
}
