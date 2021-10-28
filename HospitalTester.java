package com.xworkz.hospitalapp;

import java.util.*;

import com.xworkz.hospitalapp.dto.AddressDTO;
import com.xworkz.hospitalapp.dto.AreaDTO;
import com.xworkz.hospitalapp.dto.CountryDTO;
import com.xworkz.hospitalapp.dto.DistrictDTO;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.dto.StateDTO;
import com.xworkz.hospitalapp.dto.StreetDTO;

public class HospitalTester {
	
	public static void main(String a[]){

		System.out.println("Welcome to CITY hospital");
		System.out.println("\n"+"Enter the number of patients");
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			Hospital hospital = new Hospital(size);
			if(size>0)
			{	
				for(int i = 0; i< size; i++)
				{
				PatientDTO dto = new PatientDTO();
				System.out.println("Enter the patient details");
				
				System.out.println("Enter the patient ID");
				int patientId = sc.nextInt();
				dto.setPatientId(patientId);
				
				System.out.println("Enter the Patient name");
				String patientName = sc.next();
				dto.setPatientName(patientName);
				
				System.out.println("Enter the contact number");
				long contactNo = sc.nextLong();
				dto.setContactNo(contactNo);
				
				System.out.println("Enter the Bloodgroup");
				String bloodGroup = sc.next();
				dto.setBloodGroup(bloodGroup);
				
				System.out.println("Enter the Age");
				int age = sc.nextInt();
				dto.setAge(age);
				
				System.out.println("Enter the gender");
				char gender=sc.next().charAt(0); 
			    dto.setGender(gender);
				
				AddressDTO addressDTO = new AddressDTO();
				System.out.println("Enter Address Details");
				System.out.println("Enter Address Id");
				addressDTO.setAddressId(sc.nextInt());
				System.out.println("Enter Address Name");
			    addressDTO.setAddressName(sc.next());
				
				CountryDTO countryDTO = new CountryDTO();
				System.out.println("Enter country id");
			    countryDTO.setCountryId(sc.nextInt());
			    System.out.println("Enter Country Name");
			    countryDTO.setCountryName(sc.next());
			    
			    StateDTO stateDTO = new StateDTO();
			    System.out.println("Enter state id");
			    stateDTO.setStateId(sc.nextInt());
			    System.out.println("Enter state name");
			    stateDTO.setStateName(sc.next());
			    
			    DistrictDTO districtDTO = new DistrictDTO();
			    System.out.println("Enter District ID");
			    districtDTO.setDistrictId(sc.nextInt());
			    System.out.println("Enter district name");
			    districtDTO.setDistrictName(sc.next());
			    
			    AreaDTO areaDTO = new AreaDTO();
			    System.out.println("Enter Area Id");
			    areaDTO.setAreaId(sc.nextInt());
			    System.out.println("Enter Area name");
			    areaDTO.setAreaName(sc.next());
			    
			    StreetDTO streetDTO = new StreetDTO();
			    System.out.println("Enter Street Id");
			    streetDTO.setStreetId(sc.nextInt());
			    System.out.println("Enter Street Name");
			    streetDTO.setStreetName(sc.next());
			    System.out.println("Enter Street No");
			    streetDTO.setStreetNo(sc.nextInt());
			    
			    dto.setAddress(addressDTO);
			    addressDTO.setCountry(countryDTO);
			    countryDTO.setState(stateDTO);
			    stateDTO.setDistrict(districtDTO);
			    districtDTO.setArea(areaDTO);
			    areaDTO.setStreet(streetDTO);
			   
				boolean isAdded = hospital.createPatientDetails(dto);
				System.out.println(isAdded);
					
				
				hospital.getAllPatients();
			
			
			System.out.println("\n"+"Enter the patient name");
			String patientName1 = sc.next();
			System.out.println(hospital.getPatientByName(patientName1));
			
			System.out.println("\n"+"Enter the patient ID");
			int patientId1 = sc.nextInt();
			System.out.println(hospital.getPatientById(patientId1));
			
			System.out.println("\n"+"Enter patient Age");
			int age1=sc.nextInt();
			System.out.println(hospital.getPatientByAge(age1));
			
			System.out.println("\n"+"Enter street name to get patient name");
			String streetName=sc.next();
			System.out.println(hospital.getPatientByStreetName(streetName));
			
			System.out.println("\n"+"Enter state name to get patient name");
			String stateName=sc.next();
			System.out.println(hospital.getPatientByStateName(stateName));
			
			System.out.println("\n"+"Enter Area name to get patient name");
			String areaName=sc.next();
			System.out.println(hospital.getPatientByAreaName(areaName));
			
			System.out.println("\n"+"Enter street No to get patient name");
			int streetNo=sc.nextInt();
			System.out.println(hospital.getPatientByStreetNo(streetNo));
				}
			
			System.out.println("\n"+"Enter patient id and contact number to update");
			int id=sc.nextInt();
			long con=sc.nextLong();
			hospital.updateContactNoById(id,con);
			
			hospital.getAllPatients();
			
			System.out.println("\n"+"Enter patient Id to delete");
			int id1=sc.nextInt();
			hospital.deletePatientById(id1);
			
			hospital.getAllPatients();
			
			}
			else
			{
				System.out.println("invalid");
			}
		}
	
	}
}

