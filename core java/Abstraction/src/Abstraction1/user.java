package Abstraction1;

public class user {
	
	public static void main(String[] args) {
		ATMimp imp=new ATMimp();
		
		ATM atm=imp;
		atm.CheckBalance();
		atm.withdraw(500);
		atm.deposit(200);
		
	}
}
