package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class parallelTest2 {

	@Test
	void loginTest() throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./webDrivers/chromedriver.exe");
		driver = new ChromeDriver();	    
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
//	    Thread.sleep(1000);
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
	    driver.findElement(By.id("btnLogin")).click();	    
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		System.out.println("Login-check");
		driver.quit();
	}
}
