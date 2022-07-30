package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class HomePage {
	WebDriver driver;
	AppUI a = new AppUI();

	public HomePage(WebDriver driver) {
		Log.loginfo("HomePage opened");
		this.driver = driver;
	}

	public void clickShopProducts() {
		driver.findElement(a.ShopProduct).click();
		Log.loginfo("ShopProduct clicked");
	}

	public void clickOurCommitment() {
		driver.findElement(a.OurCommitment).click();
		Log.loginfo("OurCommitment clicked");
	}
	
	public void clickHowtowathclothes() {
		driver.findElement(a.Howtowashclothes).click();
		Log.loginfo("How to Wash Clothes clicked");
	}
	
	public void clickRegister() {
		driver.findElement(a.Register).click();
		Log.loginfo("Register clicked");
	}
	
	public void clickLivechat() {
		driver.findElement(a.Livechat).click();
		Log.loginfo("Live Chat clicked");
	}
	
	public void clickContactus() {
		driver.findElement(a.Contactus).click();
		Log.loginfo("Contact Us clicked");
	}

	public void clickWhatsnew() {
		driver.findElement(a.Whatsnew).click();
		Log.loginfo("Whatsnew clicked");
	}

	public void clickCouponsandRewards() {
		driver.findElement(a.CouponsandRewards).click();
		Log.loginfo("Coupons and Rewards clicked");
	}
	
	public void clickLanguage() {
		driver.findElement(a.Language).click();
		Log.loginfo("Language clicked");
	}

}
