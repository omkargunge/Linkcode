public class methodrecursion5table {

    public static void test(int n,int a) {
        System.out.println(n*a);
        if(a==10){
            return;
        }
        test(n,++a);
    }
    public static void main(String[] args) {
        test(5,1);
        
    }
}

