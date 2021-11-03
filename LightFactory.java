package com.xworkz.lightapp;

//Factory class - object creation logic
public class LightFactory {
	
    //Factory method
	public static ISwitch getLight(String type) {
		if(type.equals("tubelight")) {
			return new TubeLightImplementation();
		}
		else if(type.equals("cflbulb")) {
			return new CflImplementation();
			
		}
		else {
			System.out.println("Light not found");
		}
		return null;
	}
}
