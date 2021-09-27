class Transportation{

String transName;
int blockNo;
int seatNo;
String location;
int price;

public Transportation(){
this("Train",2,46,"Harihar",900);
System.out.println("Transportation object is created");
}
public Transportation(String TransName, int blockNo, int seatNo, String location, int price){
this.transName = transName;
this.blockNo = blockNo;
this.seatNo = seatNo;
this.location = location;
this.price = price;
}
public void displayTransportation(){
System.out.println(this.transName+ " "+this.blockNo+ " "+this.seatNo+ " "+location+ " "+price);
}
}