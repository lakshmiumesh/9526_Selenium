package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;

public class test1 {

	@Parameters({"url"})
	@Test()
	public void zfirstDemo(String web) 
	{
		System.out.println("test1-firstDemo-----"+web);
	}
	
	
	@Test(groups= {"Smoke"})
	public void secondDemo() 
	{
		System.out.println("test1-secondDemo");
		Assert.assertTrue(false);
	}

}
