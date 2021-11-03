package com.xworkz.atmapp;

public class SbiBankImpl implements ICard{

	@Override
	public void insertCard() {
		System.out.println("SBI card is inserted");
	}

	@Override
	public void swapCard() {
		System.out.println("SBI card is swapped");
		
	}

}
