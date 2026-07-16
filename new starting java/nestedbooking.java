import java.util.Scanner;

public class nestedbooking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your age:");
        int age=sc.nextInt();

        if(age>18){
            System.out.println("seat available?(yes=1,no=0):");
            int seat=sc.nextInt();

            if(seat==1){
                System.out.println("booking confirm");
            }else{
                System.out.println("bookin not done");
            }
            
        }else{
            System.out.println("not eligible for bookin");
        }
    }
}
