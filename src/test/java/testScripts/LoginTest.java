package testScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.LoginPageObject;

public class LoginTest
{

	public static void main(String[] args)
	
	{
	 WebDriver driver=new ChromeDriver();// Driver initialization
	 //Driver initialization
	 LoginPageObject lpo=new LoginPageObject(driver);// Create Object of"LoginPageObject"class
	 lpo.launchedAndLogin("anubhav.mukul11@gmail.com", "Admin12345700");//Object calling and given parameter.

	}

}
