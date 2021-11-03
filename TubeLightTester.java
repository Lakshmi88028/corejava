package com.xworkz.lightapp;
import java.util.Scanner;

public class TubeLightTester {
public static void main(String a[]) {
	
	Scanner type = new Scanner(System.in);
	System.out.println("Enter the Light");
	
	//ISwitch iSwitch = new TubeLightImplementation();//Abstraction
	ISwitch iSwitch = LightFactory.getLight(type.next());
		iSwitch.sOn();
		iSwitch.sOff();
		
		//ISwitch iSwitch1 = new CflImplementation();
		ISwitch iSwitch1 = LightFactory.getLight(type.next());
		iSwitch1.sOn();
		iSwitch1.sOff();
	}
}

