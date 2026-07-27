package objectloadinginheritance2;

public class B {
		
	    int b;
	    {
			System.out.println("non static block B");
		}
		public  void test() {
			System.out.println("class B method");
		}
		B(){
			System.out.println("constructor B");
		}
}
