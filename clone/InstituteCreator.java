package com.xworkz.clone;

public class InstituteCreator {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Institute inst = new Institute();
		inst.setName("BGMIT");
		inst.setContNo(98765432L);
		inst.setLocation("Mudhol");
		inst.setNoOfBranches(4);
		inst.setNoOfStudents(500);
		
		Institute inst1 = (Institute) inst.clone();
		
		System.out.println(inst.getName());
		System.out.println(inst.getContNo());
		System.out.println(inst.getLocation());
		System.out.println(inst.getNoOfBranches());
		System.out.println(inst.getNoOfStudents());
		
		
	}
}

	
	
