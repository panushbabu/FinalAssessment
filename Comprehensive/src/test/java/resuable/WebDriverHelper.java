package resuable;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import exceptions.WebDriverHelperException;
import manager.WebDriverManager;

public class WebDriverHelper extends WebDriverManager {

	public void sendText(By element, String text) throws WebDriverHelperException {
		try {
			driver.findElement(element).sendKeys(text);
		} catch (ElementNotInteractableException exception) {
			throw new WebDriverHelperException(exception);
		}
	}

	public String getText(By element) throws WebDriverHelperException {
		String text = null;
		try {
			text = driver.findElement(element).getText();
		} catch (ElementNotInteractableException exception) {
			throw new WebDriverHelperException(exception);
		}
		return text;
	}

	public void clickButton(By element) throws WebDriverHelperException {
		try {
			driver.findElement(element).click();
		} catch (ElementClickInterceptedException exception) {
			throw new WebDriverHelperException(exception);
		}
	}

	public void switchHandles(int index) {
		ArrayList<String> handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(index));
	}

	public void hover(By element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(element)).perform();
	}

	public void pageLoad(int time) throws WebDriverHelperException {
		try {
			driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		} catch (TimeoutException exception) {
			throw new WebDriverHelperException(exception);
		}
	}

	public void clearText(By element) {
		driver.findElement(element).clear();
	}

	public void actionClick(By element) throws WebDriverHelperException {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(element));
		actions.click(driver.findElement(element)).build().perform();
	}

	public boolean elementDisplayed(By element) {
		return driver.findElement(element).isDisplayed();
	}

	public void explicitWaitForVisibility(int time, By element) throws WebDriverHelperException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
		} catch (TimeoutException exception) {
			throw new WebDriverHelperException(exception);
		}
	}

	public void explicitWaitForInvisibility(By element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	}

	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void enterKey(By element) {
		WebElement we = driver.findElement(element);
		we.sendKeys(Keys.ENTER);
	}

	public void applicationWait(int time) throws WebDriverHelperException {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new WebDriverHelperException(e);
		}
	}
}
