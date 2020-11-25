package com.gomddu.ch09;
import static java.lang.Math.*;
import static java.lang.System.*;
public class MathEx1 {
    public static void main(String[] args) {
        double val = 90.7552;
        out.println("round(" + val + ")=" + round(val));

        val += 100;
        out.println("round(" + val + ")=" + round(val));

        out.println("round(" + val + ")/100 =" + round(val)/100);
        out.println("round(" + val + ")/100.0 =" + round(val)/100.0);
        out.println();

        // ceil : 올림
        // floor : 내림
        // round : 반올림
    }
}
