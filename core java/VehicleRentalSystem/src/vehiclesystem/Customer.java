package vehiclesystem;
import java.util.ArrayList;
public class Customer {
		
	String name;
	long mobile;
	private boolean isLicAvailable;
	private ArrayList<Vehicle> rentedVehicles;
	public Customer(String name, long mobile, boolean isla) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.isLicAvailable = isla;
		this.rentedVehicles=new ArrayList<Vehicle>();
	}
	
	public void rentedVehicle(Vehicle vehicle,int no) {
		if(vehicle.isAvailable()) {
			vehicle.rent(this,no);
			rentedVehicles.add(vehicle);
			System.out.println("Vehicle Rented!");
		}else {
			System.out.println("Vehicle is not available!");
		}
		
	}
	
	public void returnAllVehicle() {

	    for (Vehicle vehicle : rentedVehicles) {
	        vehicle.returnVehicle();
	    }

	    rentedVehicles.clear();

	    System.out.println("All Vehicles Returned.");

	}
	public String getName() {
	    return name;
	}
	public void viewRantedVehicles() {
		System.out.println("-----Rented Vehicle List-----");
		rentedVehicles.forEach(val->System.out.println("Vehicle ID " +val.getVehicleid()));
		System.out.println("-------------------------------");
		
		
	}

	
	
	
}
