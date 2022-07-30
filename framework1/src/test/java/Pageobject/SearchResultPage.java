package Pageobject;

import org.openqa.selenium.WebDriver;

import UIstore.AppUI;
import Utility.Log;

public class SearchResultPage {
	WebDriver driver;
	AppUI a = new AppUI();

	public SearchResultPage(WebDriver driver) {
		Log.loginfo("HomePage opened");
		this.driver = driver;
	}

	public void clickSearch() {
		driver.findElement(a.search).click();
		Log.loginfo("Search button clicked");
	}

	public void enterSearch() {
		driver.findElement(a.searchBox).sendKeys("Pacs");
		;
		Log.loginfo("Search box clicked");
	}

	//public void clickSearchButton() {
	//	driver.findElement(a.searchButton).click();
		//Log.loginfo("Search button clicked");
	//}

	 public void validateTest() {
	 if (driver.findElement(a.searchResult).getText().endsWith("Pacs")) {
	 Log.loginfo("Pacs details found");
	}
	 
   }
 }
