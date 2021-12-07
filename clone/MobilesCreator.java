package com.xworkz.clone;

public class MobilesCreator {

	public static void main(String[] args) throws CloneNotSupportedException {
		Mobiles mobile = new Mobiles();
		mobile.setName("Readmi Note8");
		mobile.setPrice(15000);
		mobile.setId(76565);
		mobile.setStorage("128GB");
		
		
		Mobiles mobile1 = (Mobiles) mobile.clone();
		System.out.println(mobile.getName());
		System.out.println(mobile.getPrice());
		System.out.println((mobile.getId()));
		System.out.println(mobile.getStorage());
		
		
	}
}
