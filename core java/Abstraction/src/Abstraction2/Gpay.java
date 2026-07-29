package Abstraction2;

public class Gpay extends Payment{

	@Override
	void Payment(double amount) {
		System.out.println("payment through Gpay");
		System.out.println("payment done :"+amount);
	}
}
