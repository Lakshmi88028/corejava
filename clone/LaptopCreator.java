package com.xworkz.clone;

public class LaptopCreator {

	public static void main (String[] args) throws CloneNotSupportedException {
		
		Laptop laptop = new Laptop();
		laptop.setName("Dell");
		laptop.setId(1234);
		laptop.setPrice(25000);
		laptop.setRam(4);
		laptop.setGeneration("3rd");
		
		Laptop laptopCopy = (Laptop) laptop.clone();
		
		System.out.println(laptop.getName());
		System.out.println(laptop.getId());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getRam());
		System.out.println(laptop.getGeneration());
	}
}

