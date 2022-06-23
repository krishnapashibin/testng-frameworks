package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class customxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		Select select=new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Books");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		if (driver!=null)
		{
			driver.close();
		}
		//driver.get("https://www.ebay.com/");
		//dynamic id handling
		//driver.findElement(By.xpath("//input[contains(@id,'gh-btn')]")).click();
		//driver.findElement(By.xpath("//input[starts-with(@id,'gh-btn')]")).click();
		
	}

}
