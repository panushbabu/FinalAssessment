package stepDefination;

import org.apache.log4j.Logger;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import manager.WebDriverManager;
import resuable.WebDriverHelper;
import utility.Logs;
import utility.SnapShots;

public class Hooks extends WebDriverManager {
	WebDriverManager driverManager;
	WebDriverHelper Helper;
	Logs loggerUtil;
	Logger log;

	@Before
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Hooks.class");
		log.debug("Opening driver");
		driverManager = new WebDriverManager();
		driverManager.getDriver();
		log.info("Driver opened");
		driver.get(properties.getProperty("url"));
		log.debug("Opening URL");
	}

	@AfterStep
	public void takess(Scenario scenario) {
		SnapShots ss = new SnapShots();
		if (scenario.isFailed()) {
			ss.takeSnapShotFail();
		} else {
			ss.takeSnapShotPass();
		}
	}

	@After
	public void tearDown() {
		log.info("Driver closed");
		log.info("Scenario completed");
		driver.close();
	}

}
