package com.linkcode.hibernateasJPQL;

// hibernate che annotation imp aahe
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class StudentManagement {
	
	private static EntityManagerFactory factory;
    private static EntityManager manager;
    private static EntityTransaction transaction;
    static Scanner sc = new Scanner(System.in);

   public static void openConnection() {

       factory = Persistence.createEntityManagerFactory("hibernate6");

       manager = factory.createEntityManager();

       transaction = manager.getTransaction();
   }

   public static void closeConnection() {

       if(factory!=null) {
       	factory.close();
       }
       if(manager!=null) {
       	manager.close();
       }
       if(transaction.isActive()) {
       	transaction.rollback();
       }
   }
	public static void main(String[] args) {
		openConnection();
		transaction.begin();
		
		// insert -ya sathi manager chipersist method use
		//ubdate--find persist u
		//delete -find and remove mthod use
		//select(display) -find 
		
		
		//select * from std;-resultlist
		//insert ubdate delete -executeUbdate
		//jpql query kali 
		String jpql="from student"; // jpqlchi query -selet * na lihane,class name lihane table name ivaji,condition madhe variable name taane
		Query query=manager.createQuery(jpql);
		List<student> students=query.getResultList();
		//[s100,s200]
		students.forEach(std->System.out.println(std)) ;
		
		
		

		    // INSERT
		    student s = new student();
		    s.setName("Omkar");
		    s.setMarks(88.99);

		    manager.persist(s);

		    // UPDATE
		    String jpql1 = "update student set marks = 95 where rollno = 1";

		    Query query1 = manager.createQuery(jpql1);

		    int update = query1.executeUpdate();

		    System.out.println(update + " Record Updated");

		    // DELETE
		    String jpql2 = "delete from student where rollno = 2";

		    Query query2 = manager.createQuery(jpql2);

		    int delete = query2.executeUpdate();

		    System.out.println(delete + " Record Deleted");

		    transaction.commit();

		    closeConnection();
		}
		
	
		
	}


