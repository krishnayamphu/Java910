package com.ky.oop;

public class MethodOverloading {
    public void hello(){
        System.out.println("Hello World");
    }
    public void hello(String name){
        System.out.println("Hello "+name);
    }
    public void hello(String name, int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.hello("Ram",15);
    }
}
