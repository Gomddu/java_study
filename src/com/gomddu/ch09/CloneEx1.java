package com.gomddu.ch09;

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3,5);
        // 공변 반환 타입
//        Point copy = (Point)original.clone();
        Point copy = original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y" + y;
    }

//    public Object clone() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//        } catch (CloneNotSupportedException e) {
//        }
//        return obj;
//    }
    public Point clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return (Point)obj;
    }
}
