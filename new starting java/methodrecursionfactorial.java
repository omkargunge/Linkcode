public class methodrecursionfactorial {
    
    public static int fact(int num) {
        
        if(num==1){
            return 1;
        }
        return num*fact (num-1);
    }
    public static void main(String[] args) {
        int factorial=fact(5);
        System.out.println("factorial :"+factorial);
    }
}

