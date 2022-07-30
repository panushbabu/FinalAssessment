package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class OurCommitmentPage {

	WebDriver driver;
	AppUI a = new AppUI();

	public OurCommitmentPage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}

	public void clickOurAmbition() {
		driver.findElement(a.OurAmbition).click();
		Log.loginfo("Our Ambition option click");
	}

	public void checkOurAmbition() {
		if (driver.findElement(a.OurAmbition).getText().equals("Our Ambition details found"));
		Log.loginfo("Our Ambition details found");
	}

}
