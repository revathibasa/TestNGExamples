import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

	@BeforeClass
	void beforeClass() {
		System.out.println("This will execute before all methods i.e., before class");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("This will execute before every Method");
	}
	
	@Test
	void test1(){
		System.out.println("This is test1...");
	}
	
	@Test
	void test2() {
		System.out.println("This is test2...");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("this will execute after every method");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("This will execute after all methods i.e., after class");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("this will execute before the test");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("this will execute after the test");
	}
	
}
