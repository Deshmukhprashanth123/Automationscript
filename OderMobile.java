package Testcase;

	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import Objectreository.MobileOder;



	public class OderMobile {
		@Test
		public void Oder() throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://mobileworld.azurewebsites.net/order.html");
			MobileOder om=new MobileOder (driver);
			om.FirstName().sendKeys("Prashanth");
			om.LastName().sendKeys("Deshmukh");
			om.EmailId().sendKeys("prashanthgdeshmukh@gmail.com");
			om.Password().sendKeys("1234567899");
			om.RadioButton().click();
			om.NumberField().sendKeys("9945886613");
			om.Address1().sendKeys("Nagur(b)");
			om.Address2().sendKeys("Hydrabad");
			om.CityField().sendKeys("Bengalor");
			om.StateField().click();
			om.CheckBox().click();
			om.Checkbox1().click();
			om.ZipBox().sendKeys("1234567");
			om.CountBox().sendKeys("1");
			om.OderNow().click();
			om.CloseButton().click();
			
			
	}
	}

