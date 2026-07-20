import java.util.Scanner;
public class stringloginpg {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "admin@123";
        String otp = "1234";

        System.out.println("1. Login");
        System.out.println("2. Forgot Password");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Username: ");
            String user = sc.nextLine();

            if (user.equals(username)) {

                System.out.print("Enter Password: ");
                String pass = sc.nextLine();

                if (pass.equals(password)) {
                    System.out.println("Login Successfully");
                } else {
                    System.out.println("Wrong Password");
                }

            } else {
                System.out.println("User Not Found");
            }

        } else if (choice == 2) {

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            System.out.println("OTP Generated: " + otp);

            System.out.print("Enter OTP: ");
            String userOtp = sc.nextLine();

            if (userOtp.equals(otp)) {

                System.out.print("Enter New Password: ");
                password = sc.nextLine();

                System.out.println("Password Changed Successfully");
                System.out.println("New Password: " + password);

            } else {
                System.out.println("Invalid OTP");
            }

        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

