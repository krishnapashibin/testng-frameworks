package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngframeworktest1 {
	@BeforeSuite
	public void setup()
	{
		System.out.println("Setting up chrome");
	}
	@BeforeTest
	public void launch()
	{
		System.out.println("lauch chrome");
	}
	@BeforeClass
	public void login()
	{
		System.out.println("Enter URL");
	}
	@BeforeMethod
	public void details()
	{
		System.out.println("Enter user name and password");
	}
	@Test
	public void test1()
	{
		System.out.println("Print header");
	}
	@Test
	public void test2()
	{
		System.out.println("prit title of page");
	}
	@AfterMethod
	public void deletcookies()
	
	{
		System.out.println("delete cookies");
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("close chrome");
	}
}
