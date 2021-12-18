package com.xworkz.map1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MoviesRatingsCreator {
	public static void main(String[] args) {
		//Ascending order	
	Map<String,Double>movieRatingMap=new TreeMap<String,Double>((e1,e2)->e1.compareTo(e2));
		
		//Descending order
	//Map<String,Double>movieRatingMap=new TreeMap<String,Double>((e1,e2)->e2.compareTo(e1));
		movieRatingMap.put("Garuda gamana Vrishabha vahana",4.5);
		movieRatingMap.put("kotigobba 3",4.0);
		movieRatingMap.put("puksatte lifu",4.0);
		movieRatingMap.put("Robert",4.0);
		movieRatingMap.put("Drishya",3.5);
		movieRatingMap.put("Madhagaja",3.5);
		movieRatingMap.put("Sakath",3.5);
		movieRatingMap.put("Amruth Apartments",3.5);
		movieRatingMap.put("Kirik Party",8.3);
		movieRatingMap.put("100",3.5);
		
		Set<String> set=movieRatingMap.keySet();
		
	     set.forEach((l)->System.out.println(l));
		
		Collection<Double>values=movieRatingMap.values();
		values.forEach((v)->System.out.println(v));
		
		Set<Map.Entry<String, Double>> entrySet=movieRatingMap.entrySet();
		entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
		
		Iterator<Map.Entry<String,Double>> itr= entrySet.iterator();
		System.out.println("==============");
		while(itr.hasNext()) {
			Map.Entry<String,Double>entry=itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		
		}
		
		}
	}
