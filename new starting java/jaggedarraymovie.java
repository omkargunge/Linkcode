import java.util.Scanner;
public class jaggedarraymovie {
  



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Movie Ticket Booking =====");

        // Jagged Array
        char[][] seats = {
                {'O','O','O','O'},             // VIP
                {'O','O','O','O','O','O'},     // Premium
                {'O','O','O','O','O','O','O','O'} // Regular
        };

        while (true) {

            // Display Seats
            System.out.println("\nAvailable Seats:");

            for (int i = 0; i < seats.length; i++) {

                if (i == 0)
                    System.out.print("1. VIP      ");
                else if (i == 1)
                    System.out.print("2. Premium ");
                else
                    System.out.print("3. Regular ");

                System.out.print("(1-" + seats[i].length + ") : ");

                for (int j = 0; j < seats[i].length; j++) {
                    System.out.print("[" + seats[i][j] + "]");
                }
                System.out.println();
            }

            System.out.println("\nO = Available");
            System.out.println("X = Booked");
            System.out.println("4. Exit");

            System.out.print("\nEnter Seat Category (1-4): ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thank You!");
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid Category!");
                continue;
            }

            System.out.print("Enter Seat Number: ");
            int seat = sc.nextInt();

            if (seat < 1 || seat > seats[choice - 1].length) {
                System.out.println("Invalid Seat Number!");
                continue;
            }

            if (seats[choice - 1][seat - 1] == 'O') {
                seats[choice - 1][seat - 1] = 'X';
                System.out.println("Movie Ticket Booked Successfully!");
            } else {
                System.out.println("Seat Already Booked!");
            }
        }

        sc.close();
    }
}

