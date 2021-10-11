class Pg{

private static Pg pg;
public static Pg getPg(){
return pg;
}
static{
pg = new Pg();
}
}