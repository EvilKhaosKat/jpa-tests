package io.evilkhaoskat.tests;

import io.evilkhaoskat.tests.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static io.evilkhaoskat.tests.Constants.PERSISTENCE_UNIT_NAME;

public class FindEmployee {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entitymanager = factory.createEntityManager();

        Employee employee = entitymanager.find(Employee.class, Constants.ID_1);

        System.out.println("employee:" + employee);
    }
}