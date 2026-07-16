import java.util.*;
public class userlogin {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        String user="admin";
        String pass="admin@123";

        System.out.println("-----login-----");
        System.out.println("enter user name:");
        String username=sc.next();

        System.out.println("enter password:");
        String password=sc.next();

        String result=(user.equals(username)&&pass.equals(password))?"login sucessfull":(user.equals(username)?"incorrect password":"user not found");

        System.out.println(result);


    }
}
