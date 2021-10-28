package com.xworkz.hospitalapp.dto;

public class StateDTO {
	public StateDTO(){
	System.out.println(this.getClass().getSimpleName()+"object created");
}
    private int stateId;
    private String stateName;
    private DistrictDTO district;
    
    public void setStateId(int stateId){
    	this.stateId=stateId;
    	}

    public int getStateId(){
    	return stateId;
    	}
    public void setStateName(String stateName){
    	this.stateName=stateName;
    	}

    public String getStateName(){
    	return stateName;
    	}
    
    public void setDistrict(DistrictDTO district){
    	this.district=district;
    	}

    public DistrictDTO getDistrict(){
    	return district;
    	}
    
   @Override 
    public String toString() {
    	return "StateDTO-{stateId="+this.stateId+",stateName="+this.stateName+",districtDTO="+this.district+"}";
    }
}
