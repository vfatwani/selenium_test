package test;

import org.junit.runners.Parameterized;
import org.junit.runners.parameterized.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.*;
//import java.lang.*;

@RunWith(Parameterized.class)
public class PrimeNumberTest 
{ 
	private PrimeNumber primenb; //object
	private boolean expected;
	private Integer inputnb;
	
	@Before 
	public void Beforecheck()
	{
		primenb=new PrimeNumber();
	}
	
	
	public PrimeNumberTest(Integer inputnb,boolean expected)
	{
		this.inputnb=inputnb;
		this.expected=expected;
	}
	@Parameterized.Parameters
	public static Collection Primenb()
	{
		return Arrays.asList(new Object[][]
				{
			{ 2,true },
			{ 3,true },
			{ 4,false },
		    { 6,false },
			{ 7,true }
				
	});
}
	@Test 
	public void testprimenb()
	{
	System.out.println("paramnb is"+inputnb);
	assertEquals(expected, primenb.checker(inputnb));
	}
	
	

/*	@Test
	public void prime()
	{
		inputnb=5;
		
	 	assertEquals(true,primenb.checker(inputnb));
		System.out.println("is primenumber");
	}
	
	@Test
	public void notprime()
	{ 
		inputnb=4;
		
		assertEquals(false,primenb.checker(inputnb));
		System.out.println("is not primenumber");
	}*/
	
}
