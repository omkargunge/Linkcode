package com.linkcode.hibernateDAOandDTOOneTOMany;

import java.util.Arrays;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TeamPlayerDAO {

	 private static EntityManagerFactory factory;
     private static EntityManager manager;
     private static EntityTransaction transaction;
     
     public static void openConnection() {
    	 
    	 factory=Persistence.createEntityManagerFactory("hibernate6");
    	 manager = factory.createEntityManager();
    	 transaction = manager.getTransaction();
     }

public static void closeConnection() {

    if (transaction != null && transaction.isActive()) {
        transaction.rollback();
    }

    if (manager != null && manager.isOpen()) {
        manager.close();
    }

    if (factory != null && factory.isOpen()) {
        factory.close();
    }
}

     public static void main(String[] args) {
		
    	 openConnection();
    	 transaction.begin();
    	 
    	PlayerDTO player1=new PlayerDTO(18,"virat kohali",true,"batsman");
    	PlayerDTO player2=new PlayerDTO(99,"Jasprit bumras",false,"bowler");
    	PlayerDTO player3=new PlayerDTO(100,"ABD",false,"batsman");
    	PlayerDTO player4=new PlayerDTO(45,"rohit shrma",true,"batsman");
    	PlayerDTO player5=new PlayerDTO(90,"yuvi chal",false,"bowler");
    	manager.persist(player1);manager.persist(player2);
    	manager.persist(player3);manager.persist(player4);
    	manager.persist(player5);
    	
    	
    	TeamDTO team1=new TeamDTO(1,"Mumbai Indians","Mumbai","neeta Ambani",Arrays.asList(player2,player4));// aslist - multiple objectgheto and list chya formate madhe return karato
    	TeamDTO team2=new TeamDTO(2,"RCB","Banglore","Ananya Birla",Arrays.asList(player1,player3,player5));
    	manager.persist(team1);
    	manager.persist(team2);
    	
    	transaction.commit();
    	closeConnection();
    	
	}
}
