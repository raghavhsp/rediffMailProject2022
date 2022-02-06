package common.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleneiumUtilities {
	LogHelper objLogHelper = new LogHelper();
	org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	GenericHelper objGenericHelper = new GenericHelper();
	public boolean isDisplayed(WebDriver driver, By element) {
		boolean flag = false;
		try {

			flag = driver.findElement(element).isDisplayed();
		} catch (Exception e) {
			Log.warn(e.getMessage());
		}
		return flag;
	}

	public String getCurrentURL(WebDriver driver) {
		String currentURL = null;
		try {
			currentURL = driver.getCurrentUrl();
			Log.info("Current URL is :" + currentURL);
		} catch (Exception e) {
			Log.warn(e.getMessage());
		}
		return currentURL;
	}

	public String getTitle(WebDriver driver) {
		String title = null;
		try {
			title = driver.getTitle();
			Log.info("Title is :" + title);
		} catch (Exception e) {
			Log.warn(e.getMessage());
		}
		return title;
	}

	public void sendKeys(WebDriver driver, By element, String string) {

		driver.findElement(element).sendKeys(string);
	}

	public void waitForWebElementToBeVisible(WebDriver driver, By webElement) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,objGenericHelper.readIntFromPropertiesFile("waitForWebElementToBeVisible"));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(webElement));
		} catch (Exception e) {
			Log.warn(e.getMessage());
		}

	}
	public void waitForWebElementToBeClickable(WebDriver driver, By webElement) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, objGenericHelper.readIntFromPropertiesFile("waitForWebElementToBeVisible"));
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
		} catch (Exception e) {
			Log.warn(e.getMessage());
		}
	}
}
