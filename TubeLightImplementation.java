package com.xworkz.lightapp;

public class TubeLightImplementation implements ISwitch{

	@Override
	public void sOn() {
		System.out.println("Tube light is turned on...");
	}
	@Override
	public void sOff() {
		System.out.println("Tube light is turned off..");
	}
}
