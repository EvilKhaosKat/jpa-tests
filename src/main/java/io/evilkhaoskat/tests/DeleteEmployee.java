package io.evilkhaoskat.tests;

import io.evilkhaoskat.tests.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static io.evilkhaoskat.tests.Constants.ID_1;

public class DeleteEmployee {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(Constants.PERSISTENCE_UNIT_NAME);
        EntityManager entitymanager = factory.createEntityManager();

        entitymanager.getTransaction().begin();

        Employee employee = entitymanager.find(Employee.class, ID_1);
        entitymanager.remove(employee);

        entitymanager.getTransaction().commit();

        entitymanager.close();
        factory.close();
    }
}