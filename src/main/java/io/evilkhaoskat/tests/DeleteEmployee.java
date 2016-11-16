package io.evilkhaoskat.tests;

import io.evilkhaoskat.tests.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static io.evilkhaoskat.tests.Constants.ID_1;

public class DeleteEmployee {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(Constants.PERSISTENCE_UNIT_NAME);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class, ID_1);
        entityManager.remove(employee);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}