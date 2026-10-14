package com.linkcode.hibernateManyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDepartmentDAO {

    private static EntityManagerFactory factory;
    private static EntityManager manager;
    private static EntityTransaction transaction;

    public static void openConnection() {
        factory = Persistence.createEntityManagerFactory("hibernate6");
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

        try {
            openConnection();
            transaction.begin();

            // Department already exists or create new
            DepartmentDTO dept1 = manager.find(DepartmentDTO.class, 1);

            if (dept1 == null) {
                dept1 = new DepartmentDTO(
                    1, "IT", "Pune", "Rahul"
                );
                manager.persist(dept1);
            }

            DepartmentDTO dept2 = manager.find(DepartmentDTO.class, 2);

            if (dept2 == null) {
                dept2 = new DepartmentDTO(
                    2, "HR", "Mumbai", "Priya"
                );
                manager.persist(dept2);
            }

            // Create employees only if they do not already exist
            if (manager.find(EmployeeDTO.class, 101) == null) {
                EmployeeDTO emp1 = new EmployeeDTO(
                    101, "Amit", "Java Developer", 35000, dept1
                );
                manager.persist(emp1);
            }

            if (manager.find(EmployeeDTO.class, 102) == null) {
                EmployeeDTO emp2 = new EmployeeDTO(
                    102, "Sumit", "Tester", 30000, dept1
                );
                manager.persist(emp2);
            }

            if (manager.find(EmployeeDTO.class, 103) == null) {
                EmployeeDTO emp3 = new EmployeeDTO(
                    103, "Neha", "HR Executive", 32000, dept2
                );
                manager.persist(emp3);
            }

            transaction.commit();

            System.out.println("Data inserted successfully!");

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();

        } finally {
            closeConnection();
        }
    }
}