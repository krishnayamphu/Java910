package com.ky.p2;

import com.ky.p1.*;
import com.ky.p1.pp.Shape;

public class MyClassDemo {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="Ram";
        System.out.println("Name: "+e.name);

        Vehicle v=new Vehicle();

        Shape shape=new Shape();
        shape.draw();
    }
}
