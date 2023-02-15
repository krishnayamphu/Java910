package com.ky.javaawt.awtevents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame2 extends Frame {
    private Button btn;
    public Frame2(){
        initComponents();
    }
    public void initComponents() {
        btn=new Button("Click");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
            }
        });
        add(btn);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame2();
    }
}
