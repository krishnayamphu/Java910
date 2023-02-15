package com.ky.javaawt.awtevents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame {
    private TextField txtn1,txtn2,txtre;
    private Button btnp,btnm,btnc;
    private double n1,n2;
    public Calculator(){
        intiComponents();
    }
    public void intiComponents(){
        add(new Label("N1:"));
        txtn1=new TextField(20);
        add(txtn1);

        add(new Label("N2:"));
        txtn2=new TextField(20);
        add(txtn2);

        add(new Label("Re:"));
        txtre=new TextField(20);
        add(txtre);

        btnp=new Button(" + ");
        btnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                double sum=n1+n2;
                txtre.setText(String.valueOf(sum));
            }
        });
        add(btnp);
        btnm=new Button(" - ");
        add(btnm);
        btnc=new Button(" c ");
        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtn1.setText("");
                txtn2.setText("");
                txtre.setText("");
            }
        });
        add(btnc);

        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
