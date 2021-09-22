class FilmIndustryUtil{
public static void main(String a[]){
 
 FilmIndustry  filmIndustry = new FilmIndustry(); 
 

filmIndustry.name = "Sandalwood";
filmIndustry.favHero = "D boss";
filmIndustry.favMovie ="Yajamana";
System.out.println(filmIndustry.name+ " " +filmIndustry.favHero+ " " + filmIndustry.favMovie);
filmIndustry.write();


FilmIndustry filmIndustry1 = new FilmIndustry(); 
filmIndustry1.name = "Hollywood";
filmIndustry1.favHero = "Shahrukh khan";
filmIndustry1.favMovie = "Swades";
System.out.println(filmIndustry1.name+  " "+filmIndustry1.favHero+ " "+filmIndustry1.favMovie);
filmIndustry1.write();
}
}