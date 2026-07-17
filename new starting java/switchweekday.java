import java.util.*;
public class switchweekday {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day:");

        String day=sc.next();
        String type=switch (day){
            case "mon","tue","wed","thu","fri"->"weekday";

            case "sat","sun"->"weekend";

        default->"invalid day";
        };
        System.out.println(type);


        }
    }

