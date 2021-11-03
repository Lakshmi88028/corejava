package com.xworkz.shopapp;

public class ShopTester {
	public static void main(String a[]) {
		
		
		IServe iServe = new ShopImplementation();
		iServe.sOn();
		iServe.sOff();
		
		IServe iServe1 = new HotelImplementation();
		iServe1.sOn();
		iServe1.sOff();
		
		IServe iServe2 = new PanipuriImpl();
		iServe2.sOn();
		iServe2.sOff();
		
		IServe iServe3 = new FancyStoreImpl();
		iServe3.sOn();
		iServe3.sOff();
		
		IServe iServe4 = new AutomobilesImpl();
		iServe4.sOn();
		iServe4.sOff();
	}
}
        
