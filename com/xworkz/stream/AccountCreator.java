package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountCreator {

	public static void main(String[] args) {
		Stream<Long> accountNoStream = Stream.of(321456987251L,498585854558L,796532655612L,985625665296L,486328632586L,987065423214L,98745626525L,87628558512L,987456125232L,952585454253L,963247852321L,963258963153L,741258963432L,987456321321L,9633335741592L,951235741966L);
		List<Long> abd = accountNoStream
				.filter((a)->a>1000000000L)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		      abd.forEach((a)->System.out.println(a));
	}
}
