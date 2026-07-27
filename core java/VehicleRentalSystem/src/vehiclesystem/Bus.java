package vehiclesystem;

public class Bus extends Vehicle {

    private int noOfSeats;

    public Bus(String id, int rate, int no) {

        super(id, rate);
        noOfSeats = no;

    }

    public void displayInfo() {

        System.out.println("Bus ID : " + getVehicleid());
        System.out.println("Rate : " + getRentalRate());
        System.out.println("Seats : " + noOfSeats);

    }

}