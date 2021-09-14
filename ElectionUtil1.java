import java.util.Scanner;

class ElectionUtil1
{
public static void main(String a[])
{
Scannwe sc=new Scanner(System.in);
System.out.println("Enter the age");
String age=sc.next();

String value=Election.voting(Integer.parseInt(age));
System.out.println(value);
}
}