import org.testng.annotations.Test;

public class FirstTestCase {

	@Test(priority=1)
	void setup() {
		System.out.println("This is first Test Case class");
		System.out.println("This is setup test");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("this is Login test");
	}
	
	@Test(priority=3)
	void teardown() {
		System.out.println("closing browser");
	}
	
}
