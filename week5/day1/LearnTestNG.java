package week5.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class LearnTestNG {
	
//	Executes based on ASCII order	
//	enabled suppresses priority attribute
	@Test(enabled=false, priority=1)
	public void test2() {
		System.out.println("Test case 2");
	}
	
	@Test()
	public void test1() { 
		System.out.println("Test case 1");
		throw new RuntimeException();
	}
//	works based on ASCII order when there is more depending test cases
	
//  when the parent gets failed
//	the depending will gets skipped
	@Test(dependsOnMethods={"week5.day1.LearnTestNG.test1"}, alwaysRun=true) 
	public void test3() { //depending test cases
		System.out.println("Test case 3");
	}
	
	
	
	
	
	
	
	
	

}
