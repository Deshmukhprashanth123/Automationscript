package Testcase;

	import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

    import Objectreository.MobileContactUs;

	public class ContactUs {
		@Test
		public void Us() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://mobileworld.azurewebsites.net");
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
				mc.UserName().sendKeys("prashanth");
				mc.EmailId().sendKeys("naveen@2345.com");
				mc.PhoneNumber().sendKeys("1234567890");
				mc.MessageTex().sendKeys("Hi....Naveen");
				Thread.sleep(2000);
				mc.SendButton().click();
				Thread.sleep(2000);
	   }
	   }

