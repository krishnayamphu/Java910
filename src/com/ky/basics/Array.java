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

     accessing array element
     var[index]

     ***index start from 0.
     Array initialization:
     datatype[] var={value1, value2, value3,...}

     *
     */
    public static void main(String[] args) {
        int[] num=new int[3];
        num[0]=10;
        num[1]=20;
        num[2]=30;

        System.out.println("================");
        for(int i=0; i<3; i++){
            System.out.println("num["+i+"]="+num[i]);
        }
        System.out.println("===================");

        int[] age={12,15,16,19,17};
        for(int a:age){
            System.out.println(a);
        }

    }
}
