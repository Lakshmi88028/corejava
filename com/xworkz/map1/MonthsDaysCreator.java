package com.xworkz.map1;

	import java.util.Collection;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;
	import java.util.TreeMap;

	public class MonthsDaysCreator {
		public static void main(String[] args) {
			//Ascending order	
		Map<String,Integer>monthsDaysMap=new TreeMap<String,Integer>((e1,e2)->e1.compareTo(e2));
			
			//Descending order
		//Map<String,Integer>monthsDaysMap=new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
			monthsDaysMap.put("January",31);
			monthsDaysMap.put("February",28);
			monthsDaysMap.put("March",31);
			monthsDaysMap.put("April",30);
			monthsDaysMap.put("May",31);
			monthsDaysMap.put("June",30);
			monthsDaysMap.put("July",31);
			monthsDaysMap.put("August",31);
			monthsDaysMap.put("September",30);
			monthsDaysMap.put("October",31);
			monthsDaysMap.put("November",30 );
			monthsDaysMap.put("December",31 );
			
			Set<String> set=monthsDaysMap.keySet();
			
		     set.forEach((l)->System.out.println(l));
			
			Collection<Integer>values=monthsDaysMap.values();
			values.forEach((v)->System.out.println(v));
			
			Set<Map.Entry<String, Integer>> entrySet=monthsDaysMap.entrySet();
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
