class Metro{

String station;
int capacity;
int speed;
boolean available;

public Metro(){
this("Mahakuvempu", 1000, 20 ,true);
System.out.println("Metro object is created");
}

public Metro(String station, int capacity, int speed, boolean available){
	this.station = station;
	this.capacity = capacity;
	this.speed =  speed;
	this.available =  available;
}
public void displayMetro(){
	System.out.println(this.station+ " "+this.capacity+ " "+this.speed+ " "+available);
}




}