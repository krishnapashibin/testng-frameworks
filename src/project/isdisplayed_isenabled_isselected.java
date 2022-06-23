package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed_isenabled_isselected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		boolean b1=driver.findElement(By.name("action")).isDisplayed();//web element is displeyed or not,will return true /false 
		
		boolean b2=driver.findElement(By.name("action")).isEnabled();//for buttons to check if enabled or not
		boolean b3=driver.findElement(By.name("action")).isSelected();//radio button,checkbox,dropdowns to check if selcetd or not ,eg for this sometimes submit button will be enabled only when terms and conditions checkbox is seleted 

				
	}

}