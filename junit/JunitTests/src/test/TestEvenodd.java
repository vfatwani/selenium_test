package test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

public class TestEvenodd {
	
	private static Evenodd obj1;
	//Evenodd obj2=new Evenodd(num2);
	String msg;
	int num1;
	
	@Before
	public void beforeclass()
	{   
	 obj1=new Evenodd(num1);
	}
	@Test
	public void even() {
		//msg=obj1.answer(num);
		num1=2;
		assertEquals("even", obj1.answer(num1));
		System.out.println("for even");
	}
	@Test
	public void odd()
	{
		 num1=3;
		assertEquals("odd",obj1.answer(num1));
		System.out.println("for odd");
	}

}

