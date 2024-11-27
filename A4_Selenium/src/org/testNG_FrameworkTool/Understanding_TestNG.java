package org.testNG_FrameworkTool;

import org.testng.annotations.Test;

public class Understanding_TestNG
{
	//avoid main() method--use @Test in place of it
	//if we don't add priority, it will execute  alphabeticly as per given name of method
	
	@Test
	public void test3()
	{
		System.out.println("Hello Test-3");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Hello Test-1");
	}

	@Test
	public void test2()
	{
		System.out.println("Hello Test-2");
	}
}
