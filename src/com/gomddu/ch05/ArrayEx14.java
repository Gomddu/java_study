package com.gomddu.ch05;

public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i=0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + "): " + ch);
        }

        String tmp = src.substring(1,5);
        System.out.println(tmp);

        if(src.equals("ABCDE")) {
            System.out.println("같다.");
        }

        // String을 char[]로 변환
        char[] chArr = src.toCharArray();
        System.out.println(chArr);
    }
}
