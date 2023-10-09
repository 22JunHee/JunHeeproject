package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사원번호를 입력해주세요 : ");
        int number = sc.nextInt();
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.next();
        System.out.print("부서를 입력해주세요 : ");
        String dept = sc.next();
        System.out.print("직급 입력해주세요 : ");
        String job = sc.next();
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.print("성별을 입력해주세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("월급을 입력해주세요 : ");
        int salay = sc.nextInt();
        System.out.print("보너스 포인트를 입력해주세요 : ");
        double bonusPoint = sc.nextDouble();
        System.out.print("핸드폰 번호를 입력해주세요 : ");
        String phone = sc.next();
        System.out.print("주소를 입력해주세요 : ");
        String address = sc.next();

        EmployeeDTO dto = new EmployeeDTO(number, name, dept, job, age, gender, salay, bonusPoint, phone, address);


        System.out.println(dto.getInformation());
    }
}
