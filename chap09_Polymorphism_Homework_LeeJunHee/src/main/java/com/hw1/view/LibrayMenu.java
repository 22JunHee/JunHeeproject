package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibrayMenu {
    Scanner sc = new Scanner(System.in);





        LibraryManager lm = new LibraryManager();
        int choice;
    public void mainMenu(){
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.next();
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.print("성별을 입력해주세요 : ");
        char gender = sc.next().charAt(0);
        Member member = new Member(name, age, gender);
        lm.insertMember(member);


        do{
            System.out.println("1. 마이페이지 : ");
            System.out.println("2. 도서 전체 조회 : ");
            System.out.println("3. 도서 검색 : ");
            System.out.println("4. 도서 대여하기 : ");
            System.out.println("0. 프로그램 종료 : ");
            System.out.print("메뉴를 선택하세요 : ");
            choice = sc.nextInt();


            switch (choice){
                case 1 :
                    System.out.println("마이페이지로 넘어 갑니다.");
                    lm.myInfo();
                    break;
                case 2 :
                    System.out.println("도서 전체 조회를 합니다.");
                    selectAll();
                    break;
                case 3 :
                    System.out.println("도서 검색을 합니다.");
                    searchBook();
                    break;
                case 4 :
                    System.out.println("도서 대여를 선택 하였습니다.");
                    rentBook();
                    break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
            }



        }while(choice != 0);

    }


    public void selectAll(){

        Book[] bList = lm.selectAll();
        System.out.println("==== 도서 전체 조회 ====");
        for (int i = 0; i < bList.length; i++) {
            System.out.print(i + "번 도서: " + bList[i].toString());
            if (bList[i] instanceof CookBook) {
                System.out.println(", coupon=" + ((CookBook) bList[i]).isCoupon());
            } else if (bList[i] instanceof AniBook) {
                System.out.println(", accessAge=" + ((AniBook) bList[i]).getAccessAge());
            }
        }
    }

    public void searchBook(){
        System.out.print("검색할 제목 키워드를 입력하세요 : ");
        String keyword = sc.next();
        Book[] searchList = lm.searchBook(keyword);

        if (searchList != null) {
            System.out.println("==== 도서 검색 결과 ====");
            for (int i = 0; i < searchList.length; i++) {
                if (searchList[i] != null) {
                    System.out.print(i + "번 도서: " + searchList[i].toString());

                    if (searchList[i] instanceof CookBook) {
                        CookBook book = (CookBook) searchList[i];
                        System.out.println(", coupon=" + book.isCoupon());
                    } else if (searchList[i] instanceof AniBook) {
                        AniBook book = (AniBook) searchList[i];
                        System.out.println(", accessAge=" + book.getAccessAge());
                    }
                }
            }
        } else {
            System.out.println("검색된 도서: 없음");
        }
    }

    public void rentBook(){
        System.out.print("대여할 도서 번호 선택: ");
        int index = sc.nextInt();
        sc.nextLine();

        int result = lm.rentBook(index);

        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 3:
                System.out.println("이미 대여된 도서입니다.");
                break;
        }
    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
