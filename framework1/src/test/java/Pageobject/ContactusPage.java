package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class ContactusPage {

	WebDriver driver;
	AppUI a = new AppUI();

	public ContactusPage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}

	public void clickChat() {
		driver.findElement(a.Chat).click();
		Log.loginfo("Chat option click");
	}

	public void checkChat() {
		if (driver.findElement(a.Chat).getText().equals("Chat details found"))
			;
		Log.loginfo("Chat details found");
	}

}
