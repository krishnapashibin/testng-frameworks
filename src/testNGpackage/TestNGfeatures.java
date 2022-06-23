package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGfeatures {
	WebDriver driver;
	
	
	@Test
	public void loginpage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		
		Thread.sleep(10000);
		driver.manage().window().maximize();
	
	driver.findElement(By.name("email")).sendKeys("Krishna.anand@rubyians.com");
	driver.findElement(By.name("password")).sendKeys("Krishna@12");
	driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	Thread.sleep(3000);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/i"))).build().perform();
	Thread.sleep(5000);
	
	}
	@Test(dependsOnMethods="loginpage")
	public void homepage() throws InterruptedException{
		System.out.println("login ");
	}
	
	

}
