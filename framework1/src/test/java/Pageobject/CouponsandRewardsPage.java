package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class CouponsandRewardsPage {

	WebDriver driver;
	AppUI a = new AppUI();

	public CouponsandRewardsPage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}

	public void clickSavenow() {
		driver.findElement(a.Savenow).click();
		Log.loginfo("Save now option click");
	}
	
}	
