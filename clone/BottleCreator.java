package com.xworkz.clone;

public class BottleCreator {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Bottle bt = new Bottle();
		bt.setName("pooja");
		bt.setPrice(60);
		bt.setColor("Blue");
	    bt.setBrand("Hitech");
	    
	    Bottle bt1 = (Bottle) bt.clone();
	    
	    System.out.println(bt.getName());
	    System.out.println(bt.getPrice());
	    System.out.println(bt.getColor());
	    System.out.println(bt.getBrand());
	    
	    }
}
