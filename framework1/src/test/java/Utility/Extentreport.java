package Utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport {
	public static ExtentReports extent;
	public static ExtentTest test;

	public static ExtentTest startTest(String testname) {
		extent = new ExtentReports("C:\\Users\\M1088071\\SeleniumProjects\\framework1\\Extentreport.html", true);
		test = extent.startTest(testname);
		test.log(LogStatus.PASS, "Test case " + testname + " started ");
		return test;
	}

	public void endTest() {
		extent.endTest(test);
		extent.flush();
		extent.close();
	}
}