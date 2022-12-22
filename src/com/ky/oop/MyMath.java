package com.ky.oop;

public class MyMath {
    //method with return type
    public double getPI(){
        return 3.14;
    }

    //method with parameters
    public void sum(int x, int y){
        int total=x+y;
        System.out.println("Total sum: "+total);
    }

    public void  personInfo(String name, int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    //method with return type and parameters
    public double getDiscountAmount(double price, double disPercentage){
        double discount=price*disPercentage/100;
        return discount;
    }


}
