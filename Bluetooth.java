class Bluetooth{

private static Bluetooth bluetooth = null;
public static Bluetooth getBluetooth(){
return bluetooth;
}
 static {
 bluetooth = new Bluetooth();
 }
} 