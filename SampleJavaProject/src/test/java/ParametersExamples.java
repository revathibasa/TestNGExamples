import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExamples {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String browser, String app) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./webDrivers/chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./webDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(app);
	}
	
	@Test(priority=1)
	void logoTest() throws InterruptedException {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")); 
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");
	}
	
	@Test(priority=2)
	void homepageTitle() throws InterruptedException {
		String title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", title,"Title is not matched");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
