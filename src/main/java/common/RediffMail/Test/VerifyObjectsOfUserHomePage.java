package common.RediffMail.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.RediffMail.PageFactory.RediffmailLoginPage;
import common.RediffMail.PageFactory.UserHomePage;
import common.RediffMail.PageFuntions.LoginPageFuntions;
import common.Utility.TestBaseClass;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

/**
 * @author Raghav Agnihotri
 * @since 02072022
 * @description: contains reference to all the elements of reddifmail login page
 * @implNote : to be extended by all test classes
 */

public class VerifyObjectsOfUserHomePage extends TestBaseClass {
	UserHomePage objUserHomePage = new UserHomePage();
	LoginPageFuntions objLoginPageFuntions = new LoginPageFuntions();

	@Test(priority = 1, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : rediffHomePageLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : rediffHomePageLink")
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfrediffHomePageLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		// Login Into Application
		objLoginPageFuntions.loginIntoRediffMail(driver, getClass().getSimpleName());

		// Verify presence of homepage link
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getRediffHomePageLink());
		if (flag)
			Log.info("Dispalayed : RediffHomePageLink");
		else
			Log.error("Not Dispalayed : RediffHomePageLink");
		Assert.assertTrue(flag, "RediffHomePageLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SearchTextBox")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SearchTextBox")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfSearchTextBox() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of SearchTextBox
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getSearchTextBox());
		if (flag)
			Log.info("Dispalayed : SearchTextBox");
		else
			Log.error("Not Dispalayed : SearchTextBox");
		Assert.assertTrue(flag, "SearchTextBox dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : AdvanceSearhLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : AdvanceSearhLink")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfAdvanceSearhLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getAdvanceSearhLink());
		if (flag)
			Log.info("Dispalayed : AdvanceSearhLink");
		else
			Log.error("Not Dispalayed : AdvanceSearhLink");
		Assert.assertTrue(flag, "AdvanceSearhLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SearchIcon")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SearchIcon")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfSearchIcon() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getSearchIcon());
		if (flag)
			Log.info("Dispalayed : SearchIcon");
		else
			Log.error("Not Dispalayed : SearchIcon");
		Assert.assertTrue(flag, "SearchIcon dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : UserProfileLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : UserProfileLink")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfUserProfileLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getUserProfileLink());
		if (flag)
			Log.info("Dispalayed : UserProfileLink");
		else
			Log.error("Not Dispalayed : UserProfileLink");
		Assert.assertTrue(flag, "UserProfileLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SettingsLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SettingsLink")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfSettingsLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getSettingsLink());
		if (flag)
			Log.info("Dispalayed : SettingsLink");
		else
			Log.error("Not Dispalayed : SettingsLink");
		Assert.assertTrue(flag, "SettingsLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SettingsButton")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SettingsButton")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfSettingsButton() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getSettingsButton());
		if (flag)
			Log.info("Dispalayed : SettingsButton");
		else
			Log.error("Not Dispalayed : SettingsButton");
		Assert.assertTrue(flag, "SettingsButton dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : LogOutLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : LogOutLink")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfLogOutLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getLogOutLink());
		if (flag)
			Log.info("Dispalayed : LogOutLink");
		else
			Log.error("Not Dispalayed : LogOutLink");
		Assert.assertTrue(flag, "LogOutLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : WriteMailTabButton")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : WriteMailTabButton")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfWriteMailTabButton() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getWriteMailTabButton());
		if (flag)
			Log.info("Dispalayed : WriteMailTabButton");
		else
			Log.error("Not Dispalayed : WriteMailTabButton");
		Assert.assertTrue(flag, "WriteMailTabButton dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : InboxTabButton")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : InboxTabButton")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfInboxTabButton() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getInboxTabButton());
		if (flag)
			Log.info("Dispalayed : InboxTabButton");
		else
			Log.error("Not Dispalayed : InboxTabButton");
		Assert.assertTrue(flag, "InboxTabButton dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : BulkTaBButton")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : BulkTaBButton")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfBulkTaBButton() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getBulkTaBButton());
		if (flag)
			Log.info("Dispalayed : BulkTaBButton");
		else
			Log.error("Not Dispalayed : BulkTaBButton");
		Assert.assertTrue(flag, "BulkTaBButton dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : JunkTabButton")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : JunkTabButton")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfJunkTabButton() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getJunkTabButton());
		if (flag)
			Log.info("Dispalayed : JunkTabButton");
		else
			Log.error("Not Dispalayed : JunkTabButton");
		Assert.assertTrue(flag, "JunkTabButton dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SentTabButton")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : SentTabButton")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfSentTabButton() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getSentTabButton());
		if (flag)
			Log.info("Dispalayed : SentTabButton");
		else
			Log.error("Not Dispalayed : SentTabButton");
		Assert.assertTrue(flag, "SentTabButton dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : TrashTabButton")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : TrashTabButton")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfTrashTabButton() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getTrashTabButton());
		if (flag)
			Log.info("Dispalayed : TrashTabButton");
		else
			Log.error("Not Dispalayed : TrashTabButton");
		Assert.assertTrue(flag, "TrashTabButton dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : DraftsTabButton")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : DraftsTabButton")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfDraftsTabButton() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getDraftsTabButton());
		if (flag)
			Log.info("Dispalayed : DraftsTabButton");
		else
			Log.error("Not Dispalayed : DraftsTabButton");
		Assert.assertTrue(flag, "DraftsTabButton dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : AddNewFolderIcon")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : AddNewFolderIcon")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfAddNewFolderIcon() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getAddNewFolderIcon());
		if (flag)
			Log.info("Dispalayed : AddNewFolderIcon");
		else
			Log.error("Not Dispalayed : AddNewFolderIcon");
		Assert.assertTrue(flag, "AddNewFolderIcon dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : FoldersExpandIcon")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : FoldersExpandIcon")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfFoldersExpandIcon() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getFoldersExpandIcon());
		if (flag)
			Log.info("Dispalayed : FoldersExpandIcon");
		else
			Log.error("Not Dispalayed : FoldersExpandIcon");
		Assert.assertTrue(flag, "FoldersExpandIcon dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : AddressBookIcon")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : AddressBookIcon")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfAddressBookIcon() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getAddressBookIcon());
		if (flag)
			Log.info("Dispalayed : AddressBookIcon");
		else
			Log.error("Not Dispalayed : AddressBookIcon");
		Assert.assertTrue(flag, "AddressBookIcon dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : CalendarIcon")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : CalendarIcon")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfCalendarIcon() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getCalendarIcon());
		if (flag)
			Log.info("Dispalayed : CalendarIcon");
		else
			Log.error("Not Dispalayed : CalendarIcon");
		Assert.assertTrue(flag, "CalendarIcon dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : DisclaimerLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : DisclaimerLink")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfDisclaimerLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getDisclaimerLink());
		if (flag)
			Log.info("Dispalayed : DisclaimerLink");
		else
			Log.error("Not Dispalayed : DisclaimerLink");
		Assert.assertTrue(flag, "DisclaimerLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : PrivacyPolicyLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : PrivacyPolicyLink")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfPrivacyPolicyLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getPrivacyPolicyLink());
		if (flag)
			Log.info("Dispalayed : PrivacyPolicyLink");
		else
			Log.error("Not Dispalayed : PrivacyPolicyLink");
		Assert.assertTrue(flag, "PrivacyPolicyLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : tNcLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : tNcLink")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOftNcLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.gettNcLink());
		if (flag)
			Log.info("Dispalayed : tNcLink");
		else
			Log.error("Not Dispalayed : tNcLink");
		Assert.assertTrue(flag, "tNcLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : FeedBackLink")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : FeedBackLink")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfFeedBackLink() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getFeedBackLink());
		if (flag)
			Log.info("Dispalayed : FeedBackLink");
		else
			Log.error("Not Dispalayed : FeedBackLink");
		Assert.assertTrue(flag, "FeedBackLink dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

	@Test(priority = 2, description = "This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : CopyRightText")
	@Description("This is a basic test to verify the presence of basic elements in User Home page of Rediffmail : CopyRightText")
	@Severity(SeverityLevel.NORMAL)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void verifyPresenceOfCopyRightText() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);

		// Verify presence of AdvanceSearhLink
		boolean flag = objSeleneiumUtilities.isDisplayed(driver, objUserHomePage.getCopyRightText());
		if (flag)
			Log.info("Dispalayed : CopyRightText");
		else
			Log.error("Not Dispalayed : CopyRightText");
		Assert.assertTrue(flag, "CopyRightText dispayed");
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}
}
