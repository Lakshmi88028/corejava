class MncCompaniesTester{
public static void main(String a[]){
System.out.println("--------------------------------------------------------------------");

Wipro wp = new Wipro();

wp.companyName = "Wipro Technologies Ltd.";
wp.address = "DivyaSree Technopark, SEZ Unit I & II, EPIP Zone Doddanakundi,A5 Rd, Kundalahalli, Whitefield, Bengaluru, Karnataka 560037";
wp.contNo =  "080 3029 2929";
wp.noOfEmployees = 70;

wp.service("Wipro");
wp.display();
System.out.println("--------------------------------------------------------------------");

Ibm ibm = new Ibm();
ibm.companyName = "IBM India";
ibm.address = "Subramanya Arcade Tower-C, Subramanya Arcade, Bannerghatta Main Rd, Bengaluru, Karnataka 560029";
ibm.contNo = "080 4068 3000";
ibm.noOfEmployees =100;

ibm.service("Ibm");
ibm.display();
System.out.println("--------------------------------------------------------------------");


TechMahindra tech = new TechMahindra();
ibm.companyName = "TechMahindra";
ibm.address = "KIADB Industrial Area, Plot No. 45- 47, First Main Rd, Electronic City Phase II, Electronic City, Bengaluru, Karnataka 560100";
ibm.contNo = "080678 07777";
ibm.noOfEmployees =101;

tech.service("TechMahindra");
tech.display();
System.out.println("--------------------------------------------------------------------");

Mphasis mp = new Mphasis();
mp.companyName = "Mphasis Limited";
mp.address = "Bagmane Tech Park, Byrasandra Village, C V Raman Nagar, Bengaluru, Karnataka 560093";
mp.contNo = "080 4004 4444";
mp.noOfEmployees =200;

mp.service("Mphasis");
mp.display();
System.out.println("--------------------------------------------------------------------");

ItcInfotechIndiaLtd itc = new ItcInfotechIndiaLtd();
itc.companyName = "IBM India";
itc.address = "Subramanya Arcade Tower-C, Subramanya Arcade, Bannerghatta Main Rd, Bengaluru, Karnataka 560029";
itc.contNo = "080 4068 3000";
itc.noOfEmployees =100;

itc.service("ItcInfotechIndiaLtd");
itc.display();
System.out.println("--------------------------------------------------------------------");

MindtreeLtd min = new MindtreeLtd();
min.companyName = "Mphasis Limited";
min.address = "Bagmane Tech Park, Byrasandra Village, C V Raman Nagar, Bengaluru, Karnataka 560093";
min.contNo = "080 4004 4444";
min.noOfEmployees =200;

mp.service("Mphasis");
mp.display();
System.out.println("--------------------------------------------------------------------");


Intuit intu = new Intuit();
intu.companyName = "Intuit";
intu.address = "EcoSpace, Intuit Campus 8 , Campus 4A , Campus 6A, Pritech Rd, Adarsh Palm Retreat, Bellandur, Bengaluru, Karnataka 560103";
intu.contNo = "080 4176 9200";
intu.noOfEmployees =300;

intu.service("Intuit");
intu.display();
System.out.println("--------------------------------------------------------------------");
Infosys inf = new Infosys();
inf.companyName = "Infosys Limited";
inf.address = "Plot No, 44, Hosur Rd, Konappana Agrahara, Electronic City, Bengaluru, Karnataka 560100";
inf.contNo = "080 2852 0261";
inf.noOfEmployees =400;

inf.service("Infosys");
inf.display();
System.out.println("--------------------------------------------------------------------");

Cisco cis = new Cisco();
cis.companyName = "Cisco Systems India Pvt Ltd";
cis.address = "SEZ Unit, Cessna Business Park, Kadubeesanahalli Village, Hobli, Sarjapur, Varthur Rd, Marathahalli, Bengaluru, Karnataka 560103";
cis.contNo = "080 4004 4444";
cis.noOfEmployees =185;

cis.service("Cisco Systems India Pvt Ltd");
cis.display();
System.out.println("--------------------------------------------------------------------");

GlobalEdge global = new GlobalEdge();
global.companyName = "GlobalEdge";
global.address = "Global Village, RVCE Post, Mysore Rd, Bengaluru, Karnataka 560059";
global.contNo = "08071 006 677";
global.noOfEmployees =800;

global.service("GlobalEdge");
global.display();
System.out.println("--------------------------------------------------------------------");

TrigentSoftware tri = new TrigentSoftware();
tri.companyName = "Trigent Software Pvt. Ltd.";
tri.address = "2nd Floor, East Wing, Khanija Bhavan #49, Race Course Rd, Bengaluru, Karnataka 560001";
tri.contNo = "080 2215 7000";
tri.noOfEmployees =675;

tri.service("Trigent Software Pvt. Ltd.");
tri.display();
System.out.println("--------------------------------------------------------------------");



}
}