package com.gomddu.ch06;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }
    static int factorial(int n) {
        int result = 0;

        // -1 일경우 n이 1이 되지 않기 때문에 스택오버플로우 에러가 일어날 수 있다.
        if(n <= 0 || n > 12) return -1;

        if(n==1) {
            result = 1;
        } else {
            result = n * factorial(n-1);
        }
        return result;
    }
}
