package project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopupshandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.get("https://keralavisionisp.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Customer Login")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator it=handler.iterator();
		String parentwindId=(String) it.next();
		String childwindId=(String) it.next();
		driver.switchTo().window(childwindId);
		Thread.sleep(3000);
		String childwindowtitle=driver.getTitle();
		System.out.println("Childwindow Title"+childwindowtitle);
		driver.close();
		driver.switchTo().window(parentwindId);
		String parentwindowtitle=driver.getTitle();
		System.out.println("parentwindow Title"+parentwindowtitle);
		driver.quit();
		
		
		
		
		
		
		//driver.findElement(By.linkText("https://www.popupcheck.com/freescan/popup/test_load.asp")).click();
		
		

	}

}
