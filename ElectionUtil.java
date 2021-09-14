class ElectionUtil
{

     static String[] voterId={"Lakshmi","2nd july 1999","kotttur"};
	 
	 public static void main(String a[])
	 {
		 boolean allowed=Election.allow(voterId);
		 System.out.println(allowed);
	 }
}
