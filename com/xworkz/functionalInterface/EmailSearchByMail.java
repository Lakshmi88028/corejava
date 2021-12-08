package com.xworkz.functionalInterface;

public class EmailSearchByMail implements EmailSearch{
	
	@Override
	public boolean expression(String arg1, String arg2) {
		if(arg1.equals(arg2)) {
		return true;
	}
	return false;

}
}
