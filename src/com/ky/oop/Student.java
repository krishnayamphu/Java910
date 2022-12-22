package com.ky.oop;

public class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Hari";
        s1.age=25;

        Student s2=new Student();
        s2.name="Ram";
        s2.age=24;

        System.out.println("Student Name: "+s1.name);
        System.out.println("Student Age: "+s1.age);
        System.out.println("========================");
        System.out.println("Student Name: "+s2.name);
        System.out.println("Student Age: "+s2.age);
    }
}
