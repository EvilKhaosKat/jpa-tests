package io.evilkhaoskat.tests;


import io.evilkhaoskat.tests.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static io.evilkhaoskat.tests.Constants.ID_1;
import static io.evilkhaoskat.tests.Constants.PERSISTENCE_UNIT_NAME;

public class UpdateEmployee {
    public static void main(String[] args) {
        EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityManager = entityFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class, ID_1);
        System.out.println("before update:" + employee);

        employee.setSalary(employee.getSalary() + 1.0);
        entityManager.getTransaction().commit();

        System.out.println("after update:" + employee);

        entityManager.close();
        entityFactory.close();
    }
}