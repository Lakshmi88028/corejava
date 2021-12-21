package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPinCreator {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(7894,4561,1324,4589,3647,1547,3698,1478,2589,9632,8521,7896,3574,1596,8426,8974,6952,3674,0000,8521,36974,15763,1486,9632);
	  List<Integer> list = stream.filter((pin)->pin>0000).collect(Collectors.toList());
	  list.forEach((pin)->System.out.println(pin));
	}
}
