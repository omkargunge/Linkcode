import java.util.Scanner;

public class neonnumber {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one number:");
        int num=sc.nextInt();
        int square=num*num;
        int sum=0;
        
        while(square>0){
            sum=sum+(square%10);
            square=square/10;
            
        }
        if(sum==num){
            System.out.println("neon number");
        }else{
            System.out.println("not a neon number");
        }
        
    }
}
