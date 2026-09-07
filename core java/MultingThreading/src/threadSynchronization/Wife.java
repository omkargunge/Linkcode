package threadSynchronization;

public class Wife extends Thread {
	
	Account acc;
	public Wife(Account acc) {
		this.acc=acc;
	}
	@Override
	
	public void run() {
		acc.withdraw(30000);
		acc.deposit(1000);
	}
}
