import java.util.Scanner;

public class Employee {
    // Instance variables
    private int empId;
    private String empName;
    private float empSalary;
    private float hra;
    private float ta;
    private float ma;
    private float pf;
    private float grossSalary;

    // Method to create employee record (input)
    public void create() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        empName = sc.next();

        System.out.print("Enter Basic Salary: ");
        empSalary = sc.nextFloat();

        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();

        System.out.print("Enter TA: ");
        ta = sc.nextFloat();

        System.out.print("Enter MA: ");
        ma = sc.nextFloat();

        System.out.print("Enter PF: ");
        pf = sc.nextFloat();
    }

    // Method to calculate gross salary
    public void calculateGrossSalary() {
        grossSalary = empSalary + hra + ta + ma - pf;
    }

    // Method to display employee details
    public void display() {
        System.out.println("\n=========== Employee Details ===========");
        System.out.println("Employee ID       : " + empId);
        System.out.println("Employee Name     : " + empName);
        System.out.println("Basic Salary      : " + empSalary);
        System.out.println("HRA               : " + hra);
        System.out.println("TA                : " + ta);
        System.out.println("MA                : " + ma);
        System.out.println("PF                : " + pf);
        System.out.println("----------------------------------------");
        System.out.println("Gross Salary      : " + grossSalary);
        System.out.println("========================================");
    }

    // Main method to run the program
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.create();
        emp.calculateGrossSalary();
        emp.display();
    }
}
