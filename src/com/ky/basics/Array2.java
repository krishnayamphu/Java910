package com.ky.basics;

import java.util.Scanner;

public class Array2 {
    /**
     * 2. Multi (tow) dimensional array:
     datatype[row_size][col_size] var=new datatype[row][col];

     Array Init:
     datatype[row_size][col_size] var={value1, value2, value3, ...}


     */
    public static void main(String[] args) {
        int[][] num=new int[2][2];
        num[0][0]=10;
        num[0][1]=20;
        num[1][0]=30;
        num[1][1]=40;

//        System.out.println(num[1][1]);
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("====================");
        int x[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x:");
        x[0][0]=sc.nextInt();

        System.out.println("Value of x is: "+x[0][0]);
    }
}
