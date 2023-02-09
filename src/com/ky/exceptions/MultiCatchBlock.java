package com.ky.exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try{
            int x=10;
            int num[]={100,200,300};
            System.out.println("Output:"+ (x/5));  //2
            System.out.println(num[5]);  //100
        }catch (ArithmeticException e){
            System.err.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}
