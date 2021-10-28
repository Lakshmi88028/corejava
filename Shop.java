package com.xworkz.shopapp;


import com.xworkz.shopapp.dto.ElectronicGadgetsDTO;
public class Shop {
	
private ElectronicGadgetsDTO[] electronicGadgets;
private int index;

public Shop(int size) {
	electronicGadgets = new ElectronicGadgetsDTO[size];
}
public boolean createElectronicGadgets(ElectronicGadgetsDTO electronicGadgets){
boolean ElectronicGadgetAdded=false;
System.out.println("inside createElectronicGadgets method");

if(electronicGadgets!=null){
	this.electronicGadgets[index++]=electronicGadgets;
	ElectronicGadgetAdded=true;
}
else {
	System.out.println("No electronicGadgets added");
	return ElectronicGadgetAdded=false;
}
return ElectronicGadgetAdded;
}

public boolean updateElectronicGadgetsContactNoByElectronicGadgetsId(int electronicGadgetsId,long contactNo){
	System.out.println("inside the updateElectronicGadgetsContactNoByElectronicGadgetsId");
	boolean update=false;
	if(electronicGadgetsId>0 && contactNo>0){
		for(int i=0;i<electronicGadgets.length;i++){
			if(electronicGadgets[i].getelectronicGadgetsId()== electronicGadgetsId){
				System.out.println("Patient Id is found now update the contact"+electronicGadgetsId);
				electronicGadgets[i].setContactNo(contactNo);
				update=true;
			}
			else
				System.out.println("ElectronicGadgets Id is found now update the contact");
				update=false;
		}
	}
	return update;
}

public ElectronicGadgetsDTO getElectronicGadgetsByName(String ElectronicGadgetsName){
	ElectronicGadgetsDTO dto = null;
		if(ElectronicGadgetsName!=null){
			for(int i=0;i<electronicGadgets.length;i++){
				if(electronicGadgets[i].getElectronicGadgetsName().equals(ElectronicGadgetsName)){
					System.out.println("Patient name is:"+ElectronicGadgetsName);
			   dto=electronicGadgets[i];
				}
				else
				System.out.println("ElectronicGadgets Name not found");
			}
		}
	return dto;
	}
	
	public ElectronicGadgetsDTO getElectronicGadgetsById(int electronicGadgetsId){
		ElectronicGadgetsDTO dto = null;
		if(electronicGadgetsId!=0){
			for(int i=0;i<electronicGadgets.length;i++){
				if(electronicGadgets[i].getelectronicGadgetsId() == electronicGadgetsId){
					System.out.println("ElectronicGadgets Id is:"+electronicGadgetsId);
					dto=electronicGadgets[i];
				}
				else
				System.out.println("ElectronicGadgetsId not found");
			}
		}
	return dto;
	}
	
	public ElectronicGadgetsDTO getElectronicGadgetsByNo(long contactNo){
		ElectronicGadgetsDTO dto = null;
			if(contactNo!=0){
				for(int i=0;i<electronicGadgets.length;i++){
					if(electronicGadgets[i].getContactNo()== contactNo){
						System.out.println("Patient Id is:"+contactNo);
						dto=electronicGadgets[i];
					}
					else
					System.out.println("ElectronicGadgetsContactNo not found");
				}
			}
		return dto;
		}
		
		public void getAllElectronicGadgetsDetails(){
			for(int i=0;i<electronicGadgets.length;i++){
				System.out.println(electronicGadgets[i]);
			}
		}
		
	
}
