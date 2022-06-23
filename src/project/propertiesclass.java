package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class propertiesclass {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\91859\\project\\src\\project\\config.properties");
		prop.load(ip);
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("ff"))
		{
			
			System.setProperty("webdriver.firefox.driver","C:\\selenium\\drivers\\Geckdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		String url=prop.getProperty("URL");
		driver.get(url);
		driver.findElement(By.xpath("")).sendKeys(prop.getProperty("username"));

	}

}
