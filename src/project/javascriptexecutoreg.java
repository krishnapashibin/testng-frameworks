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

public class javascriptexecutoreg {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Krishnapanand123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Krishna@123");
		WebElement Loginbutton=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		
		drawborder( Loginbutton, driver);
		Thread.sleep(2000);
		filexists(driver);
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("alert('screenshot created by highlighting error');");
		
		
		
		
	}
	public static void drawborder(WebElement element,WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor) driver);
	js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void filexists(WebDriver driver) throws IOException 
	{
		  String downloadPath="C:\\selenium\\testScreenshot\\";
		  String fileName="bordertest.png";
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {
		          // File has been found, it can now be deleted:
		    	  File src=((TakesScreenshot)  driver).getScreenshotAs(OutputType.FILE);
		    	  FileUtils.copyFile(src,new File("C:\\selenium\\testScreenshot\\bordertest1.png"));
		          
		      }
		        
		          }
		     
		  }
}
