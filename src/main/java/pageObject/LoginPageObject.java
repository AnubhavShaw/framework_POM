package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject
{
	WebDriver driver;
	public LoginPageObject(WebDriver driver)
	{
		
		this. driver=driver;
		
	}
	
	public void openLoginPage()
	{
		
	driver.get("https://wwww.facebook.com/");	
		
	}
	public void doLogin() 
	{
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		email.sendKeys("anubhav.mukul11@gmail.com");
		pass.sendKeys("12345700");
		login.click();
		
		
	}
	public void launchedAndLogin(String un, String pw)
	{
		
		driver.get("https://wwww.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		
		email.sendKeys(un);
		pass.sendKeys(pw);
		login.click();
		
	}

}
