package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO {


    private int empNo;

    private String empName;

    private String dept;

    private String job;

    private int age;

    private char gender;

    private int salay;

    private double bounsPoint;

    private String phone;

    private String address;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int empNo, String empName, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }


    public EmployeeDTO(int empNo, String empName, String dept, String job, int age, char gender, int salay, double bounsPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salay = salay;
        this.bounsPoint = bounsPoint;
        this.phone = phone;
        this.address = address;
    }

    public String getInformation(){

        return "empNo = " + this.empNo +
                ", empName = " + this.empName +
                ", dept = " + this.dept +
                ", job = " + this.job +
                ", age = " + this.age +
                ", gender = " + this.gender +
                ", salay = " + this.salay +
                ", bounsPoint = " + this.bounsPoint +
                ", phone = " + this.phone +
                ", address = " + this.address;
    }

    public int getSalay() {
        return salay;
    }

    public double getBounsPoint() {
        return bounsPoint;
    }

    public String getEmpName() {
        return empName;
    }
}
