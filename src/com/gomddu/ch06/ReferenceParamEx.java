package com.gomddu.ch06;

public class ReferenceParamEx {
    public static void main(String[] args) {
        // 참조형 매개변수는 변수의 값을 읽기만 할 수 있다.
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

    }
    static void change(Data d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}