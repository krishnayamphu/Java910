package com.ky.basics;

public class ConditionalStatements {
    /**
    1. // ->single line comment
    2. /* ... * / -> multiline/ block comment

     conditional statements:
     ->if(condition){ //... }
     ->if(condition){ //...} else{ //...}
     ->if(condition){ //...} else if(condition){ //...} ... else{ //...}
     ->switch case statements

     if(condition) { // true statements }

     %=50;
             Division:
     %>=80 ->Distinction
     %>=60 ->First
     %>=45 ->Second
     %>=35 ->Third
     %<35  ->Fail

     #Nested If
     if(condition){
        if(condition){
            //statements
            ...
        }
     }

     #switch case
     switch(expression){
     case 1:
     //...
     break;
     case n:
     //...
     break;
     default:
     //...
     break;
     }
     */
    public static void main(String[] args) {
        double temp=4;
        if(temp>=35){
            System.out.println("High Temperature");
        }

        int a=5, b=6;
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }

        double marks=60;
        if(marks>=35){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        String username="admin";
        String password="a";
        if(username.equals("admin") && password.equals("a123")){
            System.out.println("Welcome Admin");
        }else{
            System.out.println("Invalid username or password");
        }

        double p=79;
        if(p>=80){
            System.out.println("Distinction");
        }else if(p>=60){
            System.out.println("First");
        }else if(p>=45){
            System.out.println("Second");
        }else if(p>=35){
            System.out.println("Third");
        }else{
            System.out.println("Fail");
        }

        System.out.println("====================");

        double math=60;
        double science=4;
        if(math>=35 && science>=35){
            System.out.println("Result: Pass");
            double per= (math+science)/2;
            if(per>=80){
                System.out.println("Distinction");
            }else if(per>=60){
                System.out.println("First");
            }else if(per>=45){
                System.out.println("Second");
            }else{
                System.out.println("Third");
            }
        }else {
            System.out.println("Fail");
        }

        System.out.println("========================");
        int day=5;
        switch (day){
            case 1:
                System.out.println("sun"); break;
            case 2:
                System.out.println("mon"); break;
            case 3:
                System.out.println("tue"); break;
            case 4:
                System.out.println("wed"); break;
            case 5:
                System.out.println("thu"); break;
            case 6:
                System.out.println("fri"); break;
            case 7:
                System.out.println("sat"); break;
            default:
                System.out.println("invalid day no."); break;
        }

        double n1=5,n2=10;
        char op='-';
        switch (op){
            case '+':
                System.out.println(n1+n2); break;
            case '-':
                System.out.println(n1-n2); break;
            case '*':
                System.out.println(n1*2); break;
            case  '/':
                System.out.println(n1/n2); break;
            default:
                System.out.println("Invalid operator");
        }
    }

}
