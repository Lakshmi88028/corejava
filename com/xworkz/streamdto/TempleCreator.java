package com.xworkz.streamdto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.TempleDTO;

public class TempleCreator {
	public static void main(String[] args) {
		
		TempleDTO dto=new  TempleDTO(1,"Mata Mansa Devi","Haryana","Manasa Devi",12000);
		TempleDTO dto1=new TempleDTO(2,"Anegudde","Udupi ","Ganesh",6000);
		TempleDTO dto2=new TempleDTO(3,"Iskcon","RadhaKrishna","Bengaluru",98500);
		TempleDTO dto3=new TempleDTO(4,"Kukke Subhramanya","Naga","Kumaradhara",3000);
		TempleDTO dto4=new TempleDTO(5,"Mukhambika Temple","Mookambika","Kollur",6350);
		
	    Stream<TempleDTO> temple=Stream.of(dto,dto1,dto2,dto3,dto4);
	     temple.filter((b)->b.getVisitorsPerDay()>1000)
	 .sorted((b1,b2)->b2.getVisitorsPerDay()
			 .compareTo(b1.getVisitorsPerDay()))
			  .collect(Collectors.toList())
			  .forEach((n)->System.out.println(n));
	}

}