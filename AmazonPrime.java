class AmazonPrime{

static String movies[]={"Shershah","cindrella","RakthaChaitra","Robert"};
static String series[]={"Mirzapur","The Family Man","vampirediaries"};

static String movie="Dia";


public static void main(String a[]){
System.out.println("main method started");
getMovies(movies);

String mov=getMovies(movie);
System.out.println(mov);
getSeries(series);
}

public static void getMovies(String[]movies){
System.out.println("inside getmovies method with string array parameter");
for(int i=0;i<movies.length;i++){
System.out.println(movies[i]);
}
}

public static String getMovies(String movies){
System.out.println("inside getmovies method");
return movie;
}



public static void getSeries(String[]series){
System.out.println("inside getseries method with string array parameter");
for(int i=0;i<series.length;i++){
System.out.println(series[i]);
}
}

public static String getSeries(String series){
System.out.println("inside getseries method");
return series;
}


}
