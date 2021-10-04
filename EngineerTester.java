class EngineerTester{

public static void main(String a[]){

Electrical eee = new Electrical();
eee.collegeName = "BGMIT";
eee.branchName = "EEE";
eee.principalName = "Dr.ShravanKumar";
eee.noOfStudents = 15;
eee.noOfLecturer = 10;

eee.display();
eee.problemSolving("EEE Engineer");
System.out.println("********************************************************************");

Cse cse = new Cse();

cse.collegeName = "BGMIT";
cse.branchName = "computer science";
cse.principalName = "Dr.ShravanKumar";
cse.noOfStudents = 21;
cse.noOfLecturer = 5;

cse.display();
cse.problemSolving("CSE Engineer");
System.out.println("********************************************************************");

Ece ece = new Ece();

ece.collegeName = "BGMIT";
ece.branchName = "Electronics and communication";
ece.principalName = "Dr.ShravanKumar";
ece.noOfStudents = 66;
ece.noOfLecturer = 10;

ece.display();
ece.problemSolving("ECE Engineer");
System.out.println("********************************************************************");

Mech mech = new Mech();

mech.collegeName = "BGMIT";
mech.branchName = "Mechanical Engineer";
mech.principalName = "Dr.ShravanKumar";
mech.noOfStudents = 80;
mech.noOfLecturer = 15;

mech.display();
mech.problemSolving("Mech Engineer");
System.out.println("********************************************************************");

Civil civil = new Civil();

civil.collegeName = "BGMIT";
civil.branchName = "civil Engineer";
civil.principalName = "Dr.ShravanKumar";
civil.noOfStudents = 70;
civil.noOfLecturer = 12;

cse.display();
cse.problemSolving("Civil Engineer");
System.out.println("********************************************************************");
}
}