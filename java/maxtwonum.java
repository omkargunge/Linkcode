import java.util.Scanner;
class maxtwonum{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter any two number");

        int a=sc.nextInt();
        int b=sc.nextInt();

        int max=(a>b)?a:b;

        System.out.println("maximum number: "+max);
    }
}