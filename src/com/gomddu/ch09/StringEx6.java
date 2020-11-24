package com.gomddu.ch09;

public class StringEx6 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);

        double dVal = 200.0;
        String strVal2 = " " + dVal + " ";

        double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2.trim());
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2.trim());

        System.out.println(String.join("",strVal,"+",strVal2.trim(),"=") + sum);
        System.out.println(strVal + "+" + strVal2.trim() + "=" + sum2);
    }
}
