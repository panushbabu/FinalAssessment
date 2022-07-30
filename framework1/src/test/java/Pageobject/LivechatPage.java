package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class LivechatPage {

	WebDriver driver;
	AppUI a = new AppUI();

	public LivechatPage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}

	public void clickLoadsofhope() {
		driver.findElement(a.Loadsofhope).click();
		Log.loginfo("Load of Hope option click");
	}

	public void checkLoadsofhope() {
		if (driver.findElement(a.Loadsofhope).getText().equals("Loads of Hope details found"));
			Log.loginfo("Loads of Hope details found");
	}
}
