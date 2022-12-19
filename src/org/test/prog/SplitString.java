package org.test.prog;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SplitString {
	
	public static void main(String[] args) {
		String s="java is simple java is easy";
		
		String[] sp = s.split(" ");
		
	Map<String, Integer> mp=new LinkedHashMap<>();
		for(String c:sp) {
			if (mp.containsKey(c)) {
				Integer integer = mp.get(c);
				mp.put(c, integer+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		Set<Entry<String, Integer>> en = mp.entrySet();
		for (Entry<String, Integer> x : en) {
			if (x.getValue()>1) {
				System.out.println(x.getKey());
				
			}
			
		}
	}

}
