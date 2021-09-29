public class ZomatoDTO{
 
 public ZomatoDTO(){
 System.out.println("ZomatoDTO object is created");
 }
 
 private String shopName;
 private String type;
 private String dishName;
 private boolean isOpen;
 
 public String getShopName(){
 return shopName;
 }
 public void setShopName(String shopName){
 this.shopName = shopName;
 }
 public String getType(){
 return type;
 }
 public void setType(String type){
 this.type = type;
 }
 public String getDishName(){
 return dishName;
 }
 public void setDishName(String dishName){
 this.dishName = dishName;
 }
 public boolean getIsOpen(){
 return isOpen;
 }
 public void setIsOpen(boolean isOpen){
 this.isOpen =isOpen;
 }
 
}