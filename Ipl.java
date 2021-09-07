class Ipl{
public static void main(String a[]){

String [] teamName=new String[8];
teamName[0]="RCB";
teamName[1]="Chennai SuperKings";
teamName[2]="Mumbai Indians";
teamName[3]="Kolkata Knight Riders";
teamName[4]="Rajasthan Royals";
teamName[5]="Delhi Capitals";
teamName[6]="Sunrisers Hyderabad";
teamName[7]="Punjab Kings";

int []noOfTimesWon=new int[8];
noOfTimesWon[0]=1;
noOfTimesWon[1]=3;
noOfTimesWon[2]=4;
noOfTimesWon[3]=1;
noOfTimesWon[4]=1;
noOfTimesWon[5]=0;
noOfTimesWon[6]=1;
noOfTimesWon[7]=0;

//System.out.println(teamName[0]+" "+teamName[1]+" "+teamName[2]+" "+teamName[3]+" "+teamName[4]+" "+teamName[5]+" "+teamName[6]+" "+teamName[7]);
//System.out.println(noOfTimesWon[0]+" "+noOfTimesWon[1]+" "+noOfTimesWon[2]+" "+noOfTimesWon[3]+" "+noOfTimesWon[4]+" "+noOfTimesWon[5]+" "+noOfTimesWon[6]+" "+noOfTimesWon[7]);
for(int q=0;q<teamName.length;q++){
	System.out.println(teamName[q]+"");
}
for(int w=0;w<noOfTimesWon.length;w++){
	System.out.println(noOfTimesWon[w]+"");
}





}


}