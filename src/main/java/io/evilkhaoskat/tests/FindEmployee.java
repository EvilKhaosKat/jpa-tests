package io.evilkhaoskat.tests;

import io.evilkhaoskat.tests.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static io.evilkhaoskat.tests.Constants.PERSISTENCE_UNIT_NAME;

public class FindEmployee {
    public static void main(String[] args) {
        EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityManager = entityFactory.createEntityManager();

        Employee employee = entityManager.find(Employee.class, Constants.ID_1);

        System.out.println("employee:" + employee);
    }
}