import java.util.Scanner;

class ExamMoUtil1{
static String[] hallTicket=new String[3];

public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the candidate name");
String candidateName=sc.next();
System.out.println("Enter the USN No");
String usnNo=sc.next();
System.out.println("Enter the subject");
String subject=sc.next();
hallTicket[0]=candidateName;
hallTicket[1]=usnNo;
hallTicket[2]=subject;
System.out.println("main method started");
ExamMo.allow(hallTicket);
ExamMo.allow(1100);
System.out.println("main method ended");
}
}0