package stepDefination;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageObjectManager;
import utility.Logs;

public class PaceStepDefination {
	PageObjectManager pageManager;
	pageobject.PacePage PacePage;
	Logs loggerUtil;
	Logger log;

	@When("I search Pace search option")
	public void i_search_razor_search_option() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		PacePage = pageManager.getPacePage();

		PacePage.search();
		PacePage.sendkeys();
	}

	@Then("I verify the results of Pace displayed")
	public void i_verify_the_results_of_pace_displayed() {
		PacePage.validate();
	}
}
