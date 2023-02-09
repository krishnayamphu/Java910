package com.ky.exceptions;

import javax.swing.*;

public class ExceptionDemo {
    /**
     * Exception Handling:
     * 1. try catch block
     * 2. finally block
     * 3. throws keyword
     * 4. throw keyword
     *
     * try{
     *     //statements
     * }
     * catch(ExceptionType e){
     *     //error message
     * }
     *
     * try{
     *     //statements
     * }catch(ExceptionType e){
     *     //error message
     * }catch(ExceptionType e){
     *     //error message
     *  }
     *try{
     *     //statements
     * }catch(ExceptionType1 | ExceptionType2 e){
     *     //error message
     * }
     */
    public static void main(String[] args) {
        int x=20;
        System.out.println(x);
        try{
            System.out.println(x/0);
        }catch (ArithmeticException e){
            System.err.println("Number can't / by zero.");
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
           // System.err.println(e);
        }

    }
}
