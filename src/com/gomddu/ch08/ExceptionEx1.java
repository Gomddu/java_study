package com.gomddu.ch08;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
            try {} catch (Exception x) {
            }
        }
        try {

        } catch (Exception e) {

        }

    }
}