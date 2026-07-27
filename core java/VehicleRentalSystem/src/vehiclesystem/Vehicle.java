package vehiclesystem;

public class Vehicle {

    private String vehicleid;
    private int rentalRate;
    private boolean isAvailable;
    private int rentedDays;
    private boolean underMaintenace;

    public Vehicle(String vehicleid, int rentalRate) {
        this.vehicleid = vehicleid;
        this.rentalRate = rentalRate;
        this.isAvailable = true;
        this.rentedDays = 0;
        this.underMaintenace = false;
    }

    public void rent(Customer customer, int no) {

        if (isAvailable && !underMaintenace) {

            double totalBill = no * rentalRate;

            if (PaymentGateway.processpayment(totalBill)) {

                isAvailable = false;
                rentedDays = no;

                EmailService.sendBookingconfirmation(this, customer);

            } else {
                System.out.println("Payment Failed.");
            }

        } else {
            System.out.println("Vehicle Not Available.");
        }

    }

    public void returnVehicle() {

        isAvailable = true;
        rentedDays = 0;

        System.out.println("Vehicle Returned Successfully.");

    }

    public void sendForMaintenance() {

        if (isAvailable) {

            isAvailable = false;
            underMaintenace = true;

            System.out.println("Vehicle Sent For Maintenance.");

        } else {
            System.out.println("Vehicle is already rented or under maintenance.");
        }

    }

    public void completeMaintenance() {

        underMaintenace = false;
        isAvailable = true;

        System.out.println("Maintenance Completed.");

    }

    public String getVehicleid() {
        return vehicleid;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getRentedDays() {
        return rentedDays;
    }

    public boolean isUnderMaintenace() {
        return underMaintenace;
    }

}