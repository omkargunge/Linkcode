package studentmanagement;

import java.util.Scanner;
public class StudentMain {
	
	static Scanner sc=new Scanner(System.in);
	static Student students[]=new Student[50];
	static int count=0;
	
	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			
			System.out.println("----Student management system----");
			System.out.println("1.add student");
			System.out.println("2.ubdate student");
			System.out.println("3.delete student");
			System.out.println("4.display all student");
			System.out.println("5.exit");
			System.out.println("-----------------------------------");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1->insertStudent();
			case 2->ubdateStudent();
			case 3->deleteStudent();
			case 4->DisplayStudent();
			case 5->flag=false;
			default->System.out.println("invalid choice");
			
			}
			
		}
	}
	public static void insertStudent() {
		System.out.println("enter no of student:");
		int n=sc.nextInt();
		for(int i=count;i<count+n;i++) {
		System.out.println("enter detail for Student "+(i+1));
		System.out.println("enter roll no:");
		int roll=sc.nextInt();
		System.out.println("enter student name:");
		String name=sc.next();
		System.out.println("enter division:");
		char div=sc.next().charAt(0);
		System.out.println("enter marks:");
		double marks=sc.nextDouble();
		
		students[i]=new Student(roll,name,div,marks);
		}
		count+=n;
		
		System.out.println("student added succesfully");
	}
	 public static void DisplayStudent() {
		 System.out.println("--------student list---------");
		 System.out.println("------------------------------");
		 System.out.println("|\t Rollno \t | \t Name \t | \t Div \t | \t Marks \t |");
		 System.out.println("------------------------------");
		 
		 for(int i=0;i<count;i++) {
			 System.out.println("|\t"+students[i].rollno+"\t |\t"+students[i].name+" \t |\t"+students[i].div+"\t |\t"+students[i].marks+"\t |");
		 }
		 System.out.println("----------------------------------------------");
			
	    }
    public static void ubdateStudent() {
		  
	}
    public static void deleteStudent() {
    	
    	System.out.println("enter student rollno:");
    	int roll=sc.nextInt();
    	int indx=0;
    	
    	
    	for(int i=0;i<count;i++) {
    		if(students[i].rollno==roll) {
    			indx=i;
    			
    			for(int j=indx;j<count-1;j++) {
    				students[j]=students[j+1];
    			}
    			count--;
    			System.out.println("student delete successfully...");
    			return;
    		}
    	}
    	System.out.println("student not found");
	
    }  
   
}
