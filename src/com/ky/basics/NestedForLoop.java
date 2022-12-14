package com.ky.basics;

public class NestedForLoop {
    /**
        Nested For Loop:
     for(initialization; condition; ++/--){
         for(initialization; condition; ++/--){
           //...
         }
     //..
     }

     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     ------------------
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5
     ----------------
     *
     * *
     * * *
     * * * *
     * * * * *
     ------------------
     5 4 3 2 1
     5 4 3 2
     5 4 3
     5 4
     5
     -------------------
     5 5 5 5 5
     4 4 4 4
     3 3 3
     2 2
     1
     */
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){//6
            //4<=3
            for(int j=1; j<=i; j++){
                System.out.print("@ ");
            }
            System.out.println("");
        }
    }
}
