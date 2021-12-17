package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Continet {
public static void main(String[] args) {
	
	Map map = new HashMap();
	map.put("Asia", 47);
	map.put("Antarctia", 0);
	map.put("Asia", 47);
	map.put("Australia plus oceania", 14);
	map.put("Europe", 43);
	map.put("North America", 23);
	map.put("south America", 12);
	
	System.out.println(map.size());
	
	Integer value=(Integer) map.get("Europe");
	System.out.println(value);
	
	boolean contains=map.containsKey("Asia");
	System.out.println(contains);
	
	contains=map.containsValue(14);
	System.out.println(contains);
	
Set<String> keys=map.keySet();
    
    keys.forEach((b)->{ 
    	System.out.println(b);
    });
	
	

}
}
