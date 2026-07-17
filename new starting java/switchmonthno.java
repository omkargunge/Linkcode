import java.util.*;
public class switchmonthno {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month:");

        String month=sc.next();
        String type=switch (month){
            case "1","3","5","7","8","10","12"->"31days";

            case "4","6","9","11"->"30days";

            case "2"->"28 or 29 days";

        default->"invalid day";
        };
        System.out.println(type);


        
    }


}
