package com.xworkz.phonecall;

public class AirtelSimImpl implements ISim{

	@Override
	public void call() {
		System.out.println("Welcome to Airtel Network");
		
	}

	@Override
	public void message() {
		System.out.println("Airtel provide 100 sms per day");
		
	}


}
