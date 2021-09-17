class Speaker{

static String name="Boat";
static int minVolume=0;
static int maxVolume=15;
static boolean isConnected=false;
static int currentVolume;

public static boolean onOrOff(){
if(isConnected==false){

isConnected=true;
return isConnected;
}
else{
return isConnected;
}
}

public static void increaseVolume(){
	System.out.println("inside increaseVolume()");
	if(isConnected){
		if(currentVolume<=maxVolume){
		currentVolume=currentVolume+1;
	System.out.println("The current Volume is :" +currentVolume);
	}
	else{
		System.out.println("Max Value Reached");
	}
}
	System.out.println("end of increaseVolume()");
	
}
public static void decreaseVolume(){
	System.out.println("inside decreaseVolume()");
	if(isConnected){
		if(currentVolume>=minVolume){
			currentVolume=currentVolume-1;
			System.out.println("The current volume is :"+currentVolume);
		}
		else{
			System.out.println("Min Value Reached");
			
		}
	}
		System.out.println("end of decreaseVolume()");
	}
	
}


