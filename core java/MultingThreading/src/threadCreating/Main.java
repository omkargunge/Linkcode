package threadCreating;

public class Main {
	
	public static void main(String[] args) {
		 
		Mythread1 Mythread1=new Mythread1();
		
		Mythread2 Mythread2=new Mythread2();
		Thread thread=new Thread(Mythread2);
		
		
		thread.start();
		Mythread1.start();
		
		
	}
}
