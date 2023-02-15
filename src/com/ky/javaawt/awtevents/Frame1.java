package com.ky.javaawt.awtevents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends Frame implements ActionListener {
    private Button btn,btn1;
    private Label lbltext;
    private TextField txtbox;

    public Frame1() {
        initComponents();
    }

    public void initComponents() {
        lbltext = new Label();
        add(lbltext);
        txtbox = new TextField(20);
        add(txtbox);
        btn = new Button("Click");
        btn.addActionListener(this);
        add(btn);

        btn1=new Button("Exit");
        btn1.addActionListener(this);
        add(btn1);

        setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            lbltext.setText("Hello World");
            txtbox.setText("Hello World");
            System.out.println("Hello world");
        }

        if(e.getSource()==btn1){
            System.exit(0);
        }
    }
}
