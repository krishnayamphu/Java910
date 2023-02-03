package com.ky.inheritance;

class Abc{
    int a;
    public Abc(int a){
        this.a=a;
    }
}
class Xyz extends Abc{
    int x;
    public Xyz(int a,int x){
        super(a);
        this.x=x;
    }
    public void getValues(){
        System.out.println("Value of a: "+a);
        System.out.println("Value of x: "+x);
    }
}
public class SuperKeyword2 {
    public static void main(String[] args) {
        Xyz xyz=new Xyz(5,10);
        xyz.getValues();

    }
}
