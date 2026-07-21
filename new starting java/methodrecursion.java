public class methodrecursion{
    public static void test(int a) {
        System.out.println("test1");
        if(a==5){
            return;
        }
        test(++a);
    }
    public static void main(String[] args) {
        test(1);
        System.out.println("main method");
    }
}