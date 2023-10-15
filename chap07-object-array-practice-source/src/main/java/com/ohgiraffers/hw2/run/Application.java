package com.ohgiraffers.hw2.run;


import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO[] studentDTO = new StudentDTO[10];
        int count = 0;
        while (true){


            System.out.print("학생의 학년을 입력해주세요 : ");
            int grade = sc.nextInt();
            System.out.print("학생의 반을 입력해주세요 : ");
            int classroom = sc.nextInt();
            System.out.print("학생의 이름을 입력해주세요 : ");
            String name = sc.next();
            System.out.print("학생의 국어점수를 입력해주세요 : ");
            int kor = sc.nextInt();
            System.out.print("학생의 영어점수를 입력해주세요 : ");
            int eng = sc.nextInt();
            System.out.print("학생의 수학점수를 입력해주세요 : ");
            int math = sc.nextInt();
            studentDTO[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count ++;

            if (count < 10) {
                System.out.print("다시 등록을 원하시면 y를 눌러주세요 : ");
                String op = sc.next();
                if (!op.equals("y")) {
                    System.out.println("등록을 종료 합니다.");
                    break;
                }
            }
        }
        for(int i = 0; i < count; i++)
            System.out.println(studentDTO[i].getInformation());
    }
}
