package pageobject;

import org.apache.log4j.Logger;
import exceptions.WebDriverHelperException;
import resuable.WebDriverHelper;
import uistore.HomePageUi;
import utility.Logs;

public class HowtowashclothesPage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public HowtowashclothesPage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void clickonHowtowashclothes() {
		log = loggerUtil.createLog("HowtowashclothesPage.java");
		try {
			helper.actionClick(HomePageUi.Howtowashclothes);
			log.debug("Clicked on How to wash clothes");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}

	public void validate() {
		
		String name = "How to do laundry";
		if (name.contains("How to do laundry")) {
			log.debug("How to do laundry present");
		} else {
			log.debug("How to do laundry not");
		}
		
	}
}
