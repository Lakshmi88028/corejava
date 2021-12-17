package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aadhar {
	public static void main(String[] args) {
		
		Map map=new HashMap();
		
		map.put("Lakshmi", "123 456 789");
		map.put("Ashwini", "345 765 986");
		map.put("pooja", "356 977 097");
		map.put("shubha","578 642 875");
		
		System.out.println(map.size());

	     
		System.out.println(map.get("Lakshmi"));
		
		boolean contains=map.containsKey("Ashwini");
		System.out.println(contains);
		
		contains=map.containsValue("123 456 789");
		System.out.println(contains);
		
		System.out.println(map);
		Set<String> keys=map.keySet();
		keys.forEach((a)->{
			System.out.println(a);
		});
	}
	
}
