package com.ky.javaawt;

import java.awt.*;

public class PanelDemo extends Frame {
    /**
     * Panel()
     */
    private Panel p,pp;
    public PanelDemo(){
        initComponents();
    }
    public void initComponents(){
        p=new Panel();
        p.add(new Button("Button"));
        p.add(new Button("Button 2"));
        p.setBackground(Color.red);

        pp=new Panel();
        pp.add(new Button("Button"));
        pp.add(new Button("Button 2"));
        pp.setBackground(Color.green);

        add(p);
        add(pp);
        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PanelDemo();
    }

}
