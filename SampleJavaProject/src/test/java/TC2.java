import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC2 {

	@BeforeClass
	void beforeClass() {
		System.out.println("This will execute before all methods i.e., before class");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("This will execute before every Method");
	}
	
	@Test
	void test3(){
		System.out.println("This is test3...");
	}
	
	@Test
	void test4() {
		System.out.println("This is test4...");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("this will execute after every method");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("This will execute after all methods i.e., after class");
	}
	
	@BeforeSuite
	void beforesuite() {
		System.out.println("this will execute before the suite");
	}
	
	@AfterSuite
	void aftersuite() {
		System.out.println("this will execute after the suite");
	}
	
}
