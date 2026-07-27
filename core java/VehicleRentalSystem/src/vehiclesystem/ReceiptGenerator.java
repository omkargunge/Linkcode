package vehiclesystem;

public class ReceiptGenerator {

    public static void generateReceipt(Vehicle vehicle) {

        System.out.println("-----------Receipt-----------");
        System.out.println("Vehicle ID : " + vehicle.getVehicleid());
        System.out.println("Rental Rate : " + vehicle.getRentalRate());
        System.out.println("Days : " + vehicle.getRentedDays());
        System.out.println("Total : " +
                vehicle.getRentalRate() * vehicle.getRentedDays());
        System.out.println("-----------------------------");

    }

}
