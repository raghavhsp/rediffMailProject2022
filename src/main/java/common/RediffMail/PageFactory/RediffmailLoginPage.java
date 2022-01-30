package common.RediffMail.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* @author Raghav Agnihotri
 * @since 01292022
 * created to locate all the web elements of Rediffmail login page
 * has getter methods to return values as Bys
*/

public class RediffmailLoginPage {
	WebDriver driver;

	// Weblement Locators
	private By userNameTextBox = By.xpath("//input[contains(@id,'login')]asdasd");
	private By userPasswordTextBox = By.xpath("//input[contains(@id,'password')]");
	private By keepMeSignedInCheckBox = By.xpath("//input[contains(@id,'remember')]");
	private By signInButton = By.xpath("//input[contains(@title,'Sign in')]");
	private By forgotPasswordButton = By.xpath("//a[@href]//u[contains(text(),'Forgot')]");
	private By createNewAccountLink = By.xpath("//a[@href]//u[contains(text(),'new account')]");

	// Getter methods of WebElements
	public By getCreateNewAccountLink() {
		return createNewAccountLink;
	}

	public By getForgotPasswordButton() {
		return forgotPasswordButton;
	}

	public By getSignInButton() {
		return signInButton;
	}

	public By getKeepMeSignedInCheckBox() {
		return keepMeSignedInCheckBox;
	}

	public By getUserPasswordTextBox() {
		return userPasswordTextBox;
	}

	public By getUserNameTextBox() {
		return userNameTextBox;
	}
}
