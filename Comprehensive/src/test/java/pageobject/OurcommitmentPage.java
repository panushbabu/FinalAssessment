package pageobject;

import org.apache.log4j.Logger;
import exceptions.WebDriverHelperException;
import resuable.WebDriverHelper;
import uistore.HomePageUi;
import utility.Logs;

public class OurcommitmentPage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public OurcommitmentPage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void clickonOurcommitment() {
		log = loggerUtil.createLog("OurcommitmentPage.java");
		try {
			helper.actionClick(HomePageUi.Ourcommitment);
			log.debug("Clicked on Our commitment");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}

	public void validate() {
		
		String name = "Our Ambition";
		if (name.contains("Our Ambition")) {
			log.debug("Our Ambition present");
		} else {
			log.debug("Our Ambition not");
		}
		
	}
}
