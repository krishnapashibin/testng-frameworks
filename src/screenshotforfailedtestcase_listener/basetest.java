package screenshotforfailedtestcase_listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basetest {
	
	public static WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void login(){
		
		driver.get("https://www.ebay1.com");
	}

}
