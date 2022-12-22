package com.ky.oop;

public class MethodDemo {
    /**
     * Method Declaration:
     * access-modifier return-type methodName(parameter_list)
     * {
     *     //body statements
     * }
     *
     * Invoking/Calling method:
     * obj.methodName(argument_list);
     */
    //step 1: method declaration
    public void test(){
        System.out.println("Testing Message.");
    }

    public static void main(String[] args) {
        MethodDemo m=new MethodDemo();

        //step 2: invoking method
        m.test();

        MyMath math=new MyMath();
        System.out.println("Value of PI:"+math.getPI());
    }
}
