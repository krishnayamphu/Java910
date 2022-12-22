package com.ky.oop;

public class Test {
    /**
     class <ClassName>{
     //fields/members
     //method()
     }

     Creating an object/instance of a class:
     ClassName obj=new ClassName();

     Accessing members/methods of a Class by an object:
     obj.member;
     obj.method();
     */

    int a;

    public static void main(String[] args) {
       Test t=new Test();
       t.a=5;

       Test t1=new Test();
       t1.a=10;

        System.out.println(t.a);
        System.out.println(t1.a);
    }

}
