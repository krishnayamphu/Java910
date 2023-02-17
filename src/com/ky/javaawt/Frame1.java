package com.ky.javaawt;

import java.awt.*;

public class Frame1 extends Frame {
    private Button btn,btnclose;
    public Frame1(){
        initComponents();
    }
    public void initComponents(){
        btn=new Button("Button");
        btn.setBounds(20,50,100,30);
        add(btn);

        btnclose=new Button("Close");
        btnclose.setBounds(140,50,100,30);
        add(btnclose);

        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame1();
    }
}
