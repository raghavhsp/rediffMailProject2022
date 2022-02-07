package common.RediffMail.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** @author Raghav Agnihotri
 * @since 01292022
 * created to locate all the web elements of Rediffmail Logged Out page
 * has getter methods to return values as Bys
*/

public class LoggedOutPage {
	WebDriver driver;

	// WebElement Locators
	/* 1 */  private By loggedOutText = By.xpath("//p[text()='You have successfully signed out of Rediffmail.']");
	/* 2 */  private By rediffHomeImgLink = By.xpath("//a[@href='http://www.rediff.com/']");
	/* 3 */  private By feedBackLink = By.xpath("//a[@href='http://support.rediff.com/support/rediffmailsupport.htm']");
	/* 4 */  private By rediffHomeLink = By.xpath("//a[@href='http://www.rediff.com']");
	/* 5 */  private By topHeadlineSection = By.xpath("//h3[text()='Top Headlines']/parent::div");
	/* 6 */  private By disclaimerLink = By.xpath("//div[text()='Copyright © 2022 Rediff.com India Limited. All Rights Reserved.']");
	/* 7 */
	
	public WebDriver getDriver() {
		return driver;
	}
	public By getLoggedOutText() {
		return loggedOutText;
	}
	public By getRediffHomeImgLink() {
		return rediffHomeImgLink;
	}
	public By getFeedBackLink() {
		return feedBackLink;
	}
	public By getRediffHomeLink() {
		return rediffHomeLink;
	}
	public By getTopHeadlineSection() {
		return topHeadlineSection;
	}
	public By getDisclaimerLink() {
		return disclaimerLink;
	}  
}
