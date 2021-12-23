package com.xworkz.optional.dto;

import java.io.Serializable;

public class CompanyDTO implements Serializable{
	
	private Integer companyid;
	private String CompanyName;
	private String CeoName;
	private Double turnOver;
	
	public CompanyDTO(int companyid, String companyName, String ceoName, Double turnOver) {
		super();
		this.companyid = companyid;
		this.CompanyName = companyName;
		this.CeoName = ceoName;
		this.turnOver = turnOver;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCeoName() {
		return CeoName;
	}
	public void setCeoName(String ceoName) {
		CeoName = ceoName;
	}
	public Double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}
	@Override
	public String toString() {
		return "CompanyDto [companyid=" + companyid + ", CompanyName=" + CompanyName + ", CeoName=" + CeoName
				+ ", turnOver=" + turnOver + "]";
	}
	
	@Override
	public int hashCode() {
		
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null)
		{
			
			if(obj instanceof CompanyDTO)
			{
				CompanyDTO dto=(CompanyDTO)obj;
			if(this.getCompanyid().equals( dto.getCompanyid()))
			{
				return true;
			}
			}
		}
		return false;
	}

}
