package com.ky.abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
//        Shape shape=new Shape();
        Circle circle=new Circle();
        circle.width=20;
        circle.height=25;
        System.out.println(circle.width);
        System.out.println(circle.height);
        circle.draw();

        Rectangle rect=new Rectangle();
        rect.draw();
    }
}
