package equalsmethod2;

public class Mobile {
	
	String brand;
	long imei;
	
	public Mobile(String brand,long imei) {
		this.brand=brand;
		this.imei=imei;
		
	}
	
	@Override
	
	public boolean equals(Object obj) {
		Mobile m=(Mobile)obj;
		
		if(this.imei==m.imei) {
			return true;
			
		}
		return false;
	}
}
