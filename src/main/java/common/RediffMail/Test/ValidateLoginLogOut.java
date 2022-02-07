package common.RediffMail.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.RediffMail.PageFactory.RediffmailLoginPage;
import common.RediffMail.PageFactory.UserHomePage;
import common.RediffMail.PageFuntions.HomePageFuntions;
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
 * @description: this is a test to validate Login Logout funtionality
 */

public class ValidateLoginLogOut extends TestBaseClass {
	public UserHomePage objUserHomePage = new UserHomePage();
	public LoginPageFuntions objLoginPageFuntions = new LoginPageFuntions();
	public HomePageFuntions objHomePageFuntions = new HomePageFuntions();
	
	@Test(priority = 1, description = "This test is to validate login logout funtionalities")
	@Description("This test is to validate login logout funtionalities")
	@Severity(SeverityLevel.BLOCKER)
	@Epic("EPIC:RediffMail Funtaionality Test")
	@Story("STORY: Basic Verificaions of WebElements")
	public void ValidateLoginLogOut_test() {
		// Get Class Name
		String testCaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		
		// Create Test Result Folder with Function Name And Date Time Stamp
		String testResultFolderPath = objDirectoryHelper.createDirectoryForTestResult(testCaseName);
		
		// Log TEST START
		objLogHelper.testCaseStartLogCreator(testCaseName);
		
		// Login Into Application
		objLoginPageFuntions.loginIntoRediffMail(driver, testCaseName);
		
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);

		// LogOut of Application
		objHomePageFuntions.logOutOfRediffMail(driver, testCaseName);
		
		// Take Screenshot
		screenShot.takeNewScreenShot(driver, testResultFolderPath);
		// Log TEST END
		objLogHelper.testCaseEndLogCreator(testCaseName);
	}

}
