package com.xworkz.clone;

public class StadiumCreator {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Stadium st = new Stadium();
		st.setName("Chinnaswamy  stadium");
		st.setLocation(" Bengaluru");
		st.setContNo(98765432L);
		st.setArea("Shivaji Nagar");
		st.setNoOfChairs(500);
		
		Stadium st1 = (Stadium) st.clone();
		
		System.out.println(st.getName());
        System.out.println(st.getLocation());
        System.out.println(st.getContNo());
        System.out.println(st.getArea());
        System.out.println(st.getNoOfChairs());
        
	}
}
