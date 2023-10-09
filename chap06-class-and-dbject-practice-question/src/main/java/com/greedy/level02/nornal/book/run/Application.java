package com.greedy.level02.nornal.book.run;

import com.greedy.level02.nornal.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {


        BookDTO dto = new BookDTO();
        System.out.println(dto.getInformation());

        BookDTO dto2 = new BookDTO("자바의정석", "도우출판", "남궁성");
        System.out.println(dto2.getInformation());

        BookDTO dto3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        System.out.println(dto3.getInformation());
    }

}
