package com.gomddu.ch03;

public class OperatorEx17 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000 + 0.5) / 1000f;
        System.out.println(shortPi);
    }
}
