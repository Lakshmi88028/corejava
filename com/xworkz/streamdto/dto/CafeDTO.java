package com.xworkz.streamdto.dto;

public class CafeDTO {
	
	private Integer id;
	private String name;
	private String location;
	private Double rating;
	
	public CafeDTO(Integer id,String name,String location,double d) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.rating = d;
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "CafeDTO [id="+id+",name="+name+",location="+location+",rating="+rating+"]";
	}
	}
