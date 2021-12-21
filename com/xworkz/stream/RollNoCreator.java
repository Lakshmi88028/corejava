package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNoCreator {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(78,96,25,36,45,86,36,95,15,74,91,36,98,42,68,21,84,75,96,35,7,20,36);
		List<Integer>list = stream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		list.forEach((ro)->System.out.println(ro));
		
	}
}
