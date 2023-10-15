package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {

    private int grade;

    private int classroom;

    private String name;

    private int kor;

    private int eng;

    private int math;



    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getInformation(){
        return "학년 = " + this.grade +
                ", 반 = " + this.classroom +
                ", 이름 = " + this.name +
                ", 국어점수 = " + this.kor +
                ", 영어점수 = " + this.eng +
                ", 수학점수 = " + this.math +
                ", 평균점수는 = " + (double)(this.kor + this.eng + this.math)/3;
    }

}
