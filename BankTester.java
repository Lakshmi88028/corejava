class BankTester{
//@Override
public static void main(String a[]){
Bank bank = new BandhanBank();
bank.provideLoans(7.5);
System.out.println(bank);

Bank bank1 = new Sbi();
bank1.provideLoans(6.5);
System.out.println(bank1);

Bank ka = new KarnatakaBank();
ka.provideLoans(5.5);
System.out.println(ka);

Bank hdfc = new HDFCBank();
hdfc.provideLoans(8.0);
System.out.println(hdfc);

Bank icic = new ICICBank();
icic.provideLoans(8.5);
System.out.println(icic);

Bank baroda = new BarodaBank();
baroda.provideLoans(8.8);
System.out.println(baroda);

Bank axis = new AxisBank();
axis.provideLoans(5.6);
System.out.println(axis);

Bank canara = new CanaraBank();
canara.provideLoans(9.0);
System.out.println(canara);

}
}