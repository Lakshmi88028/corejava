package com.xworkz.dao.ipl;

public class IPLCreator {

public static void main(String[] args) {
	String teamName="RCB";
	teamName=teamName.replace("","");
	System.out.println(teamName);
	
	IPLDAO dao=new IPLDAO();
	dao.save("RCB");
	dao.save("CSK");
	dao.save("Mumbai Indians");
	
	boolean found=dao.find("rcb");
	System.out.println(found);
	
	found=dao.findByCaseInsensitive("csk");
	System.out.println(found);
	
	found=dao.findByCaseInsensitiveAndTrimmed("Mumbai Indians");
	System.out.println(found);
	
}
}
