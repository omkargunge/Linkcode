package threadSynchronization;

public class Husband extends Thread {
	
	Account acc;
	public Husband(Account acc) {
		this.acc=acc;
	}
		
		@Override
		public void run() {
		acc.withdraw(500);
		acc.deposit(50000);
		}
}


		
	


