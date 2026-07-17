import java.util.*;
public class switchyield {
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day:");

        String day=sc.next();
        String type=switch (day){
            case "mon","tue","wed","thu","fri"->"weekday";

            case "sat","sun"->{
                System.out.println("enter sat(1/2/3/4)");
                int n=sc.nextInt();
                if(n==2||n==4){yield"weekday";}
                else{yield"weekend";}
            }

        default->"invalid day";
        };
        System.out.println(type);


        
    }


}
