package testNGpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngframework2 {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
	}
	
	@Test(priority=1,groups="title")
	public void gettile()
	{
		driver.getTitle();
	}
	
	@Test(priority=3,groups="search")
	public void enterURL1()
	{
		driver.findElement(By.name("q")).sendKeys("search");
	}
	@Test(priority=2,groups="print")
	public void enterURL2()
	{
		System.out.println("Hi");
	}
	@Test(priority=4,groups="print")
	public void enterURL3()
	{
		System.out.println("Hi 2");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
