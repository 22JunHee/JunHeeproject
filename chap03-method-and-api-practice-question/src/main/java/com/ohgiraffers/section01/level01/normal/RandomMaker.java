package com.ohgiraffers.section01.level01.normal;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */
    public static void rockPaperScissors(){
        int random = (int) (Math.random()*3);

        if (random == 0){
            System.out.println("가위");
        }
        String result = (random == 0)? "가위" : (random >0 )? "바위" : "보";
        System.out.println("값 : " +result);
        }


        public static void tosscoin(){
        int random2 = (int)(Math.random()*2);
            if (random2 == 0) {
                System.out.println("앞");
            }
        String result2 = (random2 == 0)? "앞" : "뒤";
            System.out.println("동전던지기 결과 : " + result2);


        }



    }





