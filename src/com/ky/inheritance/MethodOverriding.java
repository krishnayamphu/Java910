package com.ky.inheritance;
class Mobile{
    public void test(){
        System.out.println("testing mobile");
    }
}
class Samsung extends Mobile{
    @Override
    public void test(){
        System.out.println("Testing samsung mobile");
    }
}
class Apple extends Mobile{
    @Override
    public void test(){
        System.out.println("Testing iphone mobile");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Mobile iphone=new Apple();
        Mobile samsung=new Samsung();

        iphone.test();
        samsung.test();
    }
}
