package trek;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Fort> forts = new ArrayList<>();
        ArrayList<Guide> guides = new ArrayList<>();
        ArrayList<Event> events = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        forts.add(new Fort("Raigad", "Raigad", "Raigad was the capital of Chhatrapati Shivaji Maharaj"));

        forts.add(new Fort("Sinhagad", "Pune", "Sinhagad is famous for the bravery of Tanaji Malusare"));

        forts.add(new Fort("Pratapgad", "Satara", "Pratapgad is famous for the Battle of Pratapgad"));

        forts.add(new Fort("Shivneri", "Junnar", "Shivneri is the birthplace of Chhatrapati Shivaji Maharaj"));

        guides.add(new Guide("Raj Patil", "9876543210", "5 Years"));

        guides.add(new Guide("Amit Shinde", "9876501234", "3 Years"));

        events.add(new Event("Birth of Chhatrapati Shivaji Maharaj", "Shivneri", "1630",
                "Shivaji Maharaj was born at Shivneri Fort"));

        events.add(new Event("Battle of Pratapgad", "Pratapgad", "1659",
                "Historic battle between Shivaji Maharaj and Afzal Khan"));

        events.add(new Event("Battle of Sinhagad", "Sinhagad", "1670", "Tanaji Malusare fought bravely at Sinhagad"));

        int choice;

        do {

            System.out.println("---------------------------------------");
            System.out.println("Trekking and Fort History System");
            System.out.println("---------------------------------------");
            System.out.println("1.Display All Forts");
            System.out.println("2.Search Fort");
            System.out.println("3.View Fort History");
            System.out.println("4.Guide");
            System.out.println("5.Important Events");
            System.out.println("6.Book Trek");
            System.out.println("7.Display Bookings");
            System.out.println("8.Exit");
            System.out.println("--------------------------------------");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("-----All Forts-----");

                for (Fort f : forts) {
                    f.display();
                }
            }

            else if (choice == 2) {

                System.out.print("Enter fort name: ");
                String search = sc.next();

                boolean found = false;

                for (Fort f : forts) {
                    if (f.getName().equalsIgnoreCase(search)) {
                        f.display();

                        found = true;
                    }
                }

                if (found == false) {
                    System.out.println("Fort not found!");
                }
            }

            else if (choice == 3) {

                System.out.print("Enter fort name: ");
                String search = sc.next();

                boolean found = false;

                for (Fort f : forts) {

                    if (f.getName().equalsIgnoreCase(search)) {

                        System.out.println("-----Fort History-----");
                        System.out.println("Fort Name :" + f.getName());
                        System.out.println("Location  :" + f.getLocation());
                        System.out.println("History   :" + f.getHistory());

                        found = true;
                    }
                }

                if (found == false) {
                    System.out.println("Fort not found!");
                }
            }

            else if (choice == 4) {

                System.out.println("-----Guides-----");

                for (Guide g : guides) {
                    Person p = g;
                    p.display();
                }
            }

            else if (choice == 5) {

                System.out.println("-----Important Events-----");

                for (Event e : events) {
                    e.displayEvent();
                }
            }

            else if (choice == 6) {

                System.out.println("-----Book Trek-----");
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter mobile: ");
                String mobile = sc.next();
                System.out.print("Enter fort name: ");
                String fortName = sc.next();
                System.out.print("Enter number of people: ");
                int people = sc.nextInt();

                double price = 0;

                if (fortName.equalsIgnoreCase("Raigad")) {
                    price = 500;
                }

                else if (fortName.equalsIgnoreCase("Sinhagad")) {
                    price = 300;
                }

                else if (fortName.equalsIgnoreCase("Pratapgad")) {
                    price = 400;
                }

                else if (fortName.equalsIgnoreCase("Shivneri")) {
                    price = 350;
                }

                else {
                    System.out.println("Fort not available for booking!");
                }

                if (price > 0) {

                    Booking b = new Booking(name, mobile, fortName, people, price);
                    bookings.add(b);

                    System.out.println("Trek booked successfully");
                    System.out.println("Price per person :Rs" + price);
                    System.out.println("Total Price      : Rs" + (people * price));
                }
            }

            else if (choice == 7) {

                System.out.println("-----All Booking-----");

                if (bookings.size() == 0) {
                    System.out.println("No bookings available");
                }

                else {
                    for (Booking b : bookings) {
                        b.displayBooking();
                    }
                }
            }

            else if (choice == 8) {
                System.out.println("Thank you");
            }

            else {
                System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}