package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dynamicwebtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("Krishna.anand@rubyians.com");
		driver.findElement(By.name("password")).sendKeys("Krishna@123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/i"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/span")).click();
		///html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
		///html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
		Thread.sleep(2000);
		//method 1

String beforexpath="html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[";
String afterxpath="]/td[2]/a";
String elem="krishna P Anand";
for(int i=1;i<=2;i++)
{
	if(driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText().equals(elem))
	{
		///html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[1]
		WebElement elem5=driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr["+i+"]/td[1]"));
		//Actions action1=new Actions(driver);
		//action1.moveToElement(driver.findElement(By.xpath("\"html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[\"+i+\"]/td[1]\""))).build().perform();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click()", elem5);
	}
	
	
}
		
				
				//method 2
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement elem5=driver.findElement(By.xpath("//a[contains(text(),'krishna P Anand')]/parent::td//preceding::td//div//input[@name='id']"));
		js.executeScript("arguments[0].click()", elem5);
			
			
	}

}
