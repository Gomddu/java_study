package com.gomddu.ch07;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer4 b = new Buyer4();
        b.buy4(new Tv4());
        b.buy4(new Computer4());
        b.buy4(new Audio4());
        b.summary4();
    }
}
class Product4 {
    int price;
    int bonusPoint;
    Product4(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
    Product4() {}
}
class Tv4 extends Product4 {
    Tv4() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer4 extends Product4 {
    Computer4() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Audio4 extends Product4 {
    Audio4() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}
class Buyer4 {
    int money = 1000;
    int bonusPoint = 0;
    Product4[] item = new Product4[10];
    int i = 0;

    void buy4(Product4 p) {
        if(money < p.price) {
            System.out.println("오류 : 잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "를 구입");
    }
    void summary4() {
        int sum = 0;
        String itemList = "";
        for(int i = 0; i<item.length; i++) {
            if(item[i] == null) {
                break;
            }
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

