package classloadinginheritance1;

public class A extends B{
	
	static int a;
	
	static {
		System.out.println("static block A");
	}
	public static void main(String[] args) {
		System.out.println("Class A Method");
		test();
	}
	

}
