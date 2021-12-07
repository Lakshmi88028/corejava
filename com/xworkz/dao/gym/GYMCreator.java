package com.xworkz.dao.gym;

public class GYMCreator{

public static void main(String[] args) {
	
	String gymName="Akshara Gym";
	gymName=gymName.replace("","");
	System.out.println(gymName);
	
	GYMDAO dao=new GYMDAO();
	dao.save("Akshara Gym");
	dao.save("Dboss Gym");
	dao.save("Visual Fitness");
	
	boolean found=dao.find("Fit and Fine Fitness");
	System.out.println(found);
	
	found=dao.findByCaseInsensitive("jk gym");
	System.out.println(found);
	
	found=dao.findByCaseInsensitiveAndTrimmed("movezafitness");
	System.out.println(found);
	
}
}
