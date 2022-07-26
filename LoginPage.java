package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectreository.MobileLogin;


public class LoginPage {
@Test
public void Login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	MobileLogin lp=new MobileLogin (driver);
	lp.Signin().click();
	lp.UserName().sendKeys("prashanth");
	lp.Password().sendKeys("12345678");
	//lp.Checkbox().click();
	Thread.sleep(2000);
	lp.Login().click();
	
}
}



