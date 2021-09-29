class GoldUtil{
public static void main(String a[]){

GoldDTO dto = new GoldDTO();
dto.setPrice(10000);
dto.setType("RoseGold");
dto.setKarats("24k");


System.out.println(dto.getPrice()+ " "+dto.getType()+ " "+dto.getKarats());
}

}






