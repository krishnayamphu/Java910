package com.ky.inheritance;
class Shape{
    public void draw(String shape){
        System.out.println("Drawing "+shape);
    }
}
class Rectangle extends Shape{}
class Circle extends Shape{}

/*
Object

 */

public class HierarchicalInheritance {
    public static void main(String[] args) {
//        Rectangle rectangle=new Rectangle();
//        Circle circle=new Circle();
        Shape rectangle=new Rectangle();
        Shape circle=new Circle();

        rectangle.draw("Rectangle shape");
        circle.draw("Circle shape");
    }
}
