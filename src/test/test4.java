package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test4 {

	@Test(dataProvider = "getData")
	public void test4FirstDemo(int param1, int param2) 
	{
		System.out.println("test4-firstDemo");
		System.out.println("param1="+param1);
		System.out.println("param1="+param2);
	}
	
	@Test
	public void test4SecondDemo() 
	{
		System.out.println("test4-secondDemo");
	}
	
	@AfterTest
	public void Last() 
	{
		System.out.println("I will execute last");
	}
	
	@BeforeSuite
	public void before_suite() 
	{
		System.out.println("I will be the first");
	}
	
	@AfterSuite
	public void after_suite() 
	{
		System.out.println("I will be the first from last");
	}
	
	@BeforeMethod
	public void b4_method() 
	{
		System.out.println("b4_method test4");
	}
	
	@AfterMethod
	public void after_method() 
	{
		System.out.println("aftrer_method test4");
	}
	
	@DataProvider
	
	public Object[][]  getData()
	{
		Object[][] data = new Object[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				data[i][j] = i+j;
			}
		}
		return data;
	}
		
}

