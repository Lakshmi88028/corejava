package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNRCreator {

	public static void main(String[] args) {
		
		Stream<Long> stream = Stream.of(78945612300L,7896598741L,36985632147L,8965741236L,9756842169L,9423651756L,94236518723L,78654932548L);
		List<Long> list = stream.filter((pnr)->pnr>500000000L).sorted().collect(Collectors.toList());
		list.forEach((a)->System.out.println(a));
	}
}
