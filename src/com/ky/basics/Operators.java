package com.ky.basics;

public class Operators {
    /*
    1. Arithmetic Operators: +,-,*,/,++,--,%(modulus)
    2. Assignment Operators: =,+=,-=,*=,/=,%=
    3. Relational/Comparison Operators: >,<,>=,<=,==,!=
    4. Logical Operators: && (AND), || (OR), ! (NOT)
    5. Unary Operators: ? :

    && => AND
    & =>ampersand

    Truth Table (&&):
    A     B     A.B
    true  true   true  //1x1=1
    true  false  false //1x0=0
    false true   false //0x1=0
    false false  false //0x0=0

    Truth Table (||):
    A     B     A+B
    true  true   true  //1+1=1
    true  false  true //1+0=1
    false true   false //0+1=1
    false false  false //0+0=0

    Truth Table (!):
    A     A'
    true  false
    false true

    expression?value_if_true:value_if_false


     */
    public static void main(String[] args) {
        int a=5;
        a++;  // a=a+1
        System.out.println(a);
        System.out.println(21%5);  //1

        int x=10;
        x*=5; //x=x*5
        System.out.println(x);

        System.out.println(5>4); //true
        System.out.println(5>=6); //false
        int b=5, c=6,d=5;
        System.out.println(b>=c); //false
        System.out.println(c<=d); //false
        System.out.println(b==d); //true
        System.out.println("------------------------");
        System.out.println(b>c && b>d); //false
        System.out.println(c>b && c>d);  //true
        System.out.println("------------------");
        System.out.println(c>b ||d>c); //true

        System.out.println("---------------------");
        System.out.println(c>d?"c is greater":"d is greater");
    }
}
