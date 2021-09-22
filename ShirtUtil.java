class ShirtUtil{
public static void main(String a[]){
 
 Shirt shirt = new Shirt(); 
 

shirt.type = "Cotton";
shirt.price = 3000;
shirt.color = "Red";
System.out.println(shirt.type+ " " +shirt.price+ " "+shirt.color);
shirt.write();


Shirt shirt1 = new Shirt(); 
shirt1.type = "Palister";
shirt1.price = 800;
shirt.color = "Blue";
System.out.println(shirt1.type+  " "+shirt1.price+ " "+shirt.color);
shirt1.write();
}
}