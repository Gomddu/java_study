package com.gomddu.ch09;

public class StringEx3 {
    public static void main(String[] args) {
        // new int[10] -> 4byte(int의 크기) * 10 = 40byte : 10은 길이, 40byte는 크기라고 지칭한다. // 보통 길이만 신경씀
        // 숫자를 문자로 만들때, 배열을 초기화할때 빈 문자열 사용
        char[] cArr = new char[0];
        // char[] cArr = {};
        String s = new String(cArr);
        // String s = new String("");

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
