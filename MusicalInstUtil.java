class MusicalInstUtil{
 
  public static void main(String a[]){
	 MusicalInstruments music = new MusicalInstruments();
	 music.name = " Guitar";
	 music.price = 4000.50;
	 music.frequency = "30hz";
	 music.type = "Western";
	 
	 System.out.println(music.name+" "+music.price+" "+music.frequency+" "+music.type);
	 music.play(music.name);
 
 
 }

}