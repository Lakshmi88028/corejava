class Election{
                public static String Location="Govt school";
                public static String[] voterId={"Lakshmi","2nd july 1999","kotttur"};
                 public static int age=20;
	 
     public static boolean allow(String[] voterId)
    s {
  boolean allowedToVote=false;
                        if(age > 18)
		 {
			 if(voterId != null)
			 {
				 allowedToVote=true;
				 getVoterId(voterId);
				 return allowedToVote;
				  }
		 else{
			 
			 System.out.println("No voterId !!! Cannot allowed to vote");
		     }
		 }
		  else{
			  
			  System.out.println("Vote after 18");
		  }
	       
		     return allowedToVote;
			 		   }
	 
	 
	 public static void getVoterId(String[] voterId)
	 {
		 System.out.println("allow method started");
		 for(int i=0; i<voterId.length; i++)
		 {
			 System.out.println(voterId[i]);
		 }
		 System.out.println("allow method ended");
	 }
}	 