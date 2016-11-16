package io.evilkhaoskat.tests.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    private String name;
    private double salary;
    private String jobTitle;

    public Employee(BigInteger id, String name, double salary, String jobTitle) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public Employee() {
        super();
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
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