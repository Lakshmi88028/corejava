package com.xworkz.jdbc;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("This is my jdbc");
		String  driverFQN="com.mysql.cj.jdbc.Driver";
		Class.forName(driverFQN);
	}

}
