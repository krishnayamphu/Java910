package com.ky.exceptions;

public class FinallyBlock {
    /**
     * try{
     *     //statements
     * }catch(Exception e){
     *     //error message
     * }finally{
     *     //statements
     * }
     */

    public static void main(String[] args) {
        try{
            int n=10;
            System.out.println(n/0);
        }catch (ArithmeticException e){
            System.err.println(e);
        }finally {
            System.out.println("Hello Java World");
        }

    }
}
