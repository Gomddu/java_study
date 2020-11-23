package com.gomddu.ch09;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1 == p2) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }
        if(p1.equals(p2)) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }
    }
}
class Person {
    long id;
    public boolean equals(Object obj) {
        // 주소 값이 아니라 멤버변수 id의 값으로 비교
        if(obj instanceof Person) {
            return id == ((Person)obj).id;
        } else {
            return false;
        }
    }
    Person(long id) {
        this.id = id;
    }
}
