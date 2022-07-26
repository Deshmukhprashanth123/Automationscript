package Objectreository;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class MobileAllMobile1 {
		WebDriver driver;
		public MobileAllMobile1(WebDriver driver) {
			this.driver=driver;
		}
		By Mobile=By.xpath("//a[.='All Mobiles']");
		By Search=By.id("myInput");
		By Oder=By.xpath("(//a[.='Order'])[4]");
		
		public WebElement MobileAll1()
		{
			return driver.findElement(Mobile);
		}
		public WebElement SearchTextBox()
		{
			return driver.findElement(Search);
		}
		public WebElement OderButton()
		{
			return driver.findElement(Oder);
		}
	}


