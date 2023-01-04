package com.ky.oop;

public class Math {
    /**
     * 1) this.member
     * 2) this.method()
     * 3) this()
     */
    private int x;

    public Math(){
        System.out.println("Math instance created");
    }
    public Math(int n){
        this();
        System.out.println("=================");
        System.out.println("value of n: "+n);
    }

    public void setX(int x) {
        this.x = x;
    }
    public void test(){
        System.out.println("testing number");
    }
    public void show(){
       //test();
        this.test();
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.setX(10);
        System.out.println(math.x);
        math.show();

        Math m=new Math(100);

    }
}
