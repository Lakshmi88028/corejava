package com.xworkz.clone;


public class ShowroomCreator {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Showroom showroom = new Showroom();
		showroom.setName("Dell showroom");
		showroom.setLocation("Rajajinagar bangalore");
		showroom.setItemName("Dell");
		showroom.setItemPrice(35000);
		
		Showroom obj = (Showroom) showroom.clone();
		System.out.println(showroom.getName());
		System.out.println(showroom.getLocation());
		System.out.println(showroom.getItemName());
		System.out.println(showroom.getItemPrice());
	}
}

