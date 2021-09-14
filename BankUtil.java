class BankUtil
{

     static String[] details={"Annayya", "88xxxxxxxxxxxxxxxx1", "xxxxxxxxxx"};
	 
	 public static void main(String a[])
	 {
	 
	 boolean allowed=Bank.allow(details);
	 System.out.println(allowed);
	 }

}