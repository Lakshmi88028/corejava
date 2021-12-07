package com.xworkz.clone;

public class CanteenCreator{
	public static void main(String a[]) throws CloneNotSupportedException {
	
	Canteen can= new Canteen();
	
	can.setCanteenName("Lakshmi Canteen");
	
	can.setCanteenLocation("Bangalore");
	can.setContactNo(98765432L);

	can.setIteam("Masala Rice");
	can.setIteamCost(20);
	
	Canteen can1=(Canteen)can.clone();
	
	
	System.out.println(can.getCanteenName());
	System.out.println(can.getCanteenLocation());
    System.out.println(can.getContactNo());
    System.out.println(can.getIteam());
    System.out.println(can.getIteamCost());

}
}

