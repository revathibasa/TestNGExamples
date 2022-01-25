import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExamples {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver", "./webDrivers/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    }
	
	@Test(priority=1)
	void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")); 
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");
	}
	
	@Test(priority=2)
	void homepageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", title,"Title is not matched");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
