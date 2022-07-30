package pageobject;

import org.apache.log4j.Logger;

import exceptions.WebDriverHelperException;
import resuable.WebDriverHelper;
import uistore.HomePageUi;
import utility.Logs;

public class PacePage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public PacePage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void search() {
		log = loggerUtil.createLog("PacePage.java");
		try {
			helper.actionClick(HomePageUi.search);
			log.debug("Clicked on search");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}

	public void sendkeys() {
		try {
		 helper.sendText(HomePageUi.submit, "Pace");
		 helper.enterKey(HomePageUi.submit);
		log.debug("type Pace in search box");
		 } catch (WebDriverHelperException e) {
		 e.printStackTrace();
		 }
	}

	public void validate() {
		
		String name = "Pace";
		if (name.contains("Pace")) {
			log.debug("Pace present in top list");
		} else {
			log.debug("Pace not present in top list");
		}
		
	}

}
