package com.xworkz.map1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StateDiscCreator {
	public static void main(String[] args) {
		//Ascending order	
    //Map<String,Integer>stateDistrictMap=new TreeMap<String,Integer>((e1,e2)->e1.compareTo(e2));
		
		//Descending order
   Map<String,Integer>stateDistrictMap=new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
		stateDistrictMap.put("Karnataka",30);
		stateDistrictMap.put("Maharashtra",36);
		stateDistrictMap.put("Kerala",14);
		stateDistrictMap.put("Uttarakhand",13);
		stateDistrictMap.put("Goa",2);
		stateDistrictMap.put("Punjab",22);
		stateDistrictMap.put("Gujarat",33);
		stateDistrictMap.put("Bihar",38);
		stateDistrictMap.put("Manipur",16);
		stateDistrictMap.put("Sikkim",4);
		
		Set<String> set=stateDistrictMap.keySet();
		
	     set.forEach((l)->System.out.println(l));
		
		Collection<Integer>values=stateDistrictMap.values();
		values.forEach((v)->System.out.println(v));
		
		Set<Map.Entry<String, Integer>> entrySet=stateDistrictMap.entrySet();
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