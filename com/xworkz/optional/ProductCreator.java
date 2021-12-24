package com.xworkz.optional;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.optional.dto.ProductDTO;

public class ProductCreator {

	public static void main(String[] args) {
		
		ProductDTO dto = new ProductDTO(1, "Tag Heuer carrera", "watch", 3000.00, 5);
		ProductDTO dto1 = new ProductDTO(2, "Louis Vuitton.", "purse Bag", 2000.00, 2);
		ProductDTO dto2 = new ProductDTO(3, "Adidas", "shoe", 2345.00, 8);
		ProductDTO dto3 = new ProductDTO(4, "ponds", "cream", 225.00, 7);
		ProductDTO dto4 = new ProductDTO(5, "Himalaya", "Home Facewash", 632.00, 6);
		ProductDTO dto5 = new ProductDTO(6, "xworkz", "Institute", 500.00, 5);
		
		Set<ProductDTO> dtos = new LinkedHashSet<ProductDTO>();
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto2);
		dtos.add(dto4);
		dtos.add(dto);
		dtos.add(dto1);
		
		boolean m = dto.equals(dto1);
		System.out.println(m);
		
		Optional<ProductDTO> optional = dtos.stream().filter((d)->d.getPrice()>1000.0).findFirst();
		System.out.println(optional);
	}
}
