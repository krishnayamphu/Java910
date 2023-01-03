package com.ky.oop;

public class Shape {
    static int x;
    static int y;

    //static blockK
    static {
        System.out.println("static block invoked");
        x=5;
        y=6;
    }
    public static void getX(){
        System.out.println("x axis: "+x);
    }
    public static void getY(){
        System.out.println("y axis: "+y);
    }
    public static void main(String[] args) {
        System.out.println("main method invoked");
        getX();
        getY();
    }
}
