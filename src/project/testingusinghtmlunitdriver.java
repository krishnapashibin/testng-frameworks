package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class testingusinghtmlunitdriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		String loginscreentitle=driver.getTitle();
		System.out.println("Login title:"+loginscreentitle);
		driver.get("https://abordersystem-37196-react-native.b37196.stage.us-east-1.aws.svc.builder.ai/");
		driver.findElement(By.name("email")).sendKeys("jeenakishore@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Krishna@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/form/div[4]/button/span[1]")).click();
		String homescreentitle=driver.getTitle();
		System.out.println("homescreen title:"+homescreentitle);
		

	}

}
