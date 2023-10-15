package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Person;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];
        students[0] = new Student("홍길동",20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥",21, 187.2, 80.0, 2, "경영학과");
        students[2] = new Student("강개순",23, 167.2, 45.0, 4, "정보통신학과");

        for(Student student : students){
            System.out.println(student.getInformation());
        }


        System.out.println("==============================================");


        Employee[] employees = new Employee[10];
        int count = 0;
        while(true){
            System.out.print("사원의 이름을 입력해주세요 :");
            String name = sc.next();
            System.out.print("사원의 나이을 입력해주세요 : ");
            int age = sc.nextInt();
            System.out.print("사원의 신장을 입력해주세요 : ");
            double height = sc.nextDouble();
            System.out.print("사원의 몸무게를 입력해주세요 : ");
            double weight = sc.nextDouble();
            System.out.print("사원의 급여를 입력해주세요 : ");
            int salay = sc.nextInt();
            System.out.print("사원의 부서를 입력해주세요 : ");
            String dept = sc.next();
            employees[count] = new Employee(name, age, height, weight, salay, dept);
            count++;

            if (count < 10) {
                System.out.print("다시 등록을 원하시면 y를 눌러주세요 : ");
                String op = sc.next();
                if (!op.equals("y")) {
                    System.out.println("등록을 종료 합니다.");
                    break;
                }
            }
        }

        for(int i = 0; i < count; i++){
            System.out.println(employees[i].getInformation());
        }


    }
}
