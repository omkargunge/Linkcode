package threadSynchronization;

public class Main {

	
	public static void main(String[] args) {
		
		Account acc=new Account(1000);
		
		Husband hus=new Husband(acc);
		Wife wife=new Wife(acc);
		
		hus.start();
		wife.start();
	}
}
