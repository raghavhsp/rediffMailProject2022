package common.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleneiumUtilities {
	LogHelper objLogHelper = new LogHelper();
	org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	
	
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
}
