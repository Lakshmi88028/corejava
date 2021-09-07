class Country{
	
static String[] countryName={"India","SriLanka","England","South Africa","USA","Pakistan","China"};
static int[] noOfStates={29,11,34,45,23,9,12};
static String[] listOfCapitals={"NewDelhi" ,"Colombo" ,"London" ,"London" ,"Washington, D.C." ,"Washington, D.C." ,"Washington, D.C."};
public static void main(String a[]){

//System.out.println(countryName[0]+" "+countryName[1]+" "+countryName[2]+" "+countryName[3]+" "+countryName[4]+" "+countryName[5]+" "+countryName[6]);
//System.out.println(noOfStates[0]+" "+noOfStates[1]+" "+noOfStates[2]+" "+noOfStates[3]+" "+noOfStates[4]+" "+noOfStates[5]+" "+noOfStates[6]);
//System.out.println(listOfCapitals[0]+""+listOfCapitals[1]+""+listOfCapitals[2]+""+listOfCapitals[3]+""+listOfCapitals[4]+""+listOfCapitals[5]+""+listOfCapitals[6]);


for(int i=0;i<countryName.length;i++){
	System.out.println(countryName[i]+"");
}
for(int j=0;j<listOfCapitals.length;j++){
	System.out.println(listOfCapitals[j]+"");
	}
	for(int k=0;k<noOfStates.length;k++){
		System.out.println(noOfStates[k]+"");
	}
}
}














