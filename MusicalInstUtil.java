class MusicalInstUtil{
 
  public static void main(String a[]){
	 MusicalInstruments music = new MusicalInstruments();
	 
	 music.name = "Guitar";
	 music.price = 4000.50;
	 music.frequency = "20hz";
	 music.type = "Westorn";
	
	 System.out.println(music.name+" "+music.price+" "+music.frequency+" "+music.type);
	 MusicalInstruments.play("Guitar");
 
 
 }

}