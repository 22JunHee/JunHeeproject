package com.greedy.level03.hard.emp.model.dto;

public class EmployeeDTO {

    private int number;

    private String name;

    private String dept;

    private String job;

    private int age;

    private char gender;

    private int salay;

    private double bonusPoint;

    private String phone;

    private String address;

    public EmployeeDTO(int number, String name, String dept, String job, int age, char gender, int salay, double bonusPoint, String phone, String address) {
        this.number = number;
        this.name = name;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salay = salay;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalay(int salay) {
        this.salay = salay;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getSalay() {
        return salay;
    }

    public double getBonusPoint() {
        return bonusPoint;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation(){
        return "number = " + this.number +
                ", name = " + this.name +
                ", dept = " + this.dept +
                ", job = " + this.job +
                ", age = " + this.age +
                ", gender = " + this.gender +
                ", salay = " + this.salay +
                ", bonusPoint = " + this.bonusPoint +
                ", phone = " + this.phone +
                ", addess = " + this.address;
    }
}
