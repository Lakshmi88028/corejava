class FancyStore{

String name;
int storeId;
String location;
String ownerName;
boolean isOpen;
String items[] = {"Bangals","jewellery","Nail polish","Ring","Anklets","Lipstik","Foundation","Cream"};

public FancyStore(){
this("Lakshmi store",10, "Kottur","Rudraiah Budi", true );
}

public FancyStore(String name, int storeid, String location, String ownerName, boolean isOpen){
this.name = name;
this.storeId =storeId;
this.location = location;
this.ownerName = ownerName;
this.isOpen = isOpen;
}

public void displayFancyStore(){
System.out.println(this.name+ " "+this.storeId+ " "+this.location+ " "+ownerName+ " "+isOpen);
}
public void getItems(){
for(int i=0;i<this.items.length;i++){
System.out.println(this.items[i]);
}
}

}