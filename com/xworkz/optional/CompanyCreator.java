package com.xworkz.optional;

import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.optional.dto.CompanyDTO;



public class CompanyCreator {

	public static void main(String[] args) {
		
		CompanyDTO dto=new CompanyDTO(1, "wipro", "Thierry Delaporte",500000.0d);
		CompanyDTO dto1=new CompanyDTO(2, "Cognizant", "Brian Humphries", 600000.0d);
		CompanyDTO dto2=new CompanyDTO(3, "Legato Health Technologies", "Ramon Villacorta",569873.0d);
		CompanyDTO dto3=new CompanyDTO(4, "TCS", "Rajesh Gopinathan", 365489.0d);
		CompanyDTO dto4=new CompanyDTO(5, "Capgimini", "Aiman ezzat", 645218.0d);
		CompanyDTO dto5=new CompanyDTO(2, "apix it solutions", "Manoj Mehta", 845326.0d);
		CompanyDTO dto6=new CompanyDTO(5, "Lti Technology solutions", "Sanjay Jalona", 987456.0d);
		
		
		Set<CompanyDTO> set=new LinkedHashSet<CompanyDTO>();
		set.add(dto);
		set.add(dto1);
		set.add(dto2);
		set.add(dto3);
		set.add(dto4);
		set.add(dto5);
		set.add(dto6);
		boolean val=dto.equals(dto5);
		System.out.println(val);
		
		System.out.println(set.size());
		Optional<CompanyDTO> opti=set.stream().filter((e)->e.getTurnOver()>200000.0d).sorted((q,q1)->q.getCompanyName().compareTo(q1.getCompanyName())).findFirst();
		System.out.println(opti);
		
		
	}
}