package com.xworkz.map1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BarBrandCreator {
	public static void main(String[] args) {
		//Ascending order	
	//Map<String,Integer>barBrandMap=new TreeMap<String,Integer>((e1,e2)->e1.compareTo(e2));
		
		//Descending order
	Map<String,Integer>barBrandMap=new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
		barBrandMap.put("Beer Garden",9);
		barBrandMap.put("Start the Fire",12);
		barBrandMap.put("Red Mug",10);
		barBrandMap.put("Blue Bar",4);
		barBrandMap.put("Lumber Bar",8);
		barBrandMap.put("Ice on fire",15);
		barBrandMap.put("The barrelHouse",12);
		barBrandMap.put("The Rusty Nail",9);
		barBrandMap.put("Fizz Bar",4);
		barBrandMap.put("Hunters Bar",7);
		
		Set<String> set=barBrandMap.keySet();
		
	     set.forEach((l)->System.out.println(l));
		
		Collection<Integer>values=barBrandMap.values();
		values.forEach((v)->System.out.println(v));
		
		Set<Map.Entry<String, Integer>> entrySet=barBrandMap.entrySet();
		entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
		
		Iterator<Map.Entry<String,Integer>> itr= entrySet.iterator();
		System.out.println("==============");
		while(itr.hasNext()) {
			Map.Entry<String, Integer>entry=itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		
		}
		
		}
	}
