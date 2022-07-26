package Objectreository;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class MobileOder {
		WebDriver driver;
		public MobileOder(WebDriver driver) {
			this.driver=driver;
		}
		By First=By.id("inputFirstName");
	    By Last=By.xpath("(//input[@id='inputFirstName'])[2]");
	    By Email=By.xpath("//input[@id='inputEmail']");
	    By Pass=By.id("inputPassword");
	    By Radio=By.id("flexRadioDefault1");
	    By Number=By.xpath("(//input[@type='number'])[1]");
	    By Address=By.id(" address1");
	    By Address1=By.id("address2");
	    By City=By.id("inputCity");
	    By State=By.xpath("//select[@id='inputState']/option[.='Karnataka']");
		By Check=By.xpath("(//input[@rel='apple'])[1]");
		By check1=By.xpath("//input[@rel='samsung']");
		By Zip=By.id("inputZip");
		By Count=By.xpath("//input[@placeholder='no of mobiles']");
		By Oder=By.xpath("//button[@class='btn btn-primary']");
		By Close=By.xpath("//a[@class='btn btn-secondary']");
		
		
		public WebElement FirstName()
		{
			return driver.findElement(First);
		}
		public WebElement LastName()
		{
			return driver.findElement(Last);
		}
		public WebElement EmailId()
		{
			return driver.findElement(Email);
		}
		public WebElement Password()
		{
			return driver.findElement(Pass);
		}
		public WebElement RadioButton()
		{
			return driver.findElement(Radio);
		}
		public WebElement NumberField()
		{
			return driver.findElement(Number);
		}
		public WebElement Address1()
		{
			return driver.findElement(Address);
		}
		public WebElement Address2()
		{
			return driver.findElement(Address1);
		}
		public WebElement CityField()
		{
			return driver.findElement(City);
		}
		public WebElement StateField()
		{
			return driver.findElement(State);
		}
		public WebElement CheckBox()
		{
			return driver.findElement(Check);
			
		}
		public WebElement Checkbox1()
		{
			return driver.findElement(check1);
		}
		public WebElement ZipBox()
		{
			return driver.findElement(Zip);
		}
		public WebElement CountBox()
		{
			return driver.findElement(Count);
		}
		public WebElement OderNow()
		{
			return driver.findElement(Oder);
		}
		public WebElement CloseButton()
		{
			return driver.findElement(Close);
		}
	}


