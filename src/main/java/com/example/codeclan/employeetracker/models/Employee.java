package com.example.codeclan.employeetracker.models;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Column
    private String name;
    @Column
    private int age;
    @Column(name="emp_num")
    private int empNum;
    @Column
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Employee(String name, int age, int empNum, String email) {
        this.name = name;
        this.age = age;
        this.empNum = empNum;
        this.email = email;
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
