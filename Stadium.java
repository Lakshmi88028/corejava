class Stadium{
public String name;
public int capacity;
public String city;

public Stadium(String na, int cap, String ci){
System.out.println("Stadium object is created");
name = na;
capacity = cap;
city = ci;
System.out.println(name+ " "+capacity+ " "+city);
}
public static void main(String a[]){
Stadium sta = new Stadium("Chinnaswami", 40, "Bangalore");
Stadium sta1 = new Stadium("Kottureswara", 80, "Kottur");
}


}