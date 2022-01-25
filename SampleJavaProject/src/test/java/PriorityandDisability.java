import org.testng.annotations.Test;

public class PriorityandDisability {

	@Test(priority=0)
	void testOne() {
		System.out.println("this is test one");
	}
	
	@Test(priority=1)
	void testTwo() {
		System.out.println("this is test two");
	}
	
	@Test(priority=2)
	void testThree() {
		System.out.println("this is test three");
	}
	
	@Test(priority=3,enabled=false)
	void testFour() {
		System.out.println("this is test four");
	}
}
