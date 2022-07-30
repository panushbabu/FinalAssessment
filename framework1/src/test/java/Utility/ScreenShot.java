package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static WebDriver driver;

	public ScreenShot() {
		ScreenShot.driver = driver;
	}

	public String TakeScreenshot(String name,WebDriver driver) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy/HH/mm/ss");
		String date = sdf.format(d);
		String timestamp = "C:\\Users\\M1088071\\SeleniumProjects\\framework1\\ScreenShot" + date.replaceAll("/", "_")
				+ name + ".png";

		File dest = new File(timestamp);
		FileUtils.copyFile(src, dest);

		return timestamp;

	}

	

}
