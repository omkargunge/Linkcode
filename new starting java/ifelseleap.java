import java.util.*;
public class ifelseleap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter year:");
        int year=sc.nextInt();

        if(year % 4 ==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
