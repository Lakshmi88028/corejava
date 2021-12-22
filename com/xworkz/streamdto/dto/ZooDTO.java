package com.xworkz.streamdto.dto;

public class ZooDTO  {
private Integer id;
private String name;
private String stateName;
private Integer ticketPrice;

public ZooDTO() {
	super();
	
}

public ZooDTO(Integer id, String name, String stateName, Integer ticketPrice) {
	this.id = id;
	this.name = name;
	this.stateName = stateName;
	this.ticketPrice = ticketPrice;
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

public String getStateName() {
	return stateName;
}

public void setStateName(String stateName) {
	this.stateName = stateName;
}

public Integer getTicketPrice() {
	return ticketPrice;
}

public void setTicketPrice(Integer ticketPrice) {
	this.ticketPrice = ticketPrice;
}

@Override
public String toString() {
	return "ZooDTO [id=" + id + ", name=" + name + ", stateName=" + stateName + ", ticketPrice=" + ticketPrice + "]";
}


}
