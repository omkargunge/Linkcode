package inheritancebasic;

public class Main {
	public static void main(String[] args) {
		//Company company=new Company();
		
		Wipro wipro=new Wipro();
		System.out.println(wipro.ctype);
		System.out.println(wipro.noOfEmployee);
		
		wipro.start();
		wipro.work();
	}
}
