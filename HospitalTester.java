import java.util.*;
class HospitalTester{
public static void main(String a[]){


Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
int size = sc.nextInt();

Hospital hospital = new Hospital(size);

for(int i=0;i<size;i++){

PatientDTO dto = new PatientDTO();

System.out.println("Enter the PatientDetails");
System.out.println("Enter the PatientId");
int patientId=sc.nextInt();
System.out.println("Enter the PatientName");
String patientName=sc.next();
System.out.println("Enter the ContactNo");
long contactNo=sc.nextLong();
System.out.println("Enter the Address");
String address=sc.next();
System.out.println("Enter the BloodGroup");
String bloodGroup=sc.next();
System.out.println("Enter the Age");
int age=sc.nextInt(); 
System.out.println("Enter the Gender");
char gender=sc.next().charAt(0); 

dto.setPatientId(patientId);
dto.setPatientName(patientName);
dto.setContactNo(contactNo);
dto.setAddress(address);
dto.setBloodGroup(bloodGroup);
dto.setAge(age);
dto.setGender(gender);

boolean isAdded=hospital.createPatientDetails(dto);
System.out.println("PatientAdded:"+isAdded);
}


System.out.println(hospital.getPatientByName("Rohit"));
System.out.println(hospital.getPatientById(1));
System.out.println(hospital.getPatientByAge(25));
System.out.println(hospital.getPatientByAddress("Rajajinagar"));
System.out.println(hospital.getPatientByBloodGroup("O-ve"));
System.out.println(hospital.getPatientByGender('M'));
System.out.println(hospital.getPatientByContactNo(7549087648L));

System.out.println("Enter patient id and contact number to update");
int patientId=sc.nextInt();
long contactNo=sc.nextLong();
hospital.updateContactNoById(1,6363628479L);

hospital.getAllPatients();

System.out.println("Enter patient Id to delete");
int id1=sc.nextInt();
hospital.deletePatientById(id1);
		
hospital.getAllPatients();
		


}

}