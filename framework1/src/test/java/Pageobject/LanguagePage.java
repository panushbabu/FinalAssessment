package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class LanguagePage {

	WebDriver driver;
	AppUI a = new AppUI();

	public LanguagePage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}

	public void clickUSEnglish() {
		driver.findElement(a.USEnglish).click();
		Log.loginfo("USEnglish option click");
	}

}	