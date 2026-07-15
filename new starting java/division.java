import java.util.*;
public class division {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two number");

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(b!=0){
            System.out.println("division :" + a + "/" + b + "=" + (a / b));

        }
        else{
            System.out.println("division by zero is not allowed.");
        }
      
    }
}


