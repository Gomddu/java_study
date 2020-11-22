package com.gomddu.ch08;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("System TRUE");
            }
            System.out.println("ArithmethicException");
        } catch (Exception e) { // ArithmethicException 이 위에서 이미 발생하였기 때문에 더 상위 클래스인 Exceoption은 발생하지 않는다.
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
