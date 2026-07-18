import java.util.*;
public class pallindrome {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one number:");
        int num=sc.nextInt();
        int orignal=num;
        int reverse=0;
        
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(orignal==reverse){
            System.out.println("palindrome number");
        }else{
            System.out.println("not a palindrome number");
        }
        
    }
    
}


