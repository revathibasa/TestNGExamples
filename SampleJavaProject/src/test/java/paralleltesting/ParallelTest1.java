package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest1 {
	
	
	@Test
	void logoTest() throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./webDrivers/chromedriver.exe");
		driver = new ChromeDriver();	    
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
//	    Thread.sleep(1000);
	    WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")); 
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");
		System.out.println("Logo-check");
		driver.quit();
	}
	
	@Test
	void homePageTitle() {
		WebDriver driver1;
		System.setProperty("webdriver.chrome.driver", "./webDrivers/chromedriver.exe");
		driver1 = new ChromeDriver();
	    driver1.manage().window().maximize();
		driver1.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver1.getTitle();
		Assert.assertEquals("OrangeHRM", title,"Title is not matched");
		System.out.println("Title-check");
		driver1.quit();
	}
	
}
