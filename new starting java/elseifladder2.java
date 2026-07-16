import java.util.Scanner;

public class elseifladder2 {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your number:");
        int n=sc.nextInt();

        if(n%3==0&&n%5==0){
            System.out.println("fizz and buzz");
        }else if(n%3==0){
            System.out.println("fizz");
        }else if(n%5==0){
            System.out.println("buzz");
        }
        else{
            System.out.println("not divisible by 3 or 5");
        }
    }
    
}
