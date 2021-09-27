class RestuarantTester{
 public static void main(String a[]){
 
 Restuarant rest = new Restuarant();
 rest.restuarantName = "1947";
 rest.type = "veg";
 rest.location = "Malleshwaram";
 rest. restuarantId = 456;
 rest.ownerName = "Basu M Yatnal";
 
 rest.serveFood();
 rest.displayRestuarantDetails();
 
 Restuarant rest1 = new Restuarant();
 rest1.restuarantName = "Empire";
 rest1.type = "Non-veg";
 rest1.location = "Majestic";
 rest1. restuarantId = 2675;
 rest1.ownerName = "Lakshmi Budi";
 
 rest1.serveFood();
 
 }
}