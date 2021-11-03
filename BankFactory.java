package com.xworkz.atmapp;

public class BankFactory {

	public static ICard getMoney(String type) {
		if(type.equals("Sbi card")) {
			return new SbiBankImpl();
		}
		else if(type.equals("Karnataka card")) {
			return new KarnatakaBankImpl();
		}
		else {
			System.out.println("card is not valid");
		}
		return null;
	}
}
