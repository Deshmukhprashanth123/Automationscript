package Objectreository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobileLogin{
		WebDriver driver;
		public MobileLogin(WebDriver driver){
			this.driver=driver;
		}
		By SigninButton=By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']");
		By User=By.xpath("//input[@id='username']");
		By Pass=By.xpath("//input[@type='password']");
		//By Check=By.xpath("//input[@type='remember-me']");
		By LoginButton= By.xpath("//a[@class='btn btn-primary btn-block']");
		
		public WebElement Signin() {
			return driver.findElement(SigninButton);
		}
		public WebElement UserName() {
			return driver.findElement(User);
		}
		public WebElement Password() {
			return driver.findElement(Pass);
		}
	   //public WebElement Checkbox() {
			//return driver.findElement(Check);
		//}
		public WebElement Login() {
			return driver.findElement(LoginButton);
		}
	}