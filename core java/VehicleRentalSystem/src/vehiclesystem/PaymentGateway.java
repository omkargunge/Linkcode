package vehiclesystem;

public class PaymentGateway {

    public static boolean processpayment(double totalBill) {

        System.out.println("Processing Payment : " + totalBill);

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.println("Payment Successful");

        return true;

    }

}