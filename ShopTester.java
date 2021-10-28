package com.xworkz.shopapp;


	import java.util.*;
	import com.xworkz.shopapp.dto.ElectronicGadgetsDTO;
		
	public class ShopTester{

			private static Scanner sc;

			public static void main(String ar[]){
				System.out.println("Enter no of ElectronicGadgets");
				sc = new Scanner(System.in);
				int size = sc.nextInt();
			Shop shop = new Shop(1);
				if(size>0)
				{
				for(int i=0; i<size; i++)
				{
			ElectronicGadgetsDTO dto = new ElectronicGadgetsDTO();
				
				    System.out.println("Enter the ElectronicGadgets Details");
				    
					System.out.println("Enter the ElectronicGadgetsID");
						int ElectronicGadgetsId = sc.nextInt();
						dto.setElectronicGadgetsId(ElectronicGadgetsId);
						
					System.out.println("Enter the ElectronicGadgetsName");
						String ElectronicGadgetsName = sc.next();
						dto.electronicGadgetsName(ElectronicGadgetsName);
					
						
					System.out.println("Enter the ContactNo");
						long patientContactNo = sc.nextLong();
						dto.setContactNo(patientContactNo);
					
					
						
						
				boolean isadded = shop.createElectronicGadgets(dto);
				System.out.println(isadded);
				
				}
				
				shop.getElectronicGadgetsByName("Fridge");
				shop.getElectronicGadgetsById(1);
				shop.getElectronicGadgetsByNo(8147);
				
				
				shop.getAllElectronicGadgetsDetails();
				
				shop.updateElectronicGadgetsContactNoByElectronicGadgetsId(1,29008762); 
				shop.getAllElectronicGadgetsDetails();
				
				}
			}
	}

