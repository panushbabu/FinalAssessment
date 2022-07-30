package stepDefination;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageObjectManager;
import utility.Logs;

public class HowtowashclothesStepDefination {

	PageObjectManager pageManager;
	pageobject.HowtowashclothesPage HowtowashclothesPage;
	Logs loggerUtil;
	Logger log;

	@When("Click on How to Wash Clothes")
	public void click_on_how_to_wash_clothes() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		HowtowashclothesPage = pageManager.getHowtowashclothesPage();

		HowtowashclothesPage.clickonHowtowashclothes();
	}
	
	@Then("Verify How to Do Laundry is displayed under How to Wash Clothes")
	public void verify_how_to_do_laundry_is_displayed_under_hot_to_wash_clothes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
