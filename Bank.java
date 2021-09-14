class Bank
{

     public static String account="Bank";
	 public static String[] details={"Annayya", "88xxxxxxxxxxxxxxxx1", "xxxxxxxxxx"};
	 public static int minDeposite=1500;
	 
	 public static boolean allow(String [] details)
	 {
	  boolean allowedTocreateAccount=false;
	     System.out.println("Inside allow method");
	 if(minDeposite > 1000)
	 {
		 System.out.println("Amount deposited show me the details");
	  
	  if(details!= null)
	  {
	     
		 allowedTocreateAccount=true;
		 getdetails(details);
		 return allowedTocreateAccount;
		   }
	  
	 else{
		  
		  System.out.println("No details !!! cannot allowed to createAccount");
		     }
	  }
	  
	 else{
		  
		  System.out.println("Amount Hakro minimum 1000");
		  
	 }
	     System.out.println("end of allow method");
		 
	     return allowedTocreateAccount;
	  
	 }
	 
	 public static void getdetails(String[] details)
	 {
		 System.out.println("allow method started");
		 for(int i=0 ; i < details.length ; i++)
		 {
			 System.out.println(details[i]);
		 }
		 
		  System.out.println("allow method ended");
		 
	 }
}