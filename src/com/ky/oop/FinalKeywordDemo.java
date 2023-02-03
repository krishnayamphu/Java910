package com.ky.oop;
//final class A{}
class A{
    public final void test(){
        System.out.println("test something");
    }
}
class B extends A{
//    @Override
//    public void test(){
//        System.out.println("test something inside B method");
//    }
}
public class FinalKeywordDemo {
    /**
     * 1. final variable: it makes variable to constant type (value can not be changed)
     * final variablename=value;
     *
     * 2. final method: final method can not be override
     *
     * 3. final class: this is the end class (no more extends/inherit)
     */
    final int maxSpeed=200;

    public static void main(String[] args) {
        FinalKeywordDemo ob=new FinalKeywordDemo();
        System.out.println(ob.maxSpeed);

        B b=new B();
        b.test();

    }
}
