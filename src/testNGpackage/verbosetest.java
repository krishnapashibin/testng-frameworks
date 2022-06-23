package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verbosetest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		driver=new ChromeDriver();
		
		
	}
	
	@Test
	public void fbtitle() {
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebbok");
		
	}
	
	@Test
	public void fbtitle2() {
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebbok");
		
	}
	
	@Test
	public void fbtitle3() {
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebbok");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
