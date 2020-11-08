package com.gomddu.ch03;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;  // 100만이 int타입이다. 연산의 결과로 저장되는 변수a 는 long타입이지만 연산 결과자체가 int이기때문에 최대값을 넘어 오버플로우가 발생했다.
        long b = 1_000_000 * 1_000_000L;

        System.out.println(a);
        System.out.println(b);
    }
}
