package com.xworkz.atmapp;

import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcome to ATM");
		ICard icard = BankFactory.getMoney(sc.nextLine());
		if(icard!=null) {
			icard.insertCard();
			icard.swapCard();
			
		}
		ICard icard1 = BankFactory.getMoney(sc.next());
		if(icard!=null) {
			icard1.insertCard();
			icard1.swapCard();
		}
	}
}
