class Museum{

String type;
String location;
int entryFees;
String timing;
int noOfSculpture;
boolean isOpen;

public Museum(){
	this("ArtScience", "Bangalore",100, "10am-4pm", 55 ,true);
System.out.println("Museum object is created");
}

public Museum(String type, String location, int entryFees, String timing, int noOfSculpture, boolean isOpen){
this.type = type;
this.location = location;
this.entryFees = entryFees;
this.timing = timing;
this.noOfSculpture = noOfSculpture;
this.isOpen = isOpen;
}
public void displayMuseum(){
System.out.println(type+ " "+location+ " "+entryFees+ " "+timing+ " "+noOfSculpture+ " "+isOpen);
}




}