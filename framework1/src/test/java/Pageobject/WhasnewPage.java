package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class WhasnewPage {

	WebDriver driver;
	AppUI a = new AppUI();

	public WhasnewPage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}

//	public void clickTideprograms() {
//		driver.findElement(a.Tideprograms).click();
//		Log.loginfo("Tide Programs option click");
//	}
//	
	public void clickTideloads() {
		driver.findElement(a.Tideloads).click();
		Log.loginfo("Tide Loads option click");
	}

//	public void checkTideloads() {
//		if (driver.findElement(a.Tideloads).getText().equals("Tide loads details found"));
//		Log.loginfo("Tide loads details found");
//	}

}
