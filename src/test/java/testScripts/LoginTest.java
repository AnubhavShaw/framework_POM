package testScripts;
import java.io.IOException;

import org.testng.annotations.Test;

import utilities.ScreenshotUtility;



public class LoginTest extends BasicTestComponent
{
	@Test
	public void  tc001() throws IOException {
		loginTestPossitive();
		
		ScreenshotUtility screenshot=new ScreenshotUtility(driver);
		screenshot.takeScreenshot(driver);
		
		
	}
	
	
	
	
	

}
