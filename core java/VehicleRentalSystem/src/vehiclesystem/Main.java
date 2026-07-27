package vehiclesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static VehicleInventory inventory = new VehicleInventory();

    public static void main(String[] args) {

        initializeVehicleInventory();

        boolean flag = true;

        while (flag) {

            System.out.println("\n===== Vehicle Rental System =====");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                showAdminMenu();
                break;

            case 2:
                showCustomerMenu();
                break;

            case 3:
                flag = false;
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice.");
            }

        }

    }

    private static void initializeVehicleInventory() {

        inventory.addVehicle(new Car("C001", 5000, 6));
        inventory.addVehicle(new Car("C002", 7000, 8));

        inventory.addVehicle(new Bike("B001", 700, true));
        inventory.addVehicle(new Bike("B002", 500, false));

        inventory.addVehicle(new Bus("BS01", 15000, 20));
        inventory.addVehicle(new Bus("BS02", 20000, 25));

    }

    public static void showAdminMenu() {

        System.out.print("Enter Username : ");
        String name = sc.next();

        System.out.print("Enter Password : ");
        String pass = sc.next();

        if (Admin.authenticate(name, pass)) {

            boolean flag = true;

            while (flag) {

                System.out.println("\n----- ADMIN MENU -----");
                System.out.println("1. Add Vehicle");
                System.out.println("2. Remove Vehicle");
                System.out.println("3. Send Vehicle For Maintenance");
                System.out.println("4. Complete Maintenance");
                System.out.println("5. Show All Vehicles");
                System.out.println("6. Exit");

                int ch = sc.nextInt();

                switch (ch) {

                case 1:

                    System.out.println("1.Car");
                    System.out.println("2.Bike");
                    System.out.println("3.Bus");

                    int type = sc.nextInt();

                    System.out.print("Vehicle ID : ");
                    String id = sc.next();

                    System.out.print("Rental Rate : ");
                    int rate = sc.nextInt();

                    switch (type) {

                    case 1:
                        System.out.print("Seats : ");
                        inventory.addVehicle(new Car(id, rate, sc.nextInt()));
                        break;

                    case 2:
                        System.out.print("Helmet Available (yes/no): ");
                        boolean helmet = sc.next().equalsIgnoreCase("yes");
                        inventory.addVehicle(new Bike(id, rate, helmet));
                        break;

                    case 3:
                        System.out.print("Seats : ");
                        inventory.addVehicle(new Bus(id, rate, sc.nextInt()));
                        break;
                    }

                    break;

                case 2:

                    System.out.print("Vehicle ID : ");
                    Vehicle vehicle = findVehicleById(sc.next());

                    if (vehicle != null)
                        inventory.removeVehicle(vehicle);
                    else
                        System.out.println("Vehicle Not Found.");

                    break;

                case 3:

                    System.out.print("Vehicle ID : ");
                    Vehicle v1 = findVehicleById(sc.next());

                    if (v1 != null)
                        v1.sendForMaintenance();
                    else
                        System.out.println("Vehicle Not Found.");

                    break;

                case 4:

                    System.out.print("Vehicle ID : ");
                    Vehicle v2 = findVehicleById(sc.next());

                    if (v2 != null)
                        v2.completeMaintenance();
                    else
                        System.out.println("Vehicle Not Found.");

                    break;

                case 5:
                    inventory.showVehicles();
                    break;

                case 6:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                }

            }

        } else {

            System.out.println("Invalid Username or Password.");

        }

    }

    private static Vehicle findVehicleById(String id) {

        ArrayList<Vehicle> vehicles = inventory.getAllVehicles();

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVehicleid().equalsIgnoreCase(id))
                return vehicle;

        }

        return null;

    }

    public static void showCustomerMenu() {

        System.out.print("Enter Name : ");
        String name = sc.next();

        System.out.print("Mobile Number : ");
        long mobile = sc.nextLong();

        System.out.print("License Available (yes/no): ");
        boolean license = sc.next().equalsIgnoreCase("yes");

        Customer customer = new Customer(name, mobile, license);

        boolean flag = true;

        while (flag) {

            System.out.println("\n----- CUSTOMER MENU -----");
            System.out.println("1. Show Available Cars");
            System.out.println("2. Show Available Bikes");
            System.out.println("3. Show Available Buses");
            System.out.println("4. Rent Vehicle");
            System.out.println("5. Return All Vehicles");
            System.out.println("6. View Rented Vehicles");
            System.out.println("7. Exit");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                inventory.showAvailableVehicle(Car.class);
                break;

            case 2:
                inventory.showAvailableVehicle(Bike.class);
                break;

            case 3:
                inventory.showAvailableVehicle(Bus.class);
                break;

            case 4:

                System.out.print("Vehicle ID : ");
                Vehicle vehicle = findVehicleById(sc.next());

                if (vehicle != null) {

                    System.out.print("Days : ");
                    customer.rentedVehicle(vehicle, sc.nextInt());

                } else {

                    System.out.println("Vehicle Not Found.");

                }

                break;

            case 5:
                customer.returnAllVehicle();
                break;

            case 6:
                customer.viewRantedVehicles();
                break;

            case 7:
                flag = false;
                break;

            default:
                System.out.println("Invalid Choice");

            }

        }

    }

}