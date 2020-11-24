package com.gomddu.ch09;

import java.util.StringJoiner;

public class StringEx4 {
    public static void main(String[] args) {
        // Join() 메서드 활용하여 구분자를 넣어서 결합
        String animals = "dog,cat,bear";
        System.out.println(animals);

        String[] arr = animals.split(",");
        System.out.println(arr);

        String str = String.join("-",arr);
        System.out.println(str);

        // StringJoiner 클래스를 사용해서 문자열을 결합할 수 있다.
        StringJoiner sj = new StringJoiner(",","[","]");
        String[] strArr = {"aaa","bbb","ccc"};
        for(String s : strArr) {
            sj.add(s.toUpperCase());
        }
        System.out.println(sj.toString());

        // 기본형 -> 문자열 : valueOf
        // 문자열 -> 기본형 : parseInt, parseLong .. -> valueOf 로 통일 (오버라이딩) // 참조형을 반환하기때문에 약간은 다름 거의비슷함
        int i = 100;
        String str1 = i + "";
        String str2 = String.valueOf(i);

    }
}
