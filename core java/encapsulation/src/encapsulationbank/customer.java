//package encapsulationbank;
//
//public class customer {
//	
//	String name;
//	int age;
//	long adharno;
//	String add;
//	private int accno;
//	private double balance;
//	final private static String pass="admin@123";
//	
//	
//	public double getBalance() {
//		return this.balance;
//	}
//		public void setBalance(double bal, String password) {
//			if(pass.equals(password)){
//				this.balance+=bal;
//			}else {
//				System.out.println("incorrect password");
//			}
//		}
//		customer(String name,int age,long no,String add,int acc,double balance){
//			this.name=name;
//			this.age=age;
//			this.adharno=no;
//			this.add=add;
//			this.accno=acc;
//			this.balance=balance;
//		}
//		public void checkBalance() {
//			System.out.println("availabance Balance:"+this.balance);
//		}
//	}
//
package encapsulationbank;

public class customer {

    String name;
    int age;
    long adharno;
    String add;

    private int accno;
    private double balance;

    private static final String PASS = "admin@123";

    // Constructor
    public customer(String name, int age, long no, String add, int acc, double balance) {
        this.name = name;
        this.age = age;
        this.adharno = no;
        this.add = add;
        this.accno = acc;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (Deposit)
    public void setBalance(double bal, String password) {
        if (PASS.equals(password)) {
            balance += bal;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Incorrect password.");
        }
    }

    // Getter for account number
    public int getAccno() {
        return accno;
    }

    // Display customer details
    public void display() {
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Aadhar No     : " + adharno);
        System.out.println("Address       : " + add);
        System.out.println("Account No    : " + accno);
        System.out.println("Balance       : " + balance);
    }
}