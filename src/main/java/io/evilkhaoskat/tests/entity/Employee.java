package io.evilkhaoskat.tests.entity;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double salary;
    private String jobTitle;

    public Employee(int id, String name, double salary, String jobTitle) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary="
                + salary + ", jobTitle=" + jobTitle + "]";
    }
}