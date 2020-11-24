package com.gomddu.ch09;

public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        // fullName에서 '.'의 위치를 찾는다.
        int index = fullName.indexOf(".");

        String fileName = fullName.substring(0,index);

        String ext = fullName.substring(index + 1);

        System.out.println(fullName);
        System.out.println(fileName);
        System.out.println(ext);
    }
}
