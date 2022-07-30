package Runner;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pageobject.HomePage;
import Pageobject.OurCommitmentPage;
import ResuableComponent.CloseChrome;
import ResuableComponent.OpenChrome;
import Utility.Excelreader;
import Utility.Extentreport;
import Utility.Log;
import Utility.ReadPropertyFile;
import Utility.ScreenShot;

public class TestCase3 {
	public static ArrayList<String> s_search_string = null;
	public static String url = null;
	public static String path = null;
	public static WebDriver driver = null;
	public static Extentreport extent = new Extentreport();
	public static ReadPropertyFile prop = new ReadPropertyFile();
	public static ExtentTest test;

	@BeforeTest
	public void Before() throws IOException {
		test = Extentreport.startTest(TestCase3.class.getSimpleName());
		s_search_string = Excelreader.getdata();
		url = prop.getUrl();
		path = prop.getDriverPath();
		OpenChrome op = new OpenChrome();
		driver = op.openBrowser(driver, path, url);
	}

	@Test(priority = 3)
	public static void test() throws IOException, InterruptedException {
		test = Extentreport.startTest("TestCase3");
		try {
			Log log = new Log();
			log.config1();
			HomePage h = new HomePage(driver);
			h.clickOurCommitment();
			OurCommitmentPage c = new OurCommitmentPage(driver);
			c.clickOurAmbition();
			//c.checkOurAmbition();

			ScreenShot S = new ScreenShot();

			S.TakeScreenshot("/ScreenShot", driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void After() {
		CloseChrome.close(driver);
		test.log(LogStatus.PASS, "browser closed succesfully");
		extent.endTest();
	}
}