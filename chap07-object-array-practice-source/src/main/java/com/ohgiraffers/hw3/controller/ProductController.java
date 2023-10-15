package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {



    public static int count;


    ProductDTO[] pro = new ProductDTO[10];
    Scanner sc = new Scanner(System.in);


    public ProductController() {
    }

    public void mainMenu(){

        int choice;
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택하세요 : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
                    break;
            }
        } while (choice != 9);
    }



    public void productInput(){
        if (count < 10) {
            System.out.println("========= 새로운 제품 정보를 입력하세요. =============");


            System.out.print("제품 번호 : ");
            int pId = sc.nextInt();
            System.out.print("제품명 : ");
            String pName = sc.next();
            System.out.print("제품 가격 : ");
            int price = sc.nextInt();
            System.out.print("제품 세금 : ");
            double tax = sc.nextDouble();





            pro[count] = new ProductDTO(pId, pName, price, tax);

            count++;

            System.out.println("새로운 제품이 추가되었습니다.");
        } else {
            System.out.println("더 이상 제품을 추가할 수 없습니다. (최대 10개)");
        }

    }

    public void productPrint(){
        System.out.println("===== 제품 목록 =====");
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].getInformation());
        }
    }
}
