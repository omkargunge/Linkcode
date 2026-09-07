package threadSynchronization;

public class Account {

	double bankBalance;
	
	public Account(double bankBalance) {
		this.bankBalance=bankBalance;
		
	}
	//hus--wife
	
	public synchronized void withdraw(int amount) {
		System.out.println("debited Amount:" +amount);
		this.bankBalance-=amount;
		System.out.println("Available Balance:"+bankBalance);
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("credited Amount:" +amount);
		this.bankBalance+=amount;
		System.out.println("Available Balance:"+bankBalance);
	}
	
	
}
