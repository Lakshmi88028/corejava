package com.xworkz.clone;

public class TravelCreator {
	public static void main(String a[]) throws CloneNotSupportedException {
	
	
	Travel bus=new Travel();
	bus.setTravelAgencyName("SRS Agency");
	bus.setCost(1000);
	bus.setBusNumber("KA-18-D-7946");
	bus.setSeatNumber(4);
	bus.setTravelAgencyNumber(456);
	
	
	Travel obj=(Travel)bus.clone();
	System.out.println(bus.getTravelAgencyName());
	System.out.println(bus.getBusNumber());
	System.out.println(bus.getCost());
	System.out.println(bus.getSeatNumber());
	System.out.println(bus.getTravelAgencyNumber());
	
	

}
}


