package common.RediffMail.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleFireFOxTest {
	
	@Test
	public void testFire() {
		WebDriver driver;
		System. setProperty("webdriver.gecko.driver", "G:\\Automation_Projects\\WebDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https:\\google.com");
		driver.manage().window().maximize();
	}
}
