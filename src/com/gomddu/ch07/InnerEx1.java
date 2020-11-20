package com.gomddu.ch07;

public class InnerEx1 {
    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
    class InstanceInner {
        int iv = 100;
        final static int CONST = 100; // 원래 static변수를 사용할 수 없지만 final을 사용하면 상수이므로 사용가능
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }
    void myMethod() {
        class LocalInner {
            int iv = 300;
            final static int CONST = 300;
        }
    }
}