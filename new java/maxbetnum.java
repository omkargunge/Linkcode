import java.util.Scanner;
public class maxbetnum {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the two number");
        
        int a=sc.nextInt();
        int b=sc.nextInt();

        
        System.out.println(a>b?"a is greater number":"b is greater number");
    }
}


