package com.gomddu.ch07;

import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer5 b = new Buyer5();
        Tv5 tv = new Tv5();
        Computer5 com = new Computer5();
        Audio5 audio5 = new Audio5();

        b.buy5(tv);
        b.buy5(com);
        b.buy5(audio5);
        b.summary5();
        System.out.println();
        b.refund5(com);
        b.summary5();
    }
}
class Product5 {
    int price;
    int bonusPoint;
    Product5(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
    Product5() {
        price = 0;
        bonusPoint = 0;
    }
}
class Tv5 extends Product5 {
    Tv5() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer5 extends Product5 {
    Computer5() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Audio5 extends Product5 {
    Audio5() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}
class Buyer5 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();
    int i = 0;

    void buy5(Product5 p) {
        if(money < p.price) {
            System.out.println("오류 : 잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "를 구입");
    }
    void refund5(Product5 p) {
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }
    void summary5() {
        int sum = 0;
        String itemList = "";
        if(item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        for(int i = 0; i<item.size(); i++) {
            Product5 p = (Product5)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

