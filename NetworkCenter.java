package com.xworkz.phonecall;

public class NetworkCenter {

	public static ISim getNetwork(String val) {
		
		if(val.equals("Jio")) {
			return new JioSim();
		}
		else if(val.equals("Airtel")){
				return new AirtelSimImpl();
			}
		else {
			System.out.println("Network not found");
		}
		return null;
	
	
	}
}
