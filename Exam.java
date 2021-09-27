class Exam{

public String universityName;
public int fees;

public Exam(String name,int fs){
System.out.println("Exam object is created");
universityName = name;
fees =fs;
System.out.println(name+ " "+fs);
}
 
public static void main(String a[]){
	Exam exam = new Exam("vtu",1350);
	Exam exam1 = new Exam("RCUB",1500);
	Exam exam2 = new Exam("Ku",1295);
}
 
 }





