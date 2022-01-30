package common.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
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
	public GenericHelper objGenricHelper =new GenericHelper();
	EmailHelper objEmailHelper =new EmailHelper();
	LogHelper objLogHelper = new LogHelper();
	org.apache.log4j.Logger Log = objLogHelper.getLogger(getClass());
	
	
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
	public void initializeBrowser(String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Log.info("Lanching browser :Chrome");
			driver.get(objGenricHelper.readFromPropertiesFile("BaseURL"));
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("firefox")) {
			
			/*
			 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
			 * Log.info("Lanching browser :Fire Fox");
			 */
			 
			System. setProperty("webdriver.gecko.driver", "G:\\Automation_Projects\\WebDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(objGenricHelper.readFromPropertiesFile("BaseURL"));
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			Log.info("Lanching browser :EDGE");
			driver.get(objGenricHelper.readFromPropertiesFile("BaseURL"));
			driver.manage().window().maximize();

		} else {
			System.out.println("Browser Not Specified Launching browser :Chrome");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(objGenricHelper.readFromPropertiesFile("BaseURL"));
			driver.manage().window().maximize();

		}
	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
		Log.info("Browser Window Closed");
		
	}
	
	@AfterSuite
	public void sendEmailReport() {
		objEmailHelper.SendEmailReport();
		Log.info("Email report sent");
	}
}