package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	//Create local "WebDriver" Object
	WebDriver driver;
	//Constructor
	public ScreenshotUtility(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	
	//Method
	public void takeScreenshot(WebDriver driver) throws IOException {
		
		//step1: convert WebDriver object to TakesScreenshot interface
		TakesScreenshot scr=(TakesScreenshot)driver;
		
		// step2: call getScreenshotAs method to create image file
		File scource=scr.getScreenshotAs(OutputType.FILE);
		File desctination = new File("D:\\Automation Projects\\EclipseWorkSpace\\framework_POM\\Screenshot\\ScreenShot.png");
		
		//step3:copy image file to destination
		FileUtils.copyFile(scource, desctination);
		
		
		
		
		
	}
	
	
	
	

}
