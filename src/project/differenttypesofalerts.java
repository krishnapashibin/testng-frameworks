package project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class differenttypesofalerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		
		//Simple alert
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		driver.switchTo().alert().accept();  
		
		//gettext
		
		String text=driver.switchTo().alert().getText();  
		System.out.println(text);
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		
		
		driver.switchTo().alert().sendKeys("Text");  
		
		
	}

}
