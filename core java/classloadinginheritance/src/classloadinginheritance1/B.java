package classloadinginheritance1;

public class B {
		static int b;
		static {
			System.out.println("static block B");
		}
		public static void test() {
			System.out.println("class B method");
		}
}
