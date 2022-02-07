package common.RediffMail.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.RediffMail.PageFactory.RediffmailLoginPage;
import common.Utility.TestBaseClass;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

/**
 * @author Raghav Agnihotri
 * @since 01302022
 * @description: this is a test to validate presence of objects in Rediffmail User Login Page
 */

public class VerifyObjectsOfLoginPage extends TestBaseClass {
	RediffmailLoginPage objRediffmailLoginPage = new RediffmailLoginPage();
	
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : CreateNewAccountLink")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : CreateNewAccountLink",priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfCreateNewAccountLink() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of CreateNewAccountLink
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getCreateNewAccountLink()),"Create new account link presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : ForgotPasswordButton")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : ForgotPasswordButton",priority = 1)
	@Severity(SeverityLevel.CRITICAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfForgotPasswordButton() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of ForgotPasswordButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getForgotPasswordButton()),"Forgot Password Button  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : KeepMeSignedInCheckBox")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : KeepMeSignedInCheckBox",priority = 3)
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfKeepMeSignedInCheckBox() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of KeepMeSignedInCheckBox
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getKeepMeSignedInCheckBox()),"Keep Me Signed In CheckBox  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : SignInButton")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : SignInButton",priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfSignInButton() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getSignInButton()),"Sign In Button  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : UserNameTextBox")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : UserNameTextBox",priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfUserNameTextBox() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getUserNameTextBox()),"User Name Text Box  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : UserPasswordTextBox")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : UserPasswordTextBox",priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfUserPasswordTextBox() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getUserPasswordTextBox()),"User Password Text Box  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : DiclaimerLink")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : DiclaimerLink",priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfDiclaimerLink() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getDiclaimerLink()),"Diclaimer Link  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : PrivacyPolicyLink")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : PrivacyPolicyLink",priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfPrivacyPolicyLink() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getPrivacyPolicyLink()),"Privacy Policy Link  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : RediffDotComLink")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : RediffDotComLink",priority = 2)
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfRediffDotComLink() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getRediffDotComLink()),"RediffDotComLink  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : TopNewsSection")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : TopNewsSection",priority = 1)
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfTopNewsSection() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getTopNewsSection()),"TopNewsSection  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : SecureLoginText")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : SecureLoginText",priority = 3)
	@Severity(SeverityLevel.MINOR)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfSecureLoginText() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getSecureLoginText()),"SecureLoginText  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
	
	@Description("This is a basic test to verify the presence of basic elements in login page of Rediffmail : DisclaimerText")
	@Test(description = "This is a basic test to verify the presence of basic elements in login page of Rediffmail : DisclaimerText",priority = 3)
	@Severity(SeverityLevel.MINOR)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfDisclaimerText() {
		// Get Class Name
		String testCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		//Validate presence of SignInButton
		Assert.assertTrue(objSeleneiumUtilities.isDisplayed(driver, objRediffmailLoginPage.getDisclaimerText()),"DisclaimerText  presnet");
		
		//Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
}
