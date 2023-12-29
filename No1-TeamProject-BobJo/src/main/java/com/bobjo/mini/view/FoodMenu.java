package com.bobjo.mini.view;

import java.util.Scanner;

public class FoodMenu {

    Scanner sc = new Scanner(System.in);
    public void mainmenu() {
        //do while 문 써서 메뉴 선택 후 다시돌아오기
        /*
         * 1.전체메뉴에서 랜덤 돌리기
         * 2.카테고리 별로 랜덤 돌리기
         * 3.입력한 메뉴중에서 고르기
         * 4.계산할 사람 고르기
         * 5. N빵
         * 6. 전체메뉴 보기
         * */
        int choice;
        do{
            System.out.println("1. 전체 메뉴에서 랜덤 돌리기 ");
            System.out.println("2. 나라별 음식 선택 후 랜덤 돌리기 ");
            System.out.println("3. 입력한 메뉴중에서 랜덤 돌리기 ");
            System.out.println("4. 계산할 사람 고르기 ");
            System.out.println("5. N빵 ");
            System.out.println("6. 전체 메뉴 보기 ");
            System.out.println("0. 프로그램 종료 ");
            System.out.print("메뉴를 선택하세요 : ");
            choice = sc.nextInt();


            switch (choice){
                case 1 :
                    System.out.println("전체 메뉴중 랜덤으로 돌린다!");
                    allRandom();
                    break;
                case 2 :
                    System.out.println("한식, 일식, 양식, 중식 중에 골라봐~");
                    selectAndRandom();
                    break;
                case 3 :
                    System.out.println("너가 원하는 음식들을 적어봐 내가 골라줄게!");
                    scanFoodRandom();
                    break;
                case 4 :
                    System.out.println("한명한테 몰빵 !!! 과연 누구!!!?");
                    onlyOnePay();
                    break;
                case 5 :
                    System.out.println("무조건 더치페이지~");
                    dutchPay();
                    break;
                case 6 :
                    System.out.println("전체 메뉴");
                    allMenu();
                    break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 똑바로 골라;;");
            }



        }while(choice != 0);

    }

    public void allRandom(){
        //전체 메뉴 중 랜덤으로 음식 하나 정해주는 코드 작성

    }

    public void selectAndRandom(){

        //한식 일식 양식 중식 중 사용자가 선택하면 그 안 음식 중 랜덤으로 정해주는 코드 작성

    }

    public void scanFoodRandom(){
        // 사용자가 음식을 입력하면 그 중 랜덤으로 정해주는 코드 작성

    }
    public void dutchPay(){
        // 먹은인원수 / 가격 코드

    }
    public void onlyOnePay(){
        //같이 먹을 인원 이름 입력 받은 후 한명 랜덤으로 뽑아주는 코드 작성

    }

    public void allMenu(){

        //초기화 해둔 전체 음식 메뉴 보여주는 코드 작성

    }
}
