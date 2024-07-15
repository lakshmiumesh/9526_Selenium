package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {
	
	
	@Test
	public void test3FirstDemo() 
	{
		System.out.println("test3-firstDemo");
	}
	
	@Parameters({"url"})
	@Test
	public void test3SecondDemo(String web) 
	{
		System.out.println("test3-secondDemo-----------"+web);
	}
	
	@BeforeTest
	public void preRequest() 
	{
		System.out.println("I  will execute first---@BeforeTest");
	}
	
	@BeforeMethod
	public void b4_method() 
	{
		System.out.println("b4_method test4");
	}

}