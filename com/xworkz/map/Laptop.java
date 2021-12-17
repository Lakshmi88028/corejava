package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Laptop {
public static void main(String[] args) {
	
	Map map = new HashMap();
	
	map.put("Dell", 865235);
	map.put("Lenovo", 328905);
	map.put("HP", 7654);
	map.put("Apple", 23456);
	
	System.out.println(map.size());
	  Integer value= (Integer) map.get("Dell");
	System.out.println(value);
	
	boolean contains = map.containsKey("Lenovo");
	System.out.println(contains);
	
	
	contains = map.containsValue(865235);
	System.out.println(contains);
	
	Set<String> keys = map.keySet();
	
	keys.forEach(e->{
		System.out.println(e);
	});

    }
}
