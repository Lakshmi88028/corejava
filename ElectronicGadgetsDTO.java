package com.xworkz.shopapp.dto;

public class ElectronicGadgetsDTO {
	
		private int electronicGadgetsId;
		private String electronicGadgetsName;
		private long contactNo;
		
		public void electronicGadgetsDTO(){
		System.out.println(this.getClass().getSimpleName()+"object is created");
		}
		
		public void setElectronicGadgetsId(int electronicGadgetsId){
		this.electronicGadgetsId=electronicGadgetsId;
		}
		
		public void electronicGadgetsName(String electronicGadgetsName){
		this.electronicGadgetsName=electronicGadgetsName;
		}
		
		public String getElectronicGadgetsName(){
		return electronicGadgetsName;
		}
		
		public void setContactNo1(long contactNo){
		this.contactNo=contactNo;
		}
		
		public long getContactNo(){
		return contactNo;
		}
		
		
		@Override
		public String toString(){
		return "ElectronicGadgetsDto - [electronicGadgetsId= " +this.electronicGadgetsId+", electronicGadgetsName= " +electronicGadgetsName+", contactNo= " +this.contactNo+"]";
		}


	public int getelectronicGadgetsId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setContactNo11(long contactNo) {
		// TODO Auto-generated method stub
		
	}

	public void setContactNo(long contactNo) {
		// TODO Auto-generated method stub
		
	}


	}

