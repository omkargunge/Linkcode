import java.util.Scanner;
public class ternarioperatoe {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name");
        String name=sc.next();

        System.out.println("enter your age");
        int age=sc.nextInt();

        System.out.println("name: "+name);
        System.out.println(age>18?"eligibal for vote":"not eligible for vote");
    }
}
