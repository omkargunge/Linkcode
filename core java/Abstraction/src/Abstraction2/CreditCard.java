package Abstraction2;

public class CreditCard extends Payment {

	
	@Override
	void Payment(double amount) {
		System.out.println("payment through CredutCard");
		System.out.println("payment done :"+amount);
	}
}
