package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownusingselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Baby");
		
		
	}

}
