package common.RediffMail.PageFuntions;
import org.openqa.selenium.WebDriver;
import common.RediffMail.PageFactory.RediffmailLoginPage;
import common.Utility.*;

/**
 * @author Raghav Agnihotri
 * @since 06/02/2022
 * @description: contains functions available on Rediffmail Login Page
 */

public class LoginPageFuntions {
	public WebDriver driver;
	public GenericHelper objGenricHelper = new GenericHelper();
	public EmailHelper objEmailHelper = new EmailHelper();
	public LogHelper objLogHelper = new LogHelper();
	public org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	RediffmailLoginPage objRediffmailLoginPage = new RediffmailLoginPage();
	
	
	public void loginIntoRediffMail(String UserName , String Password) {
	
	}
}
