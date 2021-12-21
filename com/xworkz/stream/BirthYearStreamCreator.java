package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYearStreamCreator {

	public static void main(String[] args) {
		Stream<Integer> birthYear = Stream.of(1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,1995,1985,1975,1986,2021,2020,2019,2018);
		List<Integer> tempList = birthYear
		.filter((p)->p>1995)
		.sorted()
        .collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
		}
}
