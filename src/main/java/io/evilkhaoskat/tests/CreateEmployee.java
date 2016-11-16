package io.evilkhaoskat.tests;

import io.evilkhaoskat.tests.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static io.evilkhaoskat.tests.Constants.PERSISTENCE_UNIT_NAME;

public class CreateEmployee {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entitymanager = factory.createEntityManager();

        entitymanager.getTransaction().begin();

        Employee employee = createEmployee();
        entitymanager.persist(employee);

        entitymanager.getTransaction().commit();

        entitymanager.close();
        factory.close();
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