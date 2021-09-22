class ChocolateUtil{
public static void main(String a[]){
 
 Chocolate chocolate = new Chocolate(); 
 

chocolate.name = "Kitkat";
chocolate.price = 20;
chocolate.type ="truffle";
System.out.println(chocolate.name+ " " +chocolate.price+ " " + chocolate.type);
chocolate.write();


Chocolate chocolate1 = new Chocolate(); 
chocolate1.name = "Dairy Milk";
chocolate1.price = 80;
chocolate1.type = "Silk Bubbly";
System.out.println(chocolate1.name+  " "+chocolate1.price+ " "+ chocolate1.type);
chocolate1.write();
}
}