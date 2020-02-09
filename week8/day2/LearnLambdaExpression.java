package week8.day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Gopinath Jayakumar
 * */

public class LearnLambdaExpression {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("Sarath");
		ls.add("Hari");
		ls.add("Balaji");
		ls.add("Sam");
		ls.add("Naveen");

		// lambda operator -> body

		// Example 1
		ls.forEach(x -> System.out.println(x));
		System.out.println("****************************");

		// Example 2
		ls.forEach(x -> {if(x.startsWith("S")) System.out.println(x);});
		System.out.println("****************************");

		// Example 3
		ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
