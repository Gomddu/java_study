package com.gomddu.ch07;

final class SingleTonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }

}

final class Singleton {
    private static Singleton s = new Singleton();
    private Singleton() {
        //
    }
    public static Singleton getInstance() {
        if(s == null) {
            s = new Singleton();
        }
        return s;
    }
}