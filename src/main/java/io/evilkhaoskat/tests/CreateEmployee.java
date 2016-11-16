package io.evilkhaoskat.tests;

import io.evilkhaoskat.tests.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static io.evilkhaoskat.tests.Constants.PERSISTENCE_UNIT_NAME;

public class CreateEmployee {
    public static void main(String[] args) {
        EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityManager = entityFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee employee = createEmployee();
        entityManager.persist(employee);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityFactory.close();
    }

    private static Employee createEmployee() {
        Employee employee = new Employee();

        employee.setId(Constants.ID_1);
        employee.setName("Meow");
        employee.setSalary(9001);
        employee.setJobTitle("Cat");

        return employee;
    }
}