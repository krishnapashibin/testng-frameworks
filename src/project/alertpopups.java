package project;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class alertpopups {

	public static void main(String[] args) throws InterruptedException, IOException {

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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div/div[5]/a/div/div[2]/span")).click();
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\\\selenium\\\\testScreenshot\\\\home.jpeg"));
		//project creation
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Thread.sleep(20000);
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/button/span[1]")).click();
		driver.switchTo().alert();
		driver.findElement(By.name("title")).sendKeys("test task 588");
		driver.findElement(By.xpath("//*[@id=\"fixed-tags-demo\"]")).sendKeys("Jibin babu");
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/form/div[2]/button[1]/span[1]")).click();
		System.out.println("project created successfully");
		//Task creation
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div/div[4]/div/div[2]/div[1]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div[2]/div[3]/div/div/div/div/ul/div/div[1]/ul/div/button")).click();
		driver.switchTo().alert();
		
		driver.findElement(By.id("outlined-basic")).sendKeys("testtask 123");
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-outlined\"]"));
		List<WebElement> assetcategorylist=driver.findElements(By.xpath("//ul[contains(@class,'MuiList-root MuiMenu-list MuiList-padding')]//li"));
		for(int i=0;i<assetcategorylist.size();i++)
		{
			if(assetcategorylist.get(i).getText()=="facebook ad")
			{
				assetcategorylist.get(i).click();
				break;
			}
				
		}
		
	    
		

	}

}
