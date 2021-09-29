public class PropertyDTO{

public PropertyDTO(){
System.out.println("PropertyDTO object is created");
}
private String propertyHolder;
private String location;
private int propertyId;
private String size;

public String getPropertyHolder(){
return propertyHolder;
}
public void setPropertyHolder(String propertyHolder){
this.propertyHolder = propertyHolder;
}
public String getLocation(){
return location;
}
public void setLocation(String location){
this.location = location;
}
public int getPropertyId(){
return propertyId;
}
public void setPropertyId(int propertyId){
this.propertyId = propertyId;
}
public String getSize(){
return size;
}
public void setSize(String size){
this.size = size;
}

}