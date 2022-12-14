package com.ky.basics;

public class Array {
    /**
     Array Types:
     1. Single (one) dimensional array
     2. Multi (tow) dimensional array

     #1 single array:
     datatype[] var=new datatype[size];
     datatype var[]=new datatype[size];
     datatype []var=new datatype[size];

     assigning array value:
     var[index]=value

     ***index start from 0.
     *
     * geeksforgeeks
     */
    public static void main(String[] args) {
        int[] num=new int[3];
        num[0]=10;
        num[1]=20;
        num[2]=30;

        for(int i=0; i<3; i++)
        System.out.println(num[i]);
    }
}
