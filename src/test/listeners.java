package test;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class listeners implements ITestListener{
	


	@Test
	public void display()
	{
		System.out.println("Hello Listeners");
		//Assert.assertTrue(false);
	}
	
	public void onTestFailure(ITestResult results)
	{
		System.out.println("Failed to execute the test"+results.getName());
	}
}
