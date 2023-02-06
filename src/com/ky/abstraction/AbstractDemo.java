package com.ky.abstraction;

public class AbstractDemo {
    public static void main(String[] args) {

//        Circle circle=new Circle();
//        circle.width=20;
//        circle.height=25;
//        System.out.println(circle.width);
//        System.out.println(circle.height);
//        circle.draw();
//
//        Rectangle rect=new Rectangle();
//        rect.draw();
        Shape circle=new Circle();
        Shape rect=new Rectangle();

        circle.draw();
        rect.draw();

//        new Shape() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing some type of shape");
//            }
//        }.draw();

        //github.com/krishnayamphu/Java910
    }
}
