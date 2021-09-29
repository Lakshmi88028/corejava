class DominosUtil{
public static void main(String a[]){

DominosDTO dom = new DominosDTO();
dom.setItems("Pizza");
dom.setAddress("Rajajinagar");
dom.setOrderNumber(34);
dom.setPrice(210);

System.out.println(dom.getItems()+ " "+dom.getAddress()+ " "+dom.getOrderNumber()+ " "+dom.getPrice());
}
}