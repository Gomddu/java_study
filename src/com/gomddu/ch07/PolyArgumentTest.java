package com.gomddu.ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv3());
        b.buy(new Computer3());

        System.out.println("남은 잔액 : " + b.money);
        System.out.println("보너스 포인트 : " + b.bonusPoint);
    }
}
class Product {
    int price;
    int bonusPoint;
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv3 extends Product {
    Tv3() {
        // 조상 클래스의 생성자 Product(int price)를 호출한다.
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer3 extends Product {
    Computer3() {
        // 조상 클래스의 생성자 Product(int price)를 호출한다.
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy (Product p) {
        if(money < p.price) {
            System.out.println("오류 : 잔액부족");
            return;
        }
        money -= p.price; // money = money - p.price
        bonusPoint += p.bonusPoint;
        System.out.println("구매 성공 : "+p);
    }
}
