class BankTester{

public static void main(String a[]){
	//upcasting
Bank bank = new BandhanBank();
//downcasting
BandhanBank bandhanBank = (BandhanBank) bank;
bank.provideLoans(7.5);
System.out.println(bank);

Bank bank1 = new Sbi();
Sbi sbiBank = (Sbi) bank1;
bank.provideLoans(8.5);
System.out.println(bank1);

Bank ka = new KarnatakaBank();
KarnatakaBank karnatakaBank = (KarnatakaBank) ka;
bank.provideLoans(6.5);
System.out.println(ka);

Bank hdfc = new HDFCBank();
HDFCBank hdfcBank = (HDFCBank) hdfc;
bank.provideLoans(7.5);
System.out.println(hdfc);

Bank icic = new ICICBank();
ICICBank icicBank = (ICICBank) icic;
bank.provideLoans(5.5);
System.out.println(icic);

Bank baroda = new BarodaBank();
BarodaBank barodaBank = (BarodaBank) baroda;
bank.provideLoans(6.5);
System.out.println(baroda);

Bank axis = new AxisBank();
AxisBank axisBank = (AxisBank) axis;
bank.provideLoans(7.5);
System.out.println(axis);




}
}
