package methodoverriding1;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp=new Employee(1,"soham",6000,"jm road");
		Object Obj=emp;
		System.out.println(emp);
		System.out.println(emp.toString());
//		System.out.println(emp.hashCode());
		
	}
}
