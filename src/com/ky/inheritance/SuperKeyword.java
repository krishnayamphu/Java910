package com.ky.inheritance;
class Vehicle{
    String model;
    public void run(){
        System.out.println("Vehicle running smoothly");
    }
}
class Car extends Vehicle{
    String brand;

    public void carInfo(String brand, String model){
        this.brand=brand;
        super.model=model;
        System.out.println("Brand:"+this.brand);
        System.out.println("Model:"+super.model);
    }

    public void start(){
        System.out.println("car is starting...");
        super.run(); //parent method
    }
}
public class SuperKeyword {
    /**
     * super keyword:
     * To access parent class member
     * super.member
     * To call/invoke parent class method
     * super.method()
     * To call parent class constructor
     * super()
     * super(params)
     */

    public static void main(String[] args) {
        Car car=new Car();
        car.carInfo("BMW", "b 650");
        car.start();
    }
}
