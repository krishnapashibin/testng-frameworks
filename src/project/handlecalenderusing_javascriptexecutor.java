package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlecalenderusing_javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(10000);
		driver.manage().window().maximize();
		WebElement element=	driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]/div[1]"));
		String dateval="Fri, 20 May 2022";
		setdateval(driver,element,dateval);
		
	}
	public static void setdateval(WebDriver driver,WebElement element,String dateval)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
	}

}
