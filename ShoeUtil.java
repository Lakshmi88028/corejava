class ShoeUtil{
public static void main(String a[]){
 
 Shoe shoe = new Shoe(); 
 

shoe.name = "Sneakers";
shoe.price = 2000;
System.out.println(shoe.name+ " " +shoe.price);
shoe.write();


Shoe shoe1 = new Shoe(); 
shoe1.name = "Boots";
shoe1.price = 800;
System.out.println(shoe1.name+  " "+shoe1.price);
shoe1.write();
}
}