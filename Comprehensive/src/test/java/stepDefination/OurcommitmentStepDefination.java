package stepDefination;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageObjectManager;
import utility.Logs;

public class OurcommitmentStepDefination {

	PageObjectManager pageManager;
	pageobject.OurcommitmentPage OurcommitmentPage;
	Logs loggerUtil;
	Logger log;

	@When("Click on Our Commitment")
	public void click_on_our_commitment() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		OurcommitmentPage = pageManager.getOurcommitmentPage();

		OurcommitmentPage.clickonOurcommitment();
	}
	
	@Then("Verify Our Ambition is displayed under Our Commitment")
	public void verify_our_ambition_is_displayed_under_our_commitment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@Then("Verify Our Ambition is diplayed under Our Commitment")
//	public void verify_our_ambition_is_displayed_under_our_commitment() {
//		 OurcommitmentPage.validate();
//	}
}
