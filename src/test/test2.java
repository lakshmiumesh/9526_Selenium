package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {

	@Test
	public void test2FirstDemo() 
	{
		System.out.println("test2-firstDemo");
	}
	
	@Test(groups= {"Smoke"})
	public void test2SecondDemo() 
	{
		System.out.println("test2-secondDemo");
		Assert.assertTrue(false);
	}

}

