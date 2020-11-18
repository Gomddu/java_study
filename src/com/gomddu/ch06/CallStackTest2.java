package com.gomddu.ch06;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음.");
        firstMethod();
        System.out.println("main(String[] args)이 종료되었음.");
    }
    static void firstMethod() {
        System.out.println("firstMethod() args이 시작되었음.");
        secondMethod();
        System.out.println("firstMethod() args이 종료되었음.");


    }
    static void secondMethod() {
        System.out.println("secondMethod() 이 시작되었음.");
        System.out.println("secondMethod() 이 종료되었음.");

    }
}
