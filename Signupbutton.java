package Testcase;

	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

    import Objectreository.MobileSignup;

	
	public class Signupbutton {
	@Test
	public void sign()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		MobileSignup ms=new MobileSignup (driver);
		ms.Signup().click();
		ms.Signin().click();
		ms.FirstName().sendKeys("prashanth");
		ms.LastName().sendKeys("deshmukh");
		ms.EmailId().sendKeys("prashanthgdeshmukh@gmail.com");
		ms.Password().sendKeys("omkardeshmukh@123");
		ms.DatePage().click();
		ms.Radiobutton().click();
		ms.MobileNumber().sendKeys("9945886613");
		ms.ShortBio().sendKeys("This Appliction is good.");
		ms.Register().click();
		driver.switchTo().alert().accept();
		ms.Singin1().click();
	}
	}


