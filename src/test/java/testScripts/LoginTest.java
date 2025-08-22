package testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPageObject;
public class LoginTest
{

	public static void main(String[] args)
	
	{
	 WebDriver driver=new ChromeDriver();
	 //Driver initialization
	 LoginPageObject lpa=new LoginPageObject(driver);
	 lpa.launchedAndLogin("anubhav.mukul11@gmail.com", "Admin12345700");

	}

}
