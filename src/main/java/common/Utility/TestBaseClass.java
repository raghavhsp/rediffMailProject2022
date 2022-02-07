package common.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Raghav Agnihotri
 * @since 01/30/2022
 * @description: contains functions like initialize browser
 * @implNote : to be extended by all test classes
 */
public class TestBaseClass {
	// Initialization
	public WebDriver driver;
	public GenericHelper objGenricHelper = new GenericHelper();
	public EmailHelper objEmailHelper = new EmailHelper();
	public LogHelper objLogHelper = new LogHelper();
	public org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	public SeleneiumUtilities objSeleneiumUtilities = new SeleneiumUtilities();
	public DirectoryHelper objDirectoryHelper = new DirectoryHelper();
	public TakeScreenShot screenShot = new TakeScreenShot();
	public DataReader objDataReader = new DataReader();
	
	/**
	 * @Description: "initializeBrowser" is a function used setup driver
	 *               capabilities create a logger
	 * 
	 * @since 01302022
	 * 
	 * @return void
	 * 
	 * @author Raghav Agnihotri
	 * 
	 * @implNote takes test NG parameter "browser"
	 */
	@Parameters("browser")
	@BeforeTest
	@SuppressWarnings( "deprecation" )
	public void initializeBrowser(String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			try {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				Log.info("Lanching browser :Chrome");
				driver.get(objGenricHelper.readFromPropertiesFile("BaseURL"));
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(objGenricHelper.readIntFromPropertiesFile("PageLoadTimeOut"),TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(objGenricHelper.readIntFromPropertiesFile("ImplicitWaitTime"), TimeUnit.SECONDS);
			} catch (Exception e) {

				Log.error(e.getMessage());
			}

		} else if (browser.equalsIgnoreCase("firefox")) {

			try {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(); 
				Log.info("Lanching browser :Fire Fox");
				
				/*
				 * System. setProperty("webdriver.gecko.driver",
				 * "G:\\Automation_Projects\\WebDrivers\\geckodriver.exe"); 
				 * driver = new FirefoxDriver();
				 */
	
				driver.get(objGenricHelper.readFromPropertiesFile("BaseURL"));
				driver.manage().window().maximize();
			} catch (Exception e) {
				Log.error(e.getMessage());
			}

		} else if (browser.equalsIgnoreCase("edge")) {
			try {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				Log.info("Lanching browser :EDGE");
				driver.get(objGenricHelper.readFromPropertiesFile("BaseURL"));
				driver.manage().window().maximize();
			} catch (Exception e) {
				Log.error(e.getMessage());
			}

		} else {
			try {
				System.out.println("Browser Not Specified Launching browser :Chrome");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(objGenricHelper.readFromPropertiesFile("BaseURL"));
				driver.manage().window().maximize();
			} catch (Exception e) {
				Log.error(e.getMessage());
			}

		}
	}

	@AfterTest
	public void quitBrowser() {
		try {
			driver.quit();
			Log.info("Browser Window Closed");
		} catch (Exception e) {
			Log.error(e.getMessage());
		}

	}

	@AfterSuite
	public void sendEmailReport() {
		try {
			objEmailHelper.SendEmailReport();
			Log.info("Email report sent");
		} catch (Exception e) {
			Log.error(e.getMessage());
		}
	}
}