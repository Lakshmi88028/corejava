class Bottle{

private static Bottle bottle = null;
public static Bottle getBottle(){
return bottle;
}
static {
bottle =  new Bottle();
}
}