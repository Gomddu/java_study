package com.gomddu.ch07;
import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}
