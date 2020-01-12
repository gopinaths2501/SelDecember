package week1.day2;

public class PrimeNumber {

	/*
	 * Prime number is a number that can be only divisible by 1 and itself
	 */

	public static void main(String[] args) {
		// Let us declare a number to check
		int number = 6;
		// Let us declare a counter to count the no of divisors
		int count = 0;
		// Iterate over a loop from a range from 1 till the number
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		// Check the counter, if it is 2 then prime number
		if (count == 2) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}

	}
	
	public static void show() {
		System.out.println("showed");
	}
	
	
	
	
	
	
	
	
	
	

}
