class Bank{

public String name;
public String location;

public Bank(){
}


public Bank(String name,String location){
this.name=name;
this.location=location;
}

public void display(){
System.out.println(name+ " "+location);
}


public static void main(String a[]){
Bank bank = new Bank("SBI","Bangalore");
bank.display();
}



}