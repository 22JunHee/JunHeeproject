package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;
import com.hw1.view.LibrayMenu;

import javax.xml.namespace.QName;

public class LibraryManager {
    private Member mem = null;

    private Book[] bList = new Book[5];
    public LibraryManager() {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }




    public void insertMember(Member mem){
        this.mem = mem;


    }

    public  Member myInfo(){

        System.out.println("마이페이지에 회원정보가 등록 되었습니다.");
        System.out.println(mem);
        return mem;
    }
    public Book[] selectAll(){


        return bList;
    }

    public Book[] searchBook(String keyword){

        Book[] bookresult = new Book[5];

        int count = 0;
        for (Book book : bList) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                bookresult[count] = book;
                count++;
            }
        }


        return bookresult;
    }

    public int rentBook(int index) {
        int result = 0;

        if (bList[index] == null) {
            result = 3;
        } else if (bList[index] instanceof CookBook) {

            result = 2;
        } else if (bList[index] instanceof AniBook) {
            AniBook book = (AniBook) bList[index];
            if (mem.getAge() >= book.getAccessAge()) {
                result = 2;
            } else {
                result = 1;
            }
        }

        if (result == 2) {
            bList[index] = null;
        }

        return result;
    }




    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getbList() {
        return bList;
    }

    public void setbList(Book[] bList) {
        this.bList = bList;
    }
}
