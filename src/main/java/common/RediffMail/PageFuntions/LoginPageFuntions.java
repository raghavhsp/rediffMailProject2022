package common.RediffMail.PageFuntions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import common.RediffMail.PageFactory.RediffmailLoginPage;
import common.RediffMail.PageFactory.UserHomePage;
import common.Utility.*;
import io.qameta.allure.Step;

/**
 * @author Raghav Agnihotri
 * @since 06/02/2022
 * @description: contains functions available on Rediffmail Login Page
 */

public class LoginPageFuntions {
	public SeleneiumUtilities objSeleneiumUtilities = new SeleneiumUtilities();
	public GenericHelper objGenricHelper = new GenericHelper();
	public EmailHelper objEmailHelper = new EmailHelper();
	public LogHelper objLogHelper = new LogHelper();
	public org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	public RediffmailLoginPage objRediffmailLoginPage = new RediffmailLoginPage();
	public UserHomePage objUserHomePage = new UserHomePage();
	public DataReader objDataReader = new DataReader();
	
	@Step("Funtion to log into rediffmail")
	public boolean loginIntoRediffMail(WebDriver driver ,String testCaseName) {
		objSeleneiumUtilities.sendKeys(driver, objRediffmailLoginPage.getUserNameTextBox(), (objDataReader.getTestCaseData(testCaseName, "UserName")));
		objSeleneiumUtilities.sendKeys(driver, objRediffmailLoginPage.getUserPasswordTextBox(), (objDataReader.getTestCaseData(testCaseName, "Password")));
		objSeleneiumUtilities.click(driver, objRediffmailLoginPage.getSignInButton());
		objSeleneiumUtilities.waitForWebElementToBeVisible(driver, objUserHomePage.getLogOutLink());
		boolean flag=objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getLogOutLink());
		if (flag) Log.info("Login into application : SUCCESSFULL");
		Assert.assertTrue(flag ,"Able to log into applciation");
		return flag;
	}
	
}
