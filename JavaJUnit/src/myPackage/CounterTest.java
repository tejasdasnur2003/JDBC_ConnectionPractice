package myPackage;

import org.junit.jupiter.api.Test;

public class CounterTest extends junit.framework.TestCase {
	MyCounter m=new MyCounter();
	@Test
	public void TestIncrement() {
		System.out.println("---1---");
		assertTrue(m.increment()==1);
		assertTrue(m.increment()==2);
		assertTrue(m.increment()==3);
		System.out.println("---2---");
	}
	@Test
	public void myMethod()
	{
		System.out.println("---myMethod---");
	}
	
}
