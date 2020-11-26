package com.gomddu.ch09;

public class WrapperEx3 {
    public static void main(String[] args) {
        int i = 10;

        // 기본형을 참조형으로 형변환(형변환 생략가능);
        Integer intg = (Integer) i; // Integer.valueOf(i);
        Object obj = (Object) i;

        Long lng = 100L;

        int i2 = intg + 10;
        long l = intg + lng;

        Integer intg2 = new Integer(20 );
        int i3 = (int)intg2;

        Integer intg3 = intg + i3;

        System.out.println(i);
        System.out.println(intg);
        System.out.println(obj);
        System.out.println(lng);
        System.out.println(i2);
        System.out.println(l);
        System.out.println(intg2);
        System.out.println(i3);
        System.out.println(intg3);

    }
}
