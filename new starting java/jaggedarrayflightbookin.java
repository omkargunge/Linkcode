 import java.util.Scanner;
public class jaggedarrayflightbookin {
   



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Flight Seat Booking =====");

        // Jagged Array
        char[][] flight = {
                {'O','O','O','O'},           // First Class (4 seats)
                {'O','O','O','O','O','O'},   // Business Class (6 seats)
                {'O','O','O','O','O','O','O','O'} // Economy Class (8 seats)
        };

        while (true) {

            // Display Seats
            System.out.println("\nAvailable Seats:");

            for (int i = 0; i < flight.length; i++) {

                if (i == 0)
                    System.out.print("1. First Class ");
                else if (i == 1)
                    System.out.print("2. Business Class ");
                else
                    System.out.print("3. Economy Class ");

                System.out.print("(1-" + flight[i].length + ") : ");

                for (int j = 0; j < flight[i].length; j++) {
                    System.out.print("[" + flight[i][j] + "]");
                }
                System.out.println();
            }

            System.out.println("\nO = Available");
            System.out.println("X = Booked");

            System.out.println("\n4. Exit");

            System.out.print("Enter Class (1-4): ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thank You!");
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid Class!");
                continue;
            }

            System.out.print("Enter Seat Number: ");
            int seat = sc.nextInt();

            if (seat < 1 || seat > flight[choice - 1].length) {
                System.out.println("Invalid Seat Number!");
                continue;
            }

            if (flight[choice - 1][seat - 1] == 'O') {
                flight[choice - 1][seat - 1] = 'X';
                System.out.println("Seat Booked Successfully!");
            } else {
                System.out.println("Seat Already Booked!");
            }
        }

        sc.close();
    }
}

