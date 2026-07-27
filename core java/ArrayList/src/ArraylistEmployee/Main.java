package ArraylistEmployee;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> obj = new ArrayList<>();
	        boolean flag = true;

	        while (flag) {
	            System.out.println("---- Employee Management System ----");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Show Employee Details");
	            System.out.println("3. Exit");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1 -> {
	                    System.out.println("How many employee details do you want to add?");
	                    int no = sc.nextInt();

	                    for (int i = 1; i <= no; i++) {
	                        System.out.println("Enter employee id:");
	                        int id = sc.nextInt();

	                        System.out.println("Enter name:");
	                        String name = sc.next();

	                        System.out.println("Enter salary:");
	                        double sal = sc.nextDouble();

	                        obj.add(new Employee(id, name, sal));
	                    }
	                    System.out.println("Employee details added.");
	                }

	                case 2 -> {
	                    if (obj.isEmpty()) {
	                        System.out.println("No employee records found.");
	                    } else {
	                        for (Employee val : obj) {
	                            System.out.println("ID: " + val.getEmpid());
	                            System.out.println("Name: " + val.getEname());
	                            System.out.println("Salary: " + val.getSalary());
	                            System.out.println();
	                        }
	                    }
	                }

	                case 3 -> {
	                    flag = false;
	                    System.out.println("Exiting...");
	                }

	                default -> System.out.println("Invalid choice.");
	            }
	        }

	        sc.close();
	    }
	}

