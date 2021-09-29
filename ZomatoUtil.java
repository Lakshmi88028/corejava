class ZomatoUtil{
public static void main(String a[]){

ZomatoDTO zom = new ZomatoDTO();
zom.setShopName("Mavana Mane");
zom.setType("veg");
zom.setDishName("Biriyani");
zom.setIsOpen(true);

System.out.println(zom.getShopName()+ " "+zom.getType()+ " "+zom.getDishName()+ " "+zom.getIsOpen());
}
}