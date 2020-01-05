package week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.hpsf.Array;

public class LearnMap {
	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		Set<String> set = new HashSet<>();
		
		Map<String, String> map = new HashMap<>();
		map.put("Name 1", "Sam");
		map.put("Name 2", "Koushik");
		map.put("Name 3", "Hari");
		map.put("Name 4", "Naveen");
		int size = map.size();
		System.out.println(size);
		System.out.println(map.containsKey("Name 2"));
		System.out.println(map.containsValue("Sam"));
		System.out.println(map.get("Name 6"));
		
		/*for(String eachLi : li) {
			
		}*/
		
		for(Entry<String, String> eachMap : map.entrySet()) {
			System.out.println(eachMap.getValue());
		}
	}
	
}
