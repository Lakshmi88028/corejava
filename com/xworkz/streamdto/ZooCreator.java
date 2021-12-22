package com.xworkz.streamdto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.ZooDTO;

public class ZooCreator {

	
		public static void main(String[] args) {
			ZooDTO dto= new ZooDTO(1,"Mysore Zoo","Karnataka",900);
			ZooDTO dto1=new ZooDTO(2,"National Zoological Park","Delhi",560);
			ZooDTO dto2=new ZooDTO(3,"Maharajbagh zoo","Maharashtra",890);
			ZooDTO dto3=new ZooDTO(4,"Sarthana zoo","Gujarat",360);
			ZooDTO dto4=new ZooDTO(5,"Kanpur zoological park","Uttar Pradesh",942);
			
			Stream<ZooDTO> zoo=Stream.of(dto,dto1,dto2,dto3,dto4);	
	        zoo
			.sorted((p1,p2)->p2.getTicketPrice()
					.compareTo(p1.getTicketPrice()))
			.collect(Collectors.toList())
			.forEach((a)->System.out.println(a));
			
			   
		}

	}
