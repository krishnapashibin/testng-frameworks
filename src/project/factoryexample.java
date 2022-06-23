package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class factoryexample {
	private String firstname="";
	private String Lastname="";
	public static WebDriver driver;
	public factoryexample(String firstname,String Lastname){
		this.firstname=firstname;
		this.Lastname=Lastname;
		
	}
	
	@BeforeClass
	public void setUp() {
		
		
	}
		@Test
		public void loginpage() throws InterruptedException{
				
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
			 driver=new ChromeDriver();
			driver.get("https://ui.freecrm.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(firstname);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Lastname);

		}
			
			
			@Test
			public void login2() throws InterruptedException {
					
				
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys(firstname);
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Lastname);

			}
			
			@AfterClass
			public void tearDown() {
				driver.quit();
			}
			
		
	}

