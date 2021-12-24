package com.xworkz.optional;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.optional.dto.HockyDTO;

public class HockyCreator {

	public static void main(String[] args) {
		
		HockyDTO dto = new HockyDTO("Kalinga Lancers",18, 40, "Odisha");
		HockyDTO dto1 = new HockyDTO("Baratharmy", 30, 20, "India");
		HockyDTO dto2 = new HockyDTO("Kenya Hockey Union", 10, 4, "Kenya");
		HockyDTO dto3 = new HockyDTO("Oranje", 59, 21, "Netherland");
		HockyDTO dto4 = new HockyDTO("Redsticks", 19, 8, "Spain");
		HockyDTO dto5 = new HockyDTO("Delhi Waverides",19, 11, "Delhi");
		
		Set<HockyDTO> dtos = new LinkedHashSet<HockyDTO>();
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto1);
		dtos.add(dto);
		dtos.add(dto4);
		dtos.add(dto2);
		
		boolean k = dto5.equals(dto2);
		System.out.println(k);
		Optional<HockyDTO> optional =  dtos.stream().filter((e)->e.getWins()>30).sorted((e1,e2)->e2.getTeamName().compareTo(e1.getTeamName())).findFirst();
		System.out.println(optional);
	}
}