package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnList {
	
	public static void main(String[] args) {
//			<Generics>
		Set<Integer> listEmp = new LinkedHashSet();
		listEmp.add(11);
		listEmp.add(12);
		listEmp.add(13);
		listEmp.add(14);
		listEmp.add(15);
//		listEmp.remove("Naveen");
/*		System.out.println(listEmp.get(0));
		System.out.println(listEmp.contains("Sam"));
//		listEmp.clear();
		System.out.println(listEmp.isEmpty());
		System.out.println(listEmp.size());*/
//		Collections.sort(listEmp);
		for(int empName : listEmp) {
			System.out.println(empName);
		}
		
		
		List<String> ls = new ArrayList<>();
		ls.add("1");
		ls.add("2");
		List<String> ls1 = new ArrayList<>();
		ls1.add("2");
		ls1.add("1");
		Collections.sort(ls1);
		System.out.println(ls1.equals(ls));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
		
	}
	
}
