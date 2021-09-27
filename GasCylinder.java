class GasCylinder{
 public String gasName;
 public int price;
 public String color;
 
 public GasCylinder(String gasName,int price, String color){
 System.out.println("GasCylinder object is created");
 this.gasName = gasName;
 this.price = price;
 this.color = color;
 System.out.println(gasName+ " "+price+ " "+color);
 }
 public static void main(String a[]){
 
 GasCylinder gas = new GasCylinder("LPG", 800, "Red");
 GasCylinder gas1 = new GasCylinder("Indian", 900, "Blue");
 }
}