package common.RediffMail.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.RediffMail.PageFactory.RediffmailLoginPage;
import common.Utility.DirectoryHelper;
import common.Utility.GenericHelper;
import common.Utility.LogHelper;
import common.Utility.TakeScreenShot;
import common.Utility.TestBaseClass;
import io.qameta.allure.Description;

/**
 * @author Raghav Agnihotri
 * @since 01302022
 * @description: contains reference to all the elements of reddifmail login page
 * @implNote : to be extended by all test classes
 */

public class VerifyObjectsOfLoginPage extends TestBaseClass {
	RediffmailLoginPage objRediffmailLoginPage = new RediffmailLoginPage();
	DirectoryHelper objDirectoryHelper = new DirectoryHelper();
	LogHelper objLogHelper = new LogHelper();
	org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	TakeScreenShot screenShot = new TakeScreenShot();	

	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : CreateNewAccountLink")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : CreateNewAccountLink",priority = 1)
	public void verifyPresenceOfCreateNewAccountLink() {
		// Get Class Name
		String testCaseName = this.getClass().getSimpleName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of CreateNewAccountLink
		Assert.assertTrue(driver.findElement(objRediffmailLoginPage.getCreateNewAccountLink()).isDisplayed(),"Create new account link presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : ForgotPasswordButton")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : ForgotPasswordButton",priority = 1)
	public void verifyPresenceOfForgotPasswordButton() {
		// Get Class Name
		String testCaseName = this.getClass().getSimpleName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of ForgotPasswordButton
		Assert.assertTrue(driver.findElement(objRediffmailLoginPage.getForgotPasswordButton()).isDisplayed(),"Forgot Password Button  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : KeepMeSignedInCheckBox")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : KeepMeSignedInCheckBox",priority = 3)
	public void verifyPresenceOfKeepMeSignedInCheckBox() {
		// Get Class Name
		String testCaseName = this.getClass().getSimpleName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of KeepMeSignedInCheckBox
		Assert.assertTrue(driver.findElement(objRediffmailLoginPage.getKeepMeSignedInCheckBox()).isDisplayed(),"Keep Me Signed In CheckBox  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : SignInButton")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : SignInButton",priority = 1)
	public void verifyPresenceOfSignInButton() {
		// Get Class Name
		String testCaseName = this.getClass().getSimpleName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(driver.findElement(objRediffmailLoginPage.getSignInButton()).isDisplayed(),"Sign In Button  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : UserNameTextBox")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : UserNameTextBox",priority = 1)
	public void verifyPresenceOfUserNameTextBox() {
		// Get Class Name
		String testCaseName = this.getClass().getSimpleName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(driver.findElement(objRediffmailLoginPage.getUserNameTextBox()).isDisplayed(),"User Name Text Box  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : UserPasswordTextBox")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : UserPasswordTextBox",priority = 1)
	public void verifyPresenceOfUserPasswordTextBox() {
		// Get Class Name
		String testCaseName = this.getClass().getSimpleName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(driver.findElement(objRediffmailLoginPage.getUserPasswordTextBox()).isDisplayed(),"User Password Text Box  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	
}
