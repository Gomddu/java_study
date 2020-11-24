package com.gomddu.ch09;

public class StringEx1 {
    public static void main(String[] args) {
        // abc의 주소를 str1, str2에 저장 -> 주소가 다름
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));
        // == 는 주소 비교
        // .equals( ) 는 내용 비교

    }
}
