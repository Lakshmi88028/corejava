class LicUtil{
public static void main(String a[]){

LicDTO lic = new LicDTO();
lic.setHolderName("Mallikarjun");
lic.setPolicyId(5368);
lic.setYears(5);

System.out.println(lic.getHolderName()+ " "+lic.getPolicyId()+ " "+lic.getYears());
}
}