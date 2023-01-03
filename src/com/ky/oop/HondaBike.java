package com.ky.oop;

public class HondaBike {
    /**
     * Access static member:
     * Classname.member
     *
     * Access static method:
     * Classname.method()
     */
    int maxSpeed;
    String model;
    static String brand="Honda"; //static member/field

    //static method
    public static void run(){
        System.out.println("Bike is running smoothly.");
    }

    public static void main(String[] args) {
        HondaBike honda1=new HondaBike();
        honda1.maxSpeed=120;
        honda1.model="honda xblade";
        System.out.println("Model:"+honda1.model);
        System.out.println("Speed:"+honda1.maxSpeed);
        System.out.println("Brand: "+HondaBike.brand);
        HondaBike.run();

        HondaBike honda2=new HondaBike();
        honda2.maxSpeed=150;
        honda2.model="honda cbr 250";
        System.out.println("Model:"+honda2.model);
        System.out.println("Speed:"+honda2.maxSpeed);
        System.out.println("Brand: "+HondaBike.brand);
        HondaBike.run();

    }
}
