class IceCreamUtil{
public static void main(String a[]){
 
 IceCream  iceCream = new IceCream(); 
 

iceCream.name = "Amul";
iceCream.price = 20;
iceCream.flavour ="Vanilla";
System.out.println(iceCream.name+ " " +iceCream.price+ " " + iceCream.flavour);
iceCream.write();


IceCream iceCream1 = new IceCream(); 
iceCream1.name = "Arun IceCream";
iceCream1.price = 20;
iceCream1.flavour = "Cinnamon Caramel";
System.out.println(iceCream1.name+  " "+iceCream1.price+ " "+ iceCream1.flavour);
iceCream1.write();
}
}