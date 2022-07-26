package Objectreository;

	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class MobileSignup {
	WebDriver driver;
	public MobileSignup(WebDriver driver) {
		this.driver=driver;
	}
	By button=By.xpath("//button[@type='submit']");
	By button2=By.xpath("//a[.='Sign up']");
	By First=By.id("myName");
	By Last=By.xpath("//input[@placeholder='Last Name'] "); 
	By Email=By.xpath("//input[@placeholder='Enter Email']");
	By Pass=By.xpath("//input[@placeholder='Password'] ");
	By Date=By.xpath("//input[@type='date']");
	By Radio=By.xpath("(//input[@name='gender'])[1]");
	By Mobile=By.xpath("//input[@type='number']");
	By Bio=By.xpath("//textarea[@placeholder='Short Bio']");
	By Reg=By.xpath("//button[@type='submit']");
	By Sign=By.xpath("//button[.='Sign In']");


	public WebElement Signin()
	{
		return driver.findElement(button);
	}

	public WebElement Signup()
	{
		return driver.findElement(button2);
	}

	public WebElement FirstName()
	{
		return driver.findElement(First);
	}
	public  WebElement LastName()
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
	public WebElement DatePage()
	{
		return driver.findElement(Date);
	}
	public WebElement Radiobutton()
	{
		return driver.findElement(Radio);
	}
	public WebElement MobileNumber()
	{
		return driver.findElement(Mobile);
	}
	public WebElement ShortBio()
	{
		return driver.findElement(Bio);
	}
	public WebElement Register()
	{
		return driver.findElement(Reg);
	}
	public WebElement Singin1()
	{
		return driver.findElement(Sign);
	}
	}

