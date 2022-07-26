package Testcase;

	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

    import Objectreository.MobileAllMobile1;

	public class AllMobile1 {
	@Test
	public void All() 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		MobileAllMobile1 ma=new MobileAllMobile1 (driver);
		ma.MobileAll1().click();
		ma.SearchTextBox().sendKeys("Apple iphone 13");
		ma.OderButton().click();
		}
	}


