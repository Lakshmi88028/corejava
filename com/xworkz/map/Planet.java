package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Planet {
 
public static void main(String[] args) {
	Map map = new HashMap();
		
	map.put("Earth",1);
	map.put("Mars", 2);
	map.put("Jupitar",53);
	map.put("Saturn", 53);
	map.put("Uranus", 27);
	map.put("Neptune", 14);
	map.put("Pluto", 5);
	map.put("Eris", 1);
	map.put("Haumea", 2);
	
	System.out.println(map.size());
	Integer value = (Integer) map.get("Haumea");
	System.out.println(value);
	
	boolean contains = map.containsKey("Earth");
	System.out.println(contains);
	
	contains = map.containsKey(27);
	System.out.println(contains);
	
Set<String> keys = map.keySet();

keys.forEach(e->{
	System.out.println(e);
});
	
}
}
