package project;

import java.io.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class brokenlinksidentification_home {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://abordersystem-37196-react-native.b37196.stage.us-east-1.aws.svc.builder.ai/");
		Thread.sleep(3000);
		//Login screen
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("jeenakishore@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Krishna@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/form/div[4]/button/span[1]")).click();
		Thread.sleep(10000);
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\\\selenium\\\\testScreenshot\\\\home.jpeg"));
		
		List<WebElement> Alllinks=driver.findElements(By.tagName("a"));
		Alllinks.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> activelinks =new ArrayList<WebElement>();
	    System.out.println("Total links count--"+Alllinks.size());
		
		
		for (int i=0;i< Alllinks.size();i++)
		{
		System.out.println("All links---->"+ Alllinks.get(i).getAttribute("href"));
		
		//	System.out.println(Alllinks.get(i));
		if(Alllinks.get(i).getAttribute("href")!=null )	
		{
			activelinks.add(Alllinks.get(i));
			//System.out.println(Alllinks.get(i));
			
		}
		}
		System.out.println("Active links count--"+activelinks.size());
		for (int j=0;j<activelinks.size();j++)
		{
			//System.out.println(activelinks.get(j));
			HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			connection.disconnect();
			int  statuscode=connection.getResponseCode();
			String statusmessage=connection.getResponseMessage();
			System.out.println("Active links---->"+ activelinks.get(j).getAttribute("href")+"---->"+statusmessage);
			
			
		}
		if (driver!=null)
			
			{
			driver.quit();
			}
			}
			
	}


