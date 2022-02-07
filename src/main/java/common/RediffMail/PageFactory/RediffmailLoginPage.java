package common.RediffMail.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** @author Raghav Agnihotri
 * @since 01292022
 * created to locate all the web elements of Rediffmail login page
 * has getter methods to return values as Bys
*/

public class RediffmailLoginPage {
	WebDriver driver;

	// WebElement Locators
	/* 1 */  private By userNameTextBox = By.xpath("//input[contains(@id,'login')]");
	/* 2 */  private By userPasswordTextBox = By.xpath("//input[contains(@id,'password')]");
	/* 3 */  private By keepMeSignedInCheckBox = By.xpath("//input[contains(@id,'remember')]");
	/* 4 */  private By signInButton = By.xpath("//input[contains(@title,'Sign in')]");
	/* 5 */  private By forgotPasswordButton = By.xpath("//a[@href]//u[contains(text(),'Forgot')]");
	/* 6 */  private By createNewAccountLink = By.xpath("//a[@href]//u[contains(text(),'new account')]");
	/* 7 */  private By rediffDotComLink = By.xpath("//a[@href='https://www.rediff.com']");
	/* 8 */  private By diclaimerLink = By.xpath("//a[@href='http://in.rediff.com/disclaim.htm']");
	/* 9 */  private By privacyPolicyLink = By.xpath("//a[@href='http://www.rediff.com/w3c/policy.html']");
	/* 10 */ private By topNewsSection = By.xpath("//div[@id='top_news_container']");
	/* 11 */ private By secureLoginText = By.xpath("//span[text()='Secured Login']");
	/* 12 */ private By disclaimerText = By.xpath("//div[text()='Copyright © 2022 Rediff.com India Limited. All rights reserved.']");
	
	
	public By getDisclaimerText() {
		return disclaimerText;
	}

	public By getSecureLoginText() {
		return secureLoginText;
	}

	public By getTopNewsSection() {
		return topNewsSection;
	}

	public By getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}

	public By getDiclaimerLink() {
		return diclaimerLink;
	}

	public By getRediffDotComLink() {
		return rediffDotComLink;
	}

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
