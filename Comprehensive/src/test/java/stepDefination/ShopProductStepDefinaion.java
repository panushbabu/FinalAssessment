package stepDefination;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageObjectManager;
import utility.Logs;

public class ShopProductStepDefinaion {
	PageObjectManager pageManager;
	pageobject.ShopProductPage ShopProductPage;
	Logs loggerUtil;
	Logger log;

	@Given("Open website")
	public void go_to_website() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		ShopProductPage = pageManager.getShopProductPage();
	}
	
	@When("Hover on Products Choose Liquid under Shop product")
	public void hover_on_products_choose_liquid_under_shop_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@Then("Verify if the text  Liquid present in Shop produc")
	public void verify_if_the_text_liquid_present_in_shop_product() {
		ShopProductPage.validate();
	}
}
