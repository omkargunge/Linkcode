package com.linkcode.hibernateManyToMany;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CustomerProductDAO {
	
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
	   
	   //unidirection 
	   
//	  Customer cust1=new Customer(1,"ram",234567l,"pune");
//	  Customer cust2=new Customer(2,"mahesh",784546l,"mumbai");
//	  Customer cust3=new Customer(3,"geeta",555555l,"kohlapur");
//	  Customer cust4=new Customer(4,"seeta",784551l,"karanatak");
//	  
//	  manager.persist(cust1);
//	  manager.persist(cust2);
//	  manager.persist(cust3);
//	  manager.persist(cust4);
//	  
//	  Product product1=new Product(101,"tshirt",10,400,Arrays.asList(cust1,cust3));
//	  Product product2=new Product(102,"lapotop",9,60000,Arrays.asList(cust2,cust4));
//	  Product product3=new Product(103,"shoes",50,3000,Arrays.asList(cust1,cust2,cust3));//many customer buy many product
//	  manager.persist(product1);
//	  manager.persist(product2);
//	  manager.persist(product3);
//	  
	   
	   
	   // bidirection
	   
	   Customer cust1=new Customer(1,"ram",234567l,"pune",null);
	   Customer cust2=new Customer(2,"mahesh",784546l,"mumbai",null);
	   Customer cust3=new Customer(3,"geeta",555555l,"kohlapur",null);
	   Customer cust4=new Customer(4,"seeta",784551l,"karanatak",null);
	   
	   
	   Product product1=new Product(101,"tshirt",10,400,null);
	   Product product2=new Product(102,"lapotop",9,60000,null);
	   Product product3=new Product(103,"shoes",50,3000,null);
	   
	   List<Customer>custgrp1=Arrays.asList(cust1,cust3);
	   List<Customer>custgrp2=Arrays.asList(cust2,cust4);
	   
	   List<Product>productgrp1=Arrays.asList(product1,product3);
	   List<Product>productgrp2=Arrays.asList(product2,product3);
	   
	   cust1.setProduct(productgrp1); cust2.setProduct(productgrp2);
	   cust3.setProduct(productgrp1); cust4.setProduct(productgrp2);
	  product1.setCustomer(custgrp2);product2.setCustomer(custgrp2);
	  product3.setCustomer(custgrp2);
	  
	  manager.persist(cust1); manager.persist(cust2);
	  manager.persist(cust3); manager.persist(cust4);
	  manager.persist(product1); manager.persist(product2);
	  manager.persist(product3);



	   
	   
	   
	   

	   
	  transaction.commit();
	   
	   
	  closeConnection();
	  
	  
}


}
