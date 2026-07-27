package equalsmethod2;

public class Main {
 
	
	public static void main(String[] args) {
		
		
		Mobile m1=new Mobile("samsung",1234567890L);
		Mobile m2=new Mobile("samsung",1234567890L);
		Mobile m3=new Mobile("vivo",9876543210L);
		
		System.out.println(m1.equals(m2));//true
		System.out.println(m1.equals(m3));
	}
	
}
