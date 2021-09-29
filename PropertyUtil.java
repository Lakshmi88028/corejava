class PropertyUtil{
public static void main(String a[]){

PropertyDTO prop = new PropertyDTO();
prop.setPropertyHolder("Lakshmi");
prop.setLocation("Bangalore");
prop.setPropertyId(333);
prop.setSize("30*40");

System.out.println(prop.getPropertyHolder()+ " "+prop.getLocation()+ " "+prop.getPropertyId()+ " "+prop.getSize());
}
}
