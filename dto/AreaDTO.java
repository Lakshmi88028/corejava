package com.xworkz.hospitalapp.dto;

public class AreaDTO {
	public 	AreaDTO(){
		System.out.println(this.getClass().getSimpleName()+"object created");
		}
	private Integer areaId;
	private String areaName;
	private int streetNo;
	private StreetDTO street;
	
	public void setAreaId(Integer areaId){
		this.areaId=areaId;
		}

	public Integer getAreaId(){
		return areaId;
		}
	
	public void setAreaName(String areaName){
		this.areaName=areaName;
		}

	public String getAreaName(){
		return areaName;
		}
	
	public void setStreetNo(int streetNo){
		this.streetNo=streetNo;
		}

	public int getStreetNo(){
		return streetNo;
		}
	
	public void setStreet(StreetDTO street){
		this.street=street;
		}

	public StreetDTO getStreet(){
		return street;
		}
	
	@Override
	public String toString() {
		return "AreaDTO-{areaId="+this.areaId+",areaName="+this.areaName+",streetNo="+this.streetNo+"}";
	}

}
