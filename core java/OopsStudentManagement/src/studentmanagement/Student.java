package studentmanagement;

public class Student {
	int rollno;
	String name;
	char div;
	double marks;
	
	Student(int roll,String name,char div,double marks){
		this.rollno=roll;
		this.name=name;
		this.div=div;
		this.marks=marks;
	}
	
	public void study() {
		System.out.println("doing code");
	}
	
	public void play() {
		System.out.println("playing cricket");
	}
}
    