package testNGpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidertest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
								
	}
	
	//method 1 using dataprovide
	
/*	@DataProvider
	public Object[][] dataset() {
		Object[][] data=new Object[2][2] ;
		data[0][0]="Krishna";
		data[0][1]="Krishna@123";
		data[1][0]="Krishnatest";
		data[1][1]="Krishna@123test";
		return data;
		
	}
	
	//method 2 using dataprovide
	@DataProvider
	public Object[][] dataset2() {
		return new Object[][] {
			{"Krishna","Krishna@123"},
			{"Krishnatest","Krishna@123test"}
		};
		}*/
		
		
	
	@Test(dataProvider="dataset2",dataProviderClass=daraproviderdatasetclass.class)
	public void loginpage(String firstname,String Lastname) {
		
		
		driver.findElement(By.name("email")).sendKeys(firstname);
		driver.findElement(By.name("pass")).sendKeys(Lastname);
	/*driver.findElement(By.name("reg_email__")).sendKeys("56476585");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Krishna@123");
		Select s1=new Select(driver.findElement(By.name("birthday_day")));
		s1.selectByValue("9");
		Select s2=new Select(driver.findElement(By.name("birthday_month")));
		s2.selectByValue("Jun");
		Select s3=new Select(driver.findElement(By.name("birthday_year")));
		s3.selectByValue("2022");
		if (sex.equals("Female")) {
		WebElement r1 = driver.findElement(By.xpath("//input[@value='1']"));
        r1.click();
		}
		else if(sex.equals("Male")) {
			WebElement r2 = driver.findElement(By.xpath("//input[@value='2']"));
	        r2.click();
			}*/
	
		
	}
	

}
