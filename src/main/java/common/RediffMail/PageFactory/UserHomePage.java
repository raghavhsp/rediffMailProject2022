package common.RediffMail.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** @author Raghav Agnihotri
 * @since 02062022
 * created to locate all the web elements of Rediffmail User Home Page
 * has getter methods to return values as By s
*/

public class UserHomePage {
	WebDriver driver;

	// WebElement Locators
/*1*/	private By rediffHomePageLink = By.xpath("//a[@title='Go back to Rediff.com homepage']");
	
/*2*/	private By searchTextBox = By.xpath("//input[@id='inp_search_box']");
/*3*/	private By advanceSearhLink= By.xpath("//a[text()='Advanced + ']");
/*4*/	private By searchIcon = By.xpath("//button[@class='rd_srcbtn']//b");
/*5*/	private By userProfileLink = By.xpath("//a[@href='http://mypage.rediff.com/profile/myprofile']");
/*6*/	private By settingsLink = By.xpath("//a[@class='rd_setting_panel']");
/*7*/	private By settingsButton = By.xpath("//a[@class='rd_setting_panel']//b");
/*8*/	private By logOutLink = By.xpath("//a[text()='Logout']");
	
/*9*/	private By writeMailTabButton = By.xpath("//ul/li[@title='Compose a new mail']/a/b[text()='Write mail']");
/*10*/	private By inboxTabButton =By.xpath("//ul//li[@item-folder='Inbox']//a[text()='Inbox']");
/*11*/	private By bulkTaBButton = By.xpath("//ul//li[@item-folder='Bulk']//a[text()='Bulk']");
/*12*/	private By junkTabButton = By.xpath("//ul//li[@item-folder='Junk']//a[text()='Junk']");
/*12*/	private By sentTabButton = By.xpath("//ul//li[@item-folder='Sent_messages']//a[text()='Sent']");
/*14*/	private By trashTabButton = By.xpath("//ul//li[@item-folder='Trash']//a[text()='Trash']");
/*15*/	private By draftsTabButton = By.xpath("//ul//li[@item-folder='Drafts']//a[text()='Drafts']");
	
/*16*/	private By addNewFolderIcon= By.xpath("//span[@title='Add a new folder']");
/*17*/	private By foldersExpandIcon =By.xpath("//span[@title='Add a new folder']//following-sibling::i");
/*18*/	private By addressBookIcon = By.xpath("//h4[@title='Address Book']");
/*19*/	private By calendarIcon= By.xpath("//h4[@title='Calendar']");
	
/*20*/	private By disclaimerLink = By.xpath("//a[text()='Disclaimer']");
/*21*/	private By privacyPolicyLink = By.xpath("//a[text()='Privacy Policy']");
/*22*/	private By tNcLink = By.xpath("//a[text()='T&C']");
/*23*/	private By feedBackLink = By.xpath("//a[text()='Feedback']");
/*24*/	private By copyRightText = By.xpath("//span[text()='© 2022 Rediff.com India Limited.']");
	
	
	public By getRediffHomePageLink() {
		return rediffHomePageLink;
	}
	public By getSearchTextBox() {
		return searchTextBox;
	}
	public By getAdvanceSearhLink() {
		return advanceSearhLink;
	}
	public By getSearchIcon() {
		return searchIcon;
	}
	public By getUserProfileLink() {
		return userProfileLink;
	}
	public By getSettingsLink() {
		return settingsLink;
	}
	public By getSettingsButton() {
		return settingsButton;
	}
	public By getLogOutLink() {
		return logOutLink;
	}
	public By getWriteMailTabButton() {
		return writeMailTabButton;
	}
	public By getInboxTabButton() {
		return inboxTabButton;
	}
	public By getBulkTaBButton() {
		return bulkTaBButton;
	}
	public By getJunkTabButton() {
		return junkTabButton;
	}
	public By getSentTabButton() {
		return sentTabButton;
	}
	public By getTrashTabButton() {
		return trashTabButton;
	}
	public By getDraftsTabButton() {
		return draftsTabButton;
	}
	public By getAddNewFolderIcon() {
		return addNewFolderIcon;
	}
	public By getFoldersExpandIcon() {
		return foldersExpandIcon;
	}
	public By getAddressBookIcon() {
		return addressBookIcon;
	}
	public By getCalendarIcon() {
		return calendarIcon;
	}
	public By getDisclaimerLink() {
		return disclaimerLink;
	}
	public By getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}
	public By gettNcLink() {
		return tNcLink;
	}
	public By getFeedBackLink() {
		return feedBackLink;
	}
	public By getCopyRightText() {
		return copyRightText;
	}
	
}
