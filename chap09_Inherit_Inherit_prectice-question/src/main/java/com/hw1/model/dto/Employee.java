package com.hw1.model.dto;

public class Employee extends Person {

    private int salay;

    private String dept;

    public Employee() {
    }

    public Employee(String name, int age, double height, double weight, int salay, String dept) {
        super(age, height, weight);
        this.salay = salay;
        this.dept = dept;
        super.name = name;
    }

    public String getInformation() {
        return "name = " + super.getName() +
                ", age = " + super.getAge() +
                ", height = " + super.getHeight() +
                ", weight = " + super.getWeight() +
                ", salay = " + this.salay +
                ", dept = " + this.dept;
    }
}
