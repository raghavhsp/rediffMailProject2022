package common.RediffMail.PageFuntions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import common.RediffMail.PageFactory.LoggedOutPage;
import common.RediffMail.PageFactory.RediffmailLoginPage;
import common.RediffMail.PageFactory.UserHomePage;
import common.Utility.*;
import io.qameta.allure.Step;

/**
 * @author Raghav Agnihotri
 * @since 07/02/2022
 * @description: contains functions available on Rediffmail User Home Page
 */

public class HomePageFuntions {
	public SeleneiumUtilities objSeleneiumUtilities = new SeleneiumUtilities();
	public GenericHelper objGenricHelper = new GenericHelper();
	public EmailHelper objEmailHelper = new EmailHelper();
	public LogHelper objLogHelper = new LogHelper();
	public org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	public RediffmailLoginPage objRediffmailLoginPage = new RediffmailLoginPage();
	public UserHomePage objUserHomePage = new UserHomePage();
	public DataReader objDataReader = new DataReader();
	public LoggedOutPage objLoggedOutPage = new LoggedOutPage();
	
	@Step("Funtion to Log Out of rediffmail")
	public boolean logOutOfRediffMail(WebDriver driver ,String testCaseName) {
		objSeleneiumUtilities.click(driver, objUserHomePage.getLogOutLink());
		objSeleneiumUtilities.waitForWebElementToBeVisible(driver, objLoggedOutPage.getLoggedOutText());
		boolean flag=objSeleneiumUtilities.isDisplayed(driver, objLoggedOutPage.getLoggedOutText());
		if (flag) Log.info("Logging Out of application : SUCCESSFULL");
		Assert.assertTrue(flag ,"Able to log out of applciation");
		return flag;
	}
}
