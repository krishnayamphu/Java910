package com.ky.javaawt;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame(){
        setSize(300,250);
        setVisible(true);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        add(new Button("Button"));
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
