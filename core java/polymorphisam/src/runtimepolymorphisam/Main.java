package runtimepolymorphisam;

public class Main {

	
		public static void main(String[] args) {
//			
//			ElectricBike electricBike=new ElectricBike();
//			electricBike.charge();
//			electricBike.ride();
//			electricBike.start();
//			System.out.println("electricBike"); //referance
//			Bike bike=electricBike;  //upcasting
//			bike.ride();
//			bike.charge();
//           Vehicle.vehicle=bike;
//			vehicle.start();
//			vehicle.charge();
			
			
			Vehicle vehicle=new ElectricBike();
			vehicle.start();
			Bike bike=(Bike)vehicle; //downcasting
			bike.ride();
			bike.start();
			ElectricBike electricBike=(ElectricBike)bike;
			electricBike.start();
			electricBike.ride();
			electricBike.charge();
			
			
			
		}
		}
