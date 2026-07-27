package hasrelationshipaggregtion;

public class Student {


	private int rollno;
    private String name;
    private int marks;
    private Laptop laptop;

    public Student(int roll, String name, int marks, Laptop hp) {
        this.rollno = roll;
        this.name = name;
        this.marks = marks;
        this.laptop = hp;
    }

    public void study() {
        laptop.start();
        System.out.println(this.name + ": coding start");
    }
}
