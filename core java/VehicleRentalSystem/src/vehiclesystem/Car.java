package vehiclesystem;

public class Car extends Vehicle {

    private int noOfSeats;

    public Car(String id, int rate, int no) {

        super(id, rate);
        noOfSeats = no;

    }

    public void displayInfo() {

        System.out.println("Car ID : " + getVehicleid());
        System.out.println("Rate : " + getRentalRate());
        System.out.println("Seats : " + noOfSeats);

    }

}