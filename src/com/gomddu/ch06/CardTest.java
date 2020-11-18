package com.gomddu.ch06;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("C1 : " + c1.kind + c1.number + c1.width + c1.height);
        System.out.println("C1 : " + c2.kind + c2.number + c2.width + c2.height);

        c1.width = 50; // Card.width 가 더 좋다 - 클래스변수는 클래스이름.클래스변수로 사용
        c1.height = 80;

        System.out.println("C1 : " + c1.kind + c1.number + c1.width + c1.height);
        System.out.println("C1 : " + c2.kind + c2.number + c2.width + c2.height);

    }
}

class Card {
    // 인스턴스 변수 - 언제든지 변한다. 카드놀이의 무늬와 숫자
    String kind;
    int number;
    // 클래스 변수 - 모든 인스턴스들이 공통적으로 가진다. - 카드놀이의 폭과 넓이, 클래스변수만 변경하면 모든 인스턴스(카드)들의 값이 변함
    static int width = 100;
    static int height = 250;
        }
