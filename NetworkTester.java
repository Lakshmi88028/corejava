package com.xworkz.phonecall;

import java.util.Scanner;

public class NetworkTester {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the network center");
		Scanner sc = new Scanner(System.in);
		ISim isim = NetworkCenter.getNetwork(sc.next());
		isim.call();
		isim.message();
		
		}
}
