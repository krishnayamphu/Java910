package com.ky.basics;

import java.time.LocalDate;
import java.time.LocalTime;

public class Loop {
    /**
     Loop|Iteration:
     1. for loop
     2. while loop
     3. do while
     4. foreach loop

     #for loop:
     for(initialization; condition; ++/--){
      //...
     }

     s1:init
     s2:condition
     s3: statements
     s4:++/--

     s4->s2

     #while loop:
     while(condition){
      //...
     }

     #do while:
     do{
       //...
     }while(condition);

     #foreach loop
     for(ObjectType object:array_var){
      //...
     }

     #infinite loop
     for(;;){...}
     while(true){ ...}
     do{...}while(true);

     */
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){ //6
            System.out.println("Hello World.");
        }

        System.out.println("=====================");
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        System.out.println("==================");
        int j=1;
        do{
            System.out.println("hello "+j);
            j++;
        }while (j<=5);
        System.out.println("===================");
        String colors[]={"red","green","blue","yellow"};
        for(String c:colors){
            System.out.println(c);
        }

        System.out.println("==================");
        while (true){
           // System.out.println(LocalTime.now().toString() );
        }
    }
}
