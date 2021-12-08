package com.xworkz.functionalInterface;

public class EmailSearchByIn implements EmailSearch {
	
	@Override
	public boolean expression(String arg1, String arg2) {
		String str = arg1.substring(arg1.length()-1,arg1.length());
		if(arg1.equalsIgnoreCase(arg2)) {
		return true;
	}
	return false;
	
}
}
