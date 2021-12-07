package com.xworkz.clone;

public class Mobiles implements Cloneable{

	private String name;
	private int price;
	private String storage;
	private int Id;
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
}
