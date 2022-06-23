package screenshotforfailedtestcase_listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot extends basetest{
	
	public static void getscreenshot() throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(SrcFile, new File("C:\\Users\\91859\\project\\src\\project\\screenshot.png"));

	}

}
