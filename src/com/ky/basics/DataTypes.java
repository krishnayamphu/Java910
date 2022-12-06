package com.ky.basics;

public class DataTypes {
    /*
    Java Primitive Data Types:
    byte,short,int,long,double,float,char,boolean

    Integers: byte,short,int, long
    Floating: float,double
    Character: char
    Boolean: boolean

    signed: -,+ (byte=-128 to 127)
    unsigned: + (byte=256)

    Variables:
    type var;
    type var = value;

    byte b=8;
    short s=16;
    int i=32.5;
    long l=64L;

    float f=10.5f;
    double d=100.5

    char c='a'
    boolean bool=true;
     */

    public static void main(String[] args) {
        byte b=8; //Byte b
        short s=16; //Short
        int i=32; //Integer
        long l=64L; //Long

        float f=10.5f; //Float
        double d=200.5; //Double

        char c='a'; //1byte //Char c
        boolean bool=true; //Boolean b

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);

        /* Literals type
         String s;
        *  */
        String name="Java"; //string type
        System.out.println("=================");
        System.out.println(name);

        System.out.println(10+5);

        int x=10, y=20, sum=0;
        sum=x+y;
        System.out.println("Total sum: "+sum);

    }
}
