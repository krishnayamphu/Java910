package com.ky.oop;

import java.util.Scanner;

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

        System.out.println("=======================");
        Scanner s=new Scanner(System.in);
//        System.out.print("Enter value of x:");
//        int x=s.nextInt();
//        System.out.print("Enter value of y:");
//        int y=s.nextInt();
//        math.sum(x,y);
        System.out.println("==========================");

        math.personInfo("Ram",40);
        math.personInfo("Hari",16);

        System.out.println("============================");
        System.out.println("Discount: "+math.getDiscountAmount(1500,10));
    }
}
