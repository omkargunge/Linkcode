package Abstraction1;

public class ATMimp extends ATM{
	private double balance=5000;
	
	public void withdraw(int amount) {
		System.out.println("withdrawing amount:"+amount);
		this.balance-=amount;
		CheckBalance();
	}
	
	public void deposit(int amount) {
		System.out.println("depositing amount:"+amount);
		this.balance+=amount;
		CheckBalance();
	}
	public void CheckBalance() {
		System.out.println("Available Balance:"+this.balance);
	}
	
}
