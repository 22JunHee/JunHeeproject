package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    private BookManager bm;

    public BookMenu(){


    }
    int choice;
    public void mainMenu(){


        do{

        System.out.println("1. 새 도서 추가 ");
        System.out.println("2. 도서정보 정렬 후 출력 ");
        System.out.println("3. 도서 삭제 ");
        System.out.println("4. 도서 검색출력 ");
        System.out.println("5. 전체 출력 ");
        System.out.println("6. 끝내기 ");
        System.out.print("메뉴를 선택하세요 : ");
        int choice = sc.nextInt();

        switch (choice){
            case 1 :
                System.out.println("새 도서를 추가를 선택하셨습니다.");
                inputBook();
                break;
            case 2 :
                System.out.println("도서정보 정렬 후 출력을 선택하셨습니다.");
                bm.printBookList(selectSortedBook());
                break;
            case 3 :
                System.out.println("도서 삭제를 선택하셨습니다 ");
                inputBookNo();
                break;
            case 4 :
                System.out.println("도서 검색을 선택하셨습니다");
                inputBookTitle();
                break;
            case 5 :
                System.out.println("전체 출력을 선택하셨습니다.");
                bm.displayAll();
            case 6 :
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("잘못 입력하셨습니다 다시 선택해주세요.");
                break;
        }



        }while(choice != 6);


















    }

    public BookDTO inputBook(){


        return null;
    }

    public String inputBookNo(){
        System.out.print("삭제할 도서 번호를 입력하세요:");
        int index = sc.nextInt();
        bm.deleteBook(index);


        return null;
    }

    public String inputBookTitle(){

        return null;
    }

    public List<BookDTO> selectSortedBook(){

        return null;
    }

}
