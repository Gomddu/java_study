package com.gomddu.ch04;

import java.util.Scanner;

public class FlowEx05 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력하세요.> ");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다. %n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 95) {
                opt = '+';
            } else {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 85) {
                opt = '+';
            } else {
                opt = '-';
            }
        } else {
            grade = 'c';
        }
        System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
    }
}
