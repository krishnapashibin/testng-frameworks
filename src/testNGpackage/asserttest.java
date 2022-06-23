package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class asserttest {
	WebDriver driver;
	@Test
	public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe\\");	
	driver=new ChromeDriver();
	driver.get("https://ui.freecrm.com/");
	
	Thread.sleep(10000);
	driver.manage().window().maximize();
	String title=driver.getTitle();
	Assert.assertEquals(title,"freecrm","Title doesn't match");
	
	}

}
