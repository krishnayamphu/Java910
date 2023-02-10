package com.ky.javaawt;

import java.awt.*;

public class FrameDemo {
    /**
     * ->import java.awt.*;
     * Frame()
     * Frame(String title)
     *
     * useful methods:
     * setVisible(boolean visible)
     * setSize(int w, int h)
     * setTitle(String title)
     * setLocation(int x, int y)
     * setLayout()
     * setResizable(boolean resize)
     * add(Component c)
     *
     */
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(300,200);
        f.setResizable(false);
        f.setVisible(true);
    }
}
