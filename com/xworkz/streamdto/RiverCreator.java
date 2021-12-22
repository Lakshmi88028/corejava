package com.xworkz.streamdto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.streamdto.dto.RiverDTO;

  public class RiverCreator {
		public static void main(String[] args) {
			
			RiverDTO dto = new RiverDTO(1, "Kaveri", "Karnataka", 805.0, 4);
			RiverDTO dto1 = new RiverDTO(2, "Ganga", "Uttarakhand", 2510.0, 900);
			RiverDTO dto2 = new RiverDTO(3, "Yamuna", "Uttarpradesh states", 1376.0, 3);
			RiverDTO dto3 = new RiverDTO(4, "Narmada", "Madhya pradesh", 1312.0, 3000);
			RiverDTO dto4 = new RiverDTO(5, "Brahmaputra", "Assam & Bangladesh", 3848.0, 2000);
			
			Stream<RiverDTO> river = Stream.of(dto,dto1,dto2,dto3,dto4);
			river.filter((length)->length.getLength()>500)
			.sorted((e1,e2)->e1.getNoOfDams()
					.compareTo(e2.getNoOfDams()))
			.collect(Collectors.toList())
			.forEach((m)->System.out.println(m));
			System.out.println(System.lineSeparator());
			
			Stream<RiverDTO> river1 = Stream.of(dto,dto1,dto2,dto3,dto4);
			river1.filter((length)->length.getLength()>500)
			.sorted((e1,e2)->e2.getNoOfDams()
					.compareTo(e1.getNoOfDams()))
			.collect(Collectors.toList())
			.forEach((f)->System.out.println(f));
		}
	}
