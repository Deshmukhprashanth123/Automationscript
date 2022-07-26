
	package Objectreository;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class MobileContactUs {
		WebDriver driver;
		public MobileContactUs(WebDriver driver) {
			this.driver=driver;
		}
		By button=By.xpath("//a[contains(text(),'Support')]");
		By Contact=By.xpath("//a[@class='dropdown-item']");
		By User=By.xpath("//input[@placeholder='Username']");
		By Email=By.xpath("//input[@placeholder='Email']");
		By Phone=By.xpath("//input[@placeholder='Phone']");
		By Message=By.xpath("//input[@placeholder='Message']");
		By Send=By.xpath("//input[@value='Send']");
		
		public WebElement Contact()
		{
			return driver.findElement(button);
		}
		public WebElement ContactUs()
		{
			return driver.findElement(Contact);
		}
		public WebElement UserName()
		{
			return driver.findElement(User);
		}
		public WebElement EmailId()
		{
			return driver.findElement(Email);
		}
		public WebElement PhoneNumber()
		{
			return driver.findElement(Phone);
		}
		public WebElement MessageTex()
		{
			return driver.findElement(Message);
		}
		public WebElement SendButton()
		{
			return driver.findElement(Send);
		}
	}


