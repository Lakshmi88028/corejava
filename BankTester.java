class BankTestre{

public static void main(String a[]){
	//upcasting
Object bank = new BandhanBank();
//downcasting
BandhanBank bandhanBank = (BandhanBank) bank;
bank.provideLoans(7.5);

System.out.println(bank)
}
}