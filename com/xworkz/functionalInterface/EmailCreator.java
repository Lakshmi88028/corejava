package com.xworkz.functionalInterface;

public class EmailCreator {
	public static void main(String[] args) {
		
		EmailDAO dao = new EmailDAO();
		dao.save("lakshmilacchu8861@hmail.com");
		dao.save("lakshmibudihiramat.com");
		
		EmailSearch email = new EmailSearchByCom();
		boolean found = dao.find(email,"lakshmilacchu8861@hmail.com");
		System.out.println(found);
		
		EmailSearch email1 =new EmailSearchByIn();
		boolean found1 = dao.find(email1,"\"lakshmibudihiramat.com");
		System.out.println(found1);
		
		EmailSearch email2 = new EmailSearchByMail();
		boolean found2 = dao.find(email2,"lakshmibudihiramat.com");
		System.out.println(found2);
			
	}

}
