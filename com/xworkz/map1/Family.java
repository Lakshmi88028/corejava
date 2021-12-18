package com.xworkz.map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Family {

	public static void main(String[] args) {
		//Map<String, Integer> familyMemberMap=new HashMap<String, Integer>();
		
		//Decending Order
		Map<String, Integer> familyMemberMap=new TreeMap<String, Integer>((e1, e2)->e2.compareTo(e1));
		
		familyMemberMap.put("Lakshmi", 5);
		familyMemberMap.put("pooja", 5);
		familyMemberMap.put("Ashwini", 5);
		familyMemberMap.put("shubha", 5);
		familyMemberMap.put("Radika", 4);
		familyMemberMap.put("Nandidni", 5);
		familyMemberMap.put("Lata", 3);
		familyMemberMap.put("Geeta", 5);
		familyMemberMap.put("Vishalaxi", 6);
		familyMemberMap.put("Srushti", 8);
		
		//abstraction
		//get only keys , get only values or both
	    System.out.println("List of keys");
		Set<String> keys=familyMemberMap.keySet();
		keys.forEach((v)->System.out.println(v));
		
		System.out.println("========================");
		 System.out.println("List of valuess");
		Collection<Integer> values=familyMemberMap.values();
		values.forEach((l)->System.out.println(l));
		
		System.out.println("========================");
		 System.out.println("List of keys and values");
		Set<Map.Entry<String, Integer>> entrySet=familyMemberMap.entrySet();
		entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
		
		Iterator<Map.Entry<String, Integer>> itr=entrySet.iterator();
		System.out.println("========================");
		 System.out.println("Keys and values in decending order");
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry=itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			
		//Assending Order
			Map<String, Integer> familyMemberMap1=new TreeMap<String, Integer>((e1, e2)->e1.compareTo(e2));
			
		familyMemberMap.put("Lakshmi", 5);
		familyMemberMap.put("pooja", 5);
		familyMemberMap.put("Ashwini", 5);
		familyMemberMap.put("shubha", 5);
		familyMemberMap.put("Radika", 4);
		familyMemberMap.put("Nandidni", 5);
		familyMemberMap.put("Lata", 3);
		familyMemberMap.put("Geeta", 5);
		familyMemberMap.put("Vishalaxi", 6);
		familyMemberMap.put("Srushti", 8);
			
			Iterator<Map.Entry<String, Integer>> itr1=entrySet.iterator();
			System.out.println("========================");
			 System.out.println("Keys and values in Acending order");
			while(itr1.hasNext()) {
				Map.Entry<String, Integer> entry1=itr1.next();
				System.out.println(entry1.getKey());
				System.out.println(entry1.getValue());
		}
			
			
	}
}
}
