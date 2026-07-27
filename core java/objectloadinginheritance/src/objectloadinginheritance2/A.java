package objectloadinginheritance2;


public class A extends B{
	
	int a;
	
	{
		System.out.println("non static block A");
	}
	public void test() {
		System.out.println("ns A Method");
		
	}
	A(){
		System.out.println("constructor A");
	}
	public static void main(String[] args) {
		new A();
	}
	
	

}
