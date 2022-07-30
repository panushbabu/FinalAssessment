package pageobject;

import org.apache.log4j.Logger;

import exceptions.WebDriverHelperException;
import resuable.WebDriverHelper;
import uistore.HomePageUi;
import utility.Logs;

public class ShopProductPage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public ShopProductPage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void hoverToproducts() {
		log = loggerUtil.createLog("ShopProductPage.java");
		helper.hover(HomePageUi.ShopProduct);
		log.debug("Hover to Products");
	}

	public void clickLiquid() {
		try {
			helper.actionClick(HomePageUi.Liquid);
			log.debug("clicked on Liquid");
		} catch (WebDriverHelperException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validate() {
		String name;
		
		name = "Tide Liquid";
		if (name.contains("Tide Liquid")) {
			log.debug("Tide Liquid present in out products list");
		} else {
			log.debug("Tide Liquid not present in out products list");
		}
		
	}
}
