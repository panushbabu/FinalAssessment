package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class HowtowashclothesPage {

	WebDriver driver;
	AppUI a = new AppUI();

	public void clickHowtowashclothesPage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}

	public void clickHowtodolaundry() {
		driver.findElement(a.Howtodolaundry).click();
		Log.loginfo("How to do laundry option click");
	}

	public void checkHowtodolaundry() {
		if (driver.findElement(a.Howtodolaundry).getText().equals("How to do laundry details found"));
		Log.loginfo("How to do laundry details found");
	}

}