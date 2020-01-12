package week1.day2;

import java.util.Arrays;

public class LearnStatic {
	static int[] num = {10};
	public static void main(String[] args) {
		System.out.println(num);
//		LearnStatic obj = new LearnStatic();
//		obj.display();
		display();
		PrimeNumber.show();
		Arrays.sort(num);
	}
//	static methods doesn't require an object to be called
	public static void display() {
		System.out.println("Displayed");
	}
		
	static {
		System.out.println("I'm inside a static block !!");
	}
		
		
		
		
		
		
		
		
	
	
}
