package ResuableComponent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
	public WebDriver openBrowser(WebDriver driver, String path, String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M1088071\\SeleniumProjects\\framework1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}