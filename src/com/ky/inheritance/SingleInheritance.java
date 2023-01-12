package com.ky.inheritance;
/* private,public, protected */
class A{
    public int a; //default access-modifier
}
class B extends A{
    int b;
}
public class SingleInheritance {
    public static void main(String[] args) {
        B ob=new B();
        ob.b=10;
        ob.a=5;
        System.out.println(ob.b);
        System.out.println(ob.a);
    }
}
