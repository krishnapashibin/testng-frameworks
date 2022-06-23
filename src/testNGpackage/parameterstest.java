package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterstest {
	WebDriver driver;
	String URL;
	@Test
	@Parameters({"env","browser","email"})
	public void yahoologin(String env,String browser,String email ) {
		if (env.equals("qa"))
		{
			URL="https://abordersystem-37196-react-native.b37196.stage.us-east-1.aws.svc.builder.ai/Home/";
		}
		else if(env.equals("Prod")){
			URL="https://abordersystem-37196-react-native.b37196.prod.eu-central-1.aws.svc.builder.ai/EmailAccountLogin";
		}else
		{
			System.out.println("Wrong environment");
		}
		if (browser.equals("chrome")){
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver-101 version.exe");
	driver=new ChromeDriver();}
		
	driver.get(URL);
	
	
		
	
	}
}
