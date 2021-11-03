package com.xworkz.shopapp;

public class HotelImplementation implements IServe{

	@Override
	public void sOn() {
		// TODO Auto-generated method stub
		System.out.println("Hotel is open Food is available");
	}

	@Override
	public void sOff() {
		// TODO Auto-generated method stub
		System.out.println("Hotel is close ");
	}

}
