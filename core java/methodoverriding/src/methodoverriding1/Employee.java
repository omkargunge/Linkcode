package methodoverriding1;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String add;
	
	public Employee(int i,String string,int j,String string2) {
		this.id=i;
		this.name=string;
		this.salary=j;
		this.add=string2;
	}
	
	public String toString() {
		return this.add;
	}
	
}
