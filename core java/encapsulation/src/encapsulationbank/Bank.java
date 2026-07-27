//package encapsulationbank;
//
//public class Bank {
//	public static void main(String[] args) {
//		customer cust1=new customer("omkar",22,3434345L,"pune",123,50000);
//		
//		cust1.setBalance(1000,"admin@123");
//		System.out.println("available balance:"+cust1.getBalance());
//	}
//}
package encapsulationbank;

public class Bank {

    public static void main(String[] args) {

        customer cust1 = new customer(
                "Omkar",
                22,
                3434345L,
                "Pune",
                123,
                50000
        );

        cust1.setBalance(1000, "admin@123");

        System.out.println("Available Balance : " + cust1.getBalance());
        System.out.println("Account Number    : " + cust1.getAccno());

        cust1.display();
    }
}