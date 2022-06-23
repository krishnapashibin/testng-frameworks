package project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutormore {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(10000);
		driver.manage().window().maximize();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//To scrolldown to bottom of page
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement elem=driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/h3"));
		//scroll untill particular element is visible
		//js.executeScript("arguments[0].scrollIntoView();", elem);
		js.executeScript("arguments[0].style.border='3px solid green'",elem);
		File src=((TakesScreenshot)  driver).getScreenshotAs(OutputType.FILE);
  	  FileUtils.copyFile(src,new File("C:\\selenium\\testScreenshot\\bordertest1.png"));
  	  //
		 

	}

}
