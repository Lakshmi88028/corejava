package com.xworkz.clone;


public class HospitalCreator {
	
	public static void main(String a[]) throws CloneNotSupportedException {
		
		
		Hospital hospital=new Hospital();
		
		hospital.setHospitalName("ESI Hospital");
		hospital.setLocation("Rajajinagar");
		hospital.setHospitalContactNo(23456789L);
		hospital.setNoOfPatients(200);
		hospital.setEnteranceFees(200);
		
		Hospital obj=(Hospital)hospital.clone();
		
		System.out.println(hospital.getHospitalName());
		System.out.println(hospital.getLocation());
		System.out.println(hospital.getHospitalContactNo());
		System.out.println(hospital.getNoOfPatients());
		System.out.println(hospital.getEnteranceFees());
		
	}

}

