package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Country {
public static void main(String[] args) {
	Map map=new HashMap();
	
	map.put("India",91);
	map.put("Uk", 98);
	map.put("Russia", 335);
	
	System.out.println(map.size());

	 Integer value=(Integer) map.get("India");
	System.out.println(value);
	
	boolean contains=map.containsKey("Uk");
	System.out.println(contains);
	
	contains=map.containsValue(98);
	System.out.println(contains);

            Set <String> keys=map.keySet();
            
            keys.forEach((b)->{ System.out.println(b);
            });
            }
				
			}
 


