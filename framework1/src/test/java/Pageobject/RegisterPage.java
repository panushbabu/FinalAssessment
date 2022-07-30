package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class RegisterPage {

	WebDriver driver;
	AppUI a = new AppUI();

	public RegisterPage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}
	
	public void clickRegister() {
		driver.findElement(a.Register).click();
		Log.loginfo("Register option click");
	}
	
	public void clickSignupnow() {
		driver.findElement(a.Signupnow).click();
		Log.loginfo("Sign up now option click");
	}
	
//	public void enterFirstname() {
//		driver.findElement(a.Firstname).sendKeys("Anush");
//		Log.loginfo("enter the first name");
//	}
//	
//	public void enterEmailaddress() {
//		driver.findElement(a.Emailaddress).sendKeys("purumuanushbabu@gmail.com");
//		Log.loginfo("enter the Email Address");
//	}
//	public void enterPassword() {
//		driver.findElement(a.Password).sendKeys("Anush@1860");
//		Log.loginfo("enter the password");
//	}
//	
//	public void clickCreateAccount() {
//		driver.findElement(a.CreateAccount).click();
//		Log.loginfo("Create Account click");
//	}
}
