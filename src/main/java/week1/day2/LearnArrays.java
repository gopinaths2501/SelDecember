package week1.day2;

import java.util.Arrays;

public class LearnArrays {
	/*
	 * Introduction to static, ASCII, Arrays, foreach
	 * Exceptions: ArrayIndexOutOfBoundsException
	 * 
	 */

	public static void main(String[] args) {
		String brand = "Maruti";
		
		
	/*	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Size of the array: "+numbers.length);*/
	
		
		String[] brands = {"BMW","Audi","Ferrari","Tata","Nissan"};
		System.out.println(brands.length);
		System.out.println("Last value: "+brands[brands.length-1]);
		/*foreach -> travel without the index
		syntax-> foreach ctrl+space, Enter
		foreach -> unidirectional travel*/
		Arrays.sort(brands);
		for (String eachBrand : brands) {
			System.out.println(eachBrand);
		}
		
		//To print in reverse order
		/*for (int i = brands.length-1; i >= 0 ; i--) {
			System.out.println(brands[i]);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*char[] alphabets = new char[10];
		alphabets[0] = 'a';
		alphabets[1] = 'b';
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println("Alphabets: "+alphabets[i]);
		}*/
				
				
				
				
				
				
		
		
		/*// Arrays is a concept used to store multiple item of same type in a single name
		//Syntax to create an array
		String[] browsers = {"Chrome", "Firefox","Edge","IE"};
		//to find the size of the array
		int arrayLength = browsers.length;
		System.out.println("Array Length "+arrayLength);
		//To access the first item from the array
		String last = browsers[arrayLength-1];
		System.out.println(last);
		Arrays.sort(browsers);
		System.out.println(browsers[1]);*/

		
		
		
		//Create an array using object
		
		
		//multidimensional array
		
		
		



	}


}
