package com.gomddu.ch03;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a != 0 || ++b != 0 = %b%n", a != 0 || ++b != 0); // ++b로 b의 값이 1증가해야 맞지만 or논리연산자로 인해 우항은 연산되지 않았음.
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a == 0 && ++b != 0 = %b%n", a == 0 && ++b != 0); // 마찬가지로 a == 0이 false이기 때문에 우항이 연산되지 않음.
        System.out.printf("a = %d, b = %d%n", a, b);

    }
}
