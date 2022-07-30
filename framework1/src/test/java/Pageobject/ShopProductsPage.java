package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class ShopProductsPage {

	WebDriver driver;
	AppUI a = new AppUI();

	public ShopProductsPage(WebDriver driver) {
		Log.loginfo("Homepage opened");
		this.driver = driver;

	}

	public void clickLiquid() {
		driver.findElement(a.Liquid).click();
		Log.loginfo("Liquit option click");
	}

	public void checkLiquid() {
		if (driver.findElement(a.Liquid).getText().equals("Liquid details found"));
			Log.loginfo("Liquid details found");
	}

}
