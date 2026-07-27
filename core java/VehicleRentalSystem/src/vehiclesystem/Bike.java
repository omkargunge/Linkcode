package vehiclesystem;

public class Bike extends Vehicle {

    private boolean helmetAvailable;

    public Bike(String id, int rate, boolean ha) {
        super(id, rate);
        helmetAvailable = ha;
    }

    public void displayInfo() {

        System.out.println("Bike ID : " + getVehicleid());
        System.out.println("Rate : " + getRentalRate());
        System.out.println("Helmet : " + helmetAvailable);

    }

}