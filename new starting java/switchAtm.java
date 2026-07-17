import java.util.*;
public class switchAtm {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int balance=10000;

        System.out.println("-----Atm menu-----");
        System.out.println("1.chack balance");
        System.out.println("2.withdeaw");
        System.out.println("3.deposit");
        System.out.println("4.exit");

        System.out.println("enter your choice:");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("your balance is Rs."+balance);
            break;

            case 2:
            balance=balance-1000;
            System.out.println("Rs.1000 withdraw successfully.");
            System.out.println("available balance is Rs."+balance);
            break;

            case 3:
            balance=balance+1000;
            System.out.println("Rs.1000 Deposit successfully.");
            System.out.println("available balance is Rs."+balance);
            break;

            case 4:
            System.out.println("thank you");
            break;

            default:
            System.out.println("invalid choice");



        }


        
    }
    
}
