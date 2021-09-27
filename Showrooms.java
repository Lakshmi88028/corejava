class Showrooms {
public String showroomName;
public String type;
	
	
public Showrooms(String showroomName, String type) {
System.out.println("Showrooms object is created");
this.showroomName = showroomName;
this.type = type;
System.out.println(showroomName+" "+type);
	}
	
	public static void main(String[] args) {
		
		Showrooms details1 = new Showrooms("Bellad showroom", "Cars");
		Showrooms details2 = new Showrooms("Enfiels Showroom", "Bikes");
	}

}