package com.ky.oop;

public class Person {
    int maxSpeed;

    public void test() {
        System.out.println("test something");
    }

    public Person() {
        maxSpeed = 40;
        System.out.println("default constructor");
    }

    public Person(String name) {
        System.out.println("Person name: " + name);
    }

    public Person(String name, int age) {
        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.maxSpeed);

        Person p1 = new Person();
        System.out.println(p1.maxSpeed);

    }
}
