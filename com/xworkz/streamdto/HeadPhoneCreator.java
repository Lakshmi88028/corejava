package com.xworkz.streamdto;


import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.HeadPhoneDTO;
public class HeadPhoneCreator {

	public static void main(String[] args) {
		HeadPhoneDTO dto = new HeadPhoneDTO(1,"Panasonic","wired","RP-HT030",3819.0);
		HeadPhoneDTO dto1 = new HeadPhoneDTO(2,"sony","wired","MDR-ZX110AP",799.0);
		HeadPhoneDTO dto2 = new HeadPhoneDTO(3,"JBL","wireless","E45BT",6385.0);
		HeadPhoneDTO dto3 = new HeadPhoneDTO(4,"Bose","wireless","35 11",29363.0);
		HeadPhoneDTO dto4 = new HeadPhoneDTO(5,"Logitech","wired","G633",12495.0);
		
		Stream<HeadPhoneDTO> headphone = Stream.of(dto,dto1,dto2,dto3,dto4);
	
		headphone
		//.filter((e)->e.getId()
		.sorted((e,e1)->e.getId()
				.compareTo(e1.getId()))
		.collect(Collectors.toList())
		.forEach((a)->System.out.println(a));
		
		System.out.println("Get only models");
		Stream<HeadPhoneDTO> headphone1 = Stream.of(dto,dto1,dto2,dto3,dto4);
		headphone1
		.sorted((e,e1)->e.getBrand()
.compareTo(e1.getBrand()))
		.map((e)->e.getBrand())
		.collect(Collectors.toList())
        .forEach((a)->System.out.println(a));
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
				
				
				
				
	
