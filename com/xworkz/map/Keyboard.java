package com.xworkz.map;
    import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;

	public class Keyboard {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("Alphabets", 16);
		map.put("Number", 24);
		map.put("Function Keys", 12);
		
		System.out.println(map.size());
		
		System.out.println(map.get("Number"));
		
		boolean contains=map.containsKey("Function Keys");
		System.out.println(contains);
		
		contains=map.containsValue(16);
		System.out.println(contains);
		
		Set<String> keys=map.keySet();
		keys.forEach((a)->{
			System.out.println(a);
		});
	}
	}


