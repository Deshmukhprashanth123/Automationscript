package Testcase;

	import java.time.Duration;
	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import Objectreository.MobileAllMobile1;
import Objectreository.MobileContactUs;
import Objectreository.MobileLogin;
import Objectreository.MobileOder;
import Objectreository.MobileSignup;

	public class MainMobileAll {
		@Test(priority=2,dataProvider="getallmobile")
		public void All(String str1) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			driver.get("https://mobileworld.azurewebsites.net/index.html");
			MobileAllMobile1 ma=new MobileAllMobile1 (driver);
			ma.MobileAll1().click();
			ma.SearchTextBox().sendKeys(str1);
			Thread.sleep(2000);
			ma.OderButton().click();
			}
		    @DataProvider
		    public Object getallmobile()
		    {
			return new Object[][] {{"samsung"},{"apple"},{"Lenova"}};
		    }
		 
		
		@Test(priority=4,dataProvider="contact")
		public void Us(String a1,String a2,String a3,String a4) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			driver.get("https://mobileworld.azurewebsites.net/#");
			 MobileContactUs mc=new MobileContactUs(driver);
			 mc.Contact().click();
			 mc.ContactUs().click();
			 Set<String>windows=driver.getWindowHandles();
				Iterator<String> it=windows.iterator();
				String parentId=it.next();
				String childId=it.next();
				driver.switchTo().window(childId);
				String title=driver.getTitle();
				Thread.sleep(1500);
				System.out.println(title);
				mc.UserName().sendKeys(a1);
				mc.EmailId().sendKeys(a2);
				mc.PhoneNumber().sendKeys(a3);
				mc.MessageTex().sendKeys(a4);
				Thread.sleep(2000);
				mc.SendButton().click();
				Thread.sleep(2000);
	            }
		        @DataProvider
		        public Object contact()
		        {
			    return  new Object [][] {{"prashanth","naveen@2345.com","1234567890","Hi....Naveen"}};
		        }
		
		
		@Test(priority=1,dataProvider="Login1")
		public void Login(String a1,String a2) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			driver.get("https://mobileworld.azurewebsites.net/");
			MobileLogin lp=new MobileLogin (driver);
			lp.Signin().click();
			lp.UserName().sendKeys(a1);
			lp.Password().sendKeys(a2);
			//lp.Checkbox().click();
			Thread.sleep(2000);
			lp.Login().click();	
		    }
		    @DataProvider
		    public Object Login1()
		    {
			return  new Object [][] {{"prashanth","12345678"}};
		    }
		
		
		@Test(priority=3,dataProvider="MobileOder")
		public void Oder(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8,String a9,String a10) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			driver.get("https://mobileworld.azurewebsites.net/order.html");
			MobileOder om=new MobileOder (driver);
			om.FirstName().sendKeys(a1);
			om.LastName().sendKeys(a2);
			om.EmailId().sendKeys(a3);
	    	om.Password().sendKeys(a4);
			om.RadioButton().click();
			om.NumberField().sendKeys(a5);
			om.Address1().sendKeys(a6);
			om.Address2().sendKeys(a7);
			om.CityField().sendKeys(a8);
			om.StateField().click();
			om.CheckBox().click();
			om.Checkbox1().click();
			Thread.sleep(2000);
			om.ZipBox().sendKeys(a9);
			om.CountBox().sendKeys(a10);
			om.OderNow().click();
			Thread.sleep(2000);
			om.CloseButton().click();			
	        }
		    @DataProvider
		    public Object MobileOder()
		    {
			return  new Object [][] {{"prashanth","Deshmukh","prashanthgdeshmukh@gmail.com","123456789","9945886613","Nagur(b)","Hydrabad","Bengalor","1234567","1"}};
		    }
		
		
		@Test(dataProvider="Signin")
		public void sign(String a1,String a2,String a3,String a4,String a5,String a6) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			driver.get("https://mobileworld.azurewebsites.net/");
	    	MobileSignup ms=new MobileSignup (driver);
			ms.Signin().click();
			ms.Signup().click();
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
			Thread.sleep(2000);
			ms.Singin1().click();
		    }
		    @DataProvider
		    public Object Signin()
		   {
			return  new Object [][] {{"prashanth","deshmukh","prashanthgdeshmukh@gmail.com","omkardeshmukh@123","9945886613","This Appliction is good."}};
		   }
	}
	



