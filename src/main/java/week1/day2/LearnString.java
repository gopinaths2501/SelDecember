package week1.day2;

public class LearnString {
	public static void main(String[] args) {

		//String - a non primitive datatype
		//String is a class

		//Type - 1 syntax to initialize a String
		//String literal method
		String text1 = "Testleaf";
		String text2 = "Chennai";
		
		//Type - 2 syntax to initialize a String
		//String Class Object method
		/*String name = new String("Testleaf");
		System.out.println(name);*/
		
		System.out.println(text1);
		
		/*text.length() - Used to get the length of the text -> int
		int length = text.length();
		System.out.println("Length of the String: "+length);*/
		
		/*text.toLowerCase() - Used to cast all the characters in lowercase -> String
		System.out.println(text.toLowerCase());*/
		
		/*text.toUpperCase() - Used to cast all the characters in Uppercase -> String
		System.out.println(text.toUpperCase());*/
		
		/*text.trim() - Used to trim the spaces in the front and back of the String -> String
		System.out.println(text.trim());*/
		
		/*text.equals("") - Used to compare two Strings with the exact match with case sensitivity -> boolean
		System.out.println(text1.equals(text2));*/
		
		/*text.equalsIgnoreCase("") - Used to compare two Strings with the exact match without case sensitivity -> boolean
		System.out.println(text1.equalsIgnoreCase(text2));*/
		
		/*text.contains("") - Used to verify String contains a part that is given -> boolean
		System.out.println(text1.contains("af"));*/
		
		/*text.concat("") - Used to concatinate two Strings -> String
		System.out.println(text1.concat(" ").concat(text2));
		System.out.println(text1.concat(text2));*/
		
		/*text.charAt(1) - Used to get the character in the given String -> char
		System.out.println(text1.charAt(3));*/
		
		/*text.split(regex) - Used to spilt the String using given regex (Delimiter) -> String[]
		String[] array = text1.split(" ");
		for(String eachWord:array) {
			System.out.println(eachWord);
		}*/
		
		/*text.toCharArray() - Used to split a String into a individual characters -> char[]
		char[] array = text1.toCharArray();
		for(char ch:array) {
			System.out.println(ch);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}*/
		
		/*text.replace(oldChar, newChar) - Used to replace a particular old character into a new character in the given String - String
		System.out.println(text1.replace('l', 'L'));*/
		
		/*text1.substring(beginIndex, endIndex)- used to take a part of a string
		System.out.println(text1.substring(4));
		System.out.println(text1.substring(0,4));*/
		
		/*System.out.println(text1.startsWith("T"));
		System.out.println(text1.endsWith("f"));*/
		
		System.out.println(Character.isDigit('0'));
		







		/*
		
		
		
		
		
		
		
		
		
		text.replaceAll(regex, replacement) - Used to replace all the characters as per the given regex into a replacement String - String
		 */
	}

}
