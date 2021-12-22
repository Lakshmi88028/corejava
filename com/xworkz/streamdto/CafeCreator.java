package com.xworkz.streamdto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.CafeDTO;

public class CafeCreator {
 public static void main(String[] args) {
	 
	 CafeDTO dto = new CafeDTO(1,"Omkar development cafe","Rajajinagar", 4.2);
	 CafeDTO dto1 = new CafeDTO(2,"Lakshmi cafe","Kotturu",4.5);
	 CafeDTO dto2 = new CafeDTO(3,"Nimde cafe","Majestic",2.3);
	 CafeDTO dto3 = new CafeDTO(4,"come to my cafe","Gandinagar",3.2);
	 
	 //Stream<CafeDTO> cafe = Stream.of(dto,dto1,dto2,dto3);
	 
	 
	 Stream<CafeDTO> cafe = Stream.of(dto,dto1,dto2,dto3);
	 cafe.filter((rating)->rating.getRating()>2)
	 .sorted((e1,e2)->e2.getRating()
			 .compareTo(e1.getRating()))
	 //.map((a)->a.getName())
	 .collect(Collectors.toList())
	 .forEach((n)->System.out.println(n));
 }
}

