package vehiclesystem;

import java.util.ArrayList;

public class VehicleInventory {

    private ArrayList<Vehicle> vehicles;

    public VehicleInventory() {
        vehicles = new ArrayList<>();
    }

    // Add Vehicle
    public void addVehicle(Vehicle veh) {
        vehicles.add(veh);
        System.out.println("Vehicle Added Successfully.");
    }

    // Remove Vehicle
    public void removeVehicle(Vehicle veh) {
        vehicles.remove(veh);
        System.out.println("Vehicle Removed Successfully.");
    }

    // Return all vehicles
    public ArrayList<Vehicle> getAllVehicles() {
        return vehicles;
    }

    // Show all vehicles
    public void showVehicles() {

        System.out.println("---------------------------------------------------------");
        System.out.println("Vehicle ID\tRate\tAvailable");
        System.out.println("---------------------------------------------------------");

        for (Vehicle veh : vehicles) {

            System.out.println(
                    veh.getVehicleid() + "\t\t"
                    + veh.getRentalRate() + "\t"
                    + veh.isAvailable());

        }

        System.out.println("---------------------------------------------------------");

    }

    // Show available vehicles by type
    public void showAvailableVehicle(Class<?> cls) {

        System.out.println("-----------------------------------------");
        System.out.println("Available " + cls.getSimpleName() + "s");
        System.out.println("-----------------------------------------");

        for (Vehicle veh : vehicles) {

            if (cls.isInstance(veh) && veh.isAvailable()) {

                System.out.println(
                        veh.getVehicleid() + "   Rate : " + veh.getRentalRate());

            }

        }

    }

}