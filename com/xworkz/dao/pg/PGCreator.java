package com.xworkz.dao.pg;

public class PGCreator {
	public static void main(String[] args) {
		String pgName="Khushi PG";
		pgName=pgName.replace("", "");
		System.out.println(pgName);
		
		PGDAO dao = new PGDAO();
		dao.save("Banni edu nimde PG");
		dao.save("Khushi PG1");
		dao.save("Ashwini PG");
		dao.save("Golden  PG");
		dao.save(" Nimagagi namma PG");
		
		boolean found = dao.find("Banni edu nimde PG");
		System.out.println(found);
		
		found=dao.findByCaseInSensitive("Khushi PG1");
		System.out.println(found);
		
		found=dao.findByCaseInSensitiveAndTrimmed("Ashwini PG");
		System.out.println(found);
		
	}
}