package common.Utility;

import java.io.File;
import java.io.IOException;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Raghav Agnihotri
 * @since 01302022
 * @description: contains funtions to help creation of screenshots
 */
public class TakeScreenShot {
	static int counter = 1;

	/**
	 * @Description: "takeNewScreenShot" used to take screenshot of current driver
	 *               window instance create a logger
	 * 
	 * @since 01302022
	 * 
	 * @return boolean
	 * 
	 * @author Raghav Agnihotri
	 * 
	 */

	@SuppressWarnings("deprecation")
	public boolean takeNewScreenShot(WebDriver driver, String testResultsFolderPath) {
		boolean flag = false;

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(testResultsFolderPath + "//" + Integer.toString(counter) + ".png"));
			System.out.println("screnshot created " + Integer.toString(counter) + ".png");
			Thread.sleep(4000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		counter++;
		return flag;
	}
}
