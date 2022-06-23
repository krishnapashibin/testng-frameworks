package project;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class aborder {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(7000);
		WebElement user=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/p[1]"));
	    Assert.assertEquals(user.getText(),"Good Afternoon, jeena!");
	    System.out.println("User logged in successfully ");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/div/div[5]/a/div/div[2]/span")).click();
		Boolean result = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div/div[3]/div/div[2]/div[1]/div/span")).isDisplayed();
		System.out.println(result);
		driver.quit();

	}

}
