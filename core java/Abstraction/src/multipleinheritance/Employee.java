package multipleinheritance;

class Employee implements coding,Trainer {
	
	public void coding() {
		System.out.println("Employee is coding");
	}
	
	public void work() {
		System.out.println("Employee is working");
	}
	@Override
	public void Teaching() {
		System.out.println("Employee is teaching");
		
	}
}
