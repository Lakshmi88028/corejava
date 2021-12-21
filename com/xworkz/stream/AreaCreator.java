package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaCreator {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Rajajinagra","Electronic city","Hoskote","Hebbal",
				"Marathalli","Jayanagar","BTM Layout","Jain Market","Bangalore Road","SP Circle","Moka road","Gandi nagar","royal circle","Rajkumar  road");
		List<String> list = stream.map(String::toLowerCase).sorted().collect(Collectors.toList());
		list.forEach((area)->System.out.println(area));
		System.out.println();
		
		Stream<String> str = Stream.of("Rajajinagra","Electronic city","Hoskote","Hebbal","Marathalli","Jayanagar","BTM Layout","Jain Market","Bangalore Road","SP Circle","Moka road","royal circle","Rajkumar road");
            List<String> lts = str.map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            lts.forEach((area)->System.out.println(area));
	}
}
