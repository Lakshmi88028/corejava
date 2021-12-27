package com.xworkz.jdbc;

public class Example {

	public static void main(String[] args) {
		String  driverFQN="com.mysql.cj.jdbc.Driver";
		System.out.println("This is my jdbc");
		try {
			Class.forName(driverFQN);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
