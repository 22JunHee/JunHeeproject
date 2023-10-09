package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        MemberDTO dto = new MemberDTO();

        System.out.println("필드 초기값 확인....");
        System.out.println(dto.getInformation());

        MemberDTO dto2 = new MemberDTO( );

        System.out.println("필드 값 변경.....");
        dto2.setId("user01");
        dto2.setPwd("pass01");
        dto2.setName("홍길동");
        dto2.setAge(20);
        dto2.setGender('M');
        dto2.setPhone("010-1234-5678");
        dto2.setEmail("hong123@greedy");

        System.out.println("변경된 필드값 확인....");
        System.out.println(dto2.getInformation());
    }
}
