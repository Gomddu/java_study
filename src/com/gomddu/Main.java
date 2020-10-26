package com.gomddu;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello, world");

        /* 1026 */
        int a = 0;
        int year = 1998;
        System.out.println(a);
        System.out.println(year);

        int year_1 = year + 23;
        System.out.println(year_1);

        // 값 변경
        int x = 2;
        int y = 3;
        int tmp = x;
        System.out.println(x);
        System.out.println(y);
        x = y;
        y = tmp;
        System.out.println(x);
        System.out.println(y);

        // 상수
        final int MAX = 10000;
        System.out.println(MAX);

        double ax = 1e1;
        System.out.println(ax);

        String name1 = "Lee";
        String name2 = new String("Kim");
        System.out.println(name1);
        System.out.println(name2);

        int age = 14;
        System.out.printf("age: %d%n",age);
        System.out.println(a);

        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b = %d%n", b);
        System.out.printf("s = %d%n", s);
        System.out.printf("c = %c , %d%n", c, (int)c);
        System.out.printf("finger = [%5d]%n", finger);
        System.out.printf("finger = [%-5d]%n", finger);
        System.out.printf("finger = [%05d]%n", finger);
        System.out.printf("big = %d%n", big);
        System.out.printf("hex = %#x%n", hex);
        System.out.printf("octnum = %o, %d%n",octNum, octNum);
        System.out.printf("hexnum = %x, %d%n",hexNum, hexNum);
        System.out.printf("binnum = %s, %d%n",Integer.toBinaryString(binNum), binNum);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // int num = Integer.parseInt(input);
        System.out.println(input);
    }
}
