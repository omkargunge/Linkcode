package com.linkcode.hibernateDAOandDTO;


import java.util.Scanner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BookDAO {


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

		        boolean flag = true;

		        while (flag) {

		            System.out.println("-----Book Management-----");

		            System.out.println("1. add Book");

		            System.out.println("2. remove Book");

		            System.out.println("3. display Book");

		            System.out.println("4. update Book");

		            System.out.println("Enter your choice:");

		            int ch = sc.nextInt();

		            switch (ch) {

		            case 1 -> addBook();

		            case 2 -> removeBook();

		            case 3 -> displayBook();

		            case 4 -> updateBook();

		            default -> flag = false;
		            }
		        }
		    }


		    private static void updateBook() {

		        openConnection();

		        transaction.begin();

		        BookDTO book = findBookByID(); //harry

		        if (book != null) {

		            System.out.println("1. Book Name");

		            System.out.println("2. Book Author");

		            System.out.println("3. Book Price");

		            System.out.println("Enter your choice:");

		            int ch = sc.nextInt();

		            switch (ch) {

		            case 1 -> {

		                System.out.println("Enter new Book Name");

		                book.setBname(sc.next());
		            }

		            case 2 -> {

		                System.out.println("Enter new Book Author");

		                book.setAuthor(sc.next());
		            }

		            case 3 -> {

		                System.out.println("Enter new Book Price");

		                book.setPrice(sc.nextDouble());
		            }

		            }

		        } else {

		            System.out.println("book not Found!");
		        }
		        
		        manager.persist(book); //harry
		        transaction.commit();
		        closeConnection();
		    }


		    private static void removeBook() {

		        openConnection();

		        transaction.begin();

		        BookDTO book = findBookByID();

		        if (book != null) {

		            manager.remove(book);

		            System.out.println("book removed");

		        } else {

		            System.out.println("book not Found");
		        }

		        transaction.commit();

		        closeConnection();
		    }


		    private static BookDTO findBookByID() {

		        System.out.println("Enter book id");

		        int id = sc.nextInt();

		        BookDTO book = manager.find(BookDTO.class, id);

		        return book;
		    }


		    private static void displayBook() {

		        openConnection();

		        transaction.begin();

		        BookDTO book = findBookByID();

		        if (book != null) {

		            System.out.println("Book present");

		            System.out.println(
		                    book.getBname() + " - " + book.getAuthor());

		        } else {

		            System.out.println("book not Found!");
		        }

		        closeConnection();
		    }


		    private static void addBook() {

		        openConnection();

		        transaction.begin();

		        System.out.println("Enter book id");

		        int id = sc.nextInt();

		        System.out.println("enter book name:");

		        String bname = sc.next();

		        System.out.println("Enter book author");

		        String author = sc.next();

		        System.out.println("enter book price");

		        double price = sc.nextDouble();

		        BookDTO book =
		                new BookDTO(id, bname, author, price);

		        manager.persist(book);

		        transaction.commit();

		        closeConnection();
		    }
		

			
					
			
		
	}

 
