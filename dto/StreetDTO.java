package com.xworkz.hospitalapp.dto;

public class StreetDTO {
public StreetDTO(){
	System.out.println(this.getClass().getSimpleName()+"object created");
		}
    private int streetId;
	private String streetName;
	private int streetNo;
    
	public void setStreetId(int streetId){
		this.streetId=streetId;
		}

	public int getStreetId(){
		return streetId;
		}
	public void setStreetName(String streetName){
		this.streetName=streetName;
		}

	public String getStreetName(){
		return streetName;
		}
	
	public void setStreetNo(int streetNo){
		this.streetNo=streetNo;
		}

	public int getStreetNo(){
		return streetNo;
		}
	
	@Override
	public String toString() {
		return "StreetDTO-{streetId="+this.streetId+",streetName="+this.streetName+",streetNo="+this.streetNo+"}";
	}



}
