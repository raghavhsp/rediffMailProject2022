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
			Log.error("Exception Message :"+e.getMessage());
		}
		return flag;
	}

	public String getCurrentURL(WebDriver driver) {
		String currentURL = null;
		try {
			currentURL = driver.getCurrentUrl();
			Log.info("Current URL is :" + currentURL);
		} catch (Exception e) {
			Log.error("Exception Message :"+e.getMessage());
		}
		return currentURL;
	}

	public String getTitle(WebDriver driver) {
		String title = null;
		try {
			title = driver.getTitle();
			Log.info("Title is :" + title);
		} catch (Exception e) {
			Log.error("Exception Message :"+e.getMessage());
		}
		return title;
	}

	public void sendKeys(WebDriver driver, By element, String string) {
		try {
			waitForWebElementToBeVisible (driver ,element);
			driver.findElement(element).sendKeys(string);
		} catch (Exception e) {
			Log.error("Exception Message :"+e.getMessage());
			Log.info("Element Details: "+element.toString());
		}
	}
	
	public void click(WebDriver driver, By element) {
		try {
			waitForWebElementToBeClickable (driver ,element);
			driver.findElement(element).click();
		} catch (Exception e) {
			Log.error("Exception Message :"+e.getMessage());
			Log.info("Element Details: "+element.toString());
		}
	}
	@SuppressWarnings("deprecation")
	public  void waitForWebElementToBeVisible(WebDriver driver, By element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,objGenericHelper.readIntFromPropertiesFile("waitForWebElementToBeVisible"));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
		} catch (Exception e) {
			Log.error("Exception Message :"+e.getMessage());
			Log.info("Element Details: "+element.toString());
		}

	}
	@SuppressWarnings("deprecation")
	public void waitForWebElementToBeClickable(WebDriver driver, By element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, objGenericHelper.readIntFromPropertiesFile("waitForWebElementToBeVisible"));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			Log.error("Exception Message :"+e.getMessage());
			Log.info("Element Details: "+element.toString());
		}
	}

}
