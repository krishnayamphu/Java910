package com.ky.abstraction;

public class InterfaceDemo {
    public static void main(String[] args) {
        new Sound(){
            @Override
            public void playSound(String song) {
                System.out.println("Playing "+song+" sound");
            }
        }.playSound("abc");
    }
}
