import java.util.Scanner;
class basic{

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name=sc.next();

        System.out.println("Enter Your Age");
        int age=sc.nextInt();

        System.out.println("Name:"+name);
        System.out.println(age>18?"Eligibal To Vote":"Not Eligibal To Vote");

    }
}