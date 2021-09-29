public class GoldDTO{

public GoldDTO(){
System.out.println("GoldDTO object is created");
}
private int price;
private String type;
private String karats;

public  int getPrice(){
return price;
}
public void setPrice(int price){
this.price = price;
}
public String getType(){
return type;
}
public void setType(String type){
this.type = type;
}
public  String  getKarats(){
return karats;
}
public void setKarats(String karats){
this.karats = karats;
}
}