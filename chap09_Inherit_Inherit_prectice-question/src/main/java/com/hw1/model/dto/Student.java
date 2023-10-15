package com.hw1.model.dto;

public class Student extends Person {

    private int grade;

    private String major;

    public Student() {
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super( age, height, weight);
        this.grade = grade;
        this.major = major;
        super.name = name;
    }

    public String getInformation() {
        return "name = " + super.getName() +
                ", age = " + super.getAge() +
                ", height = " + super.getHeight() +
                ", weight = " + super.getWeight() +
                ", grade = " + this.grade +
                ", major = " + this.major;
    }

}
