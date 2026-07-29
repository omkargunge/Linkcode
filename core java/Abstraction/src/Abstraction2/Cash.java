package Abstraction2;

public class Cash extends Payment {

	@Override
	void Payment(double amount) {
		System.out.println("payment through Cash");
		System.out.println("payment done :"+amount);
	}
}
