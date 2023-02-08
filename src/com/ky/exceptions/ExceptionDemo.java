package com.ky.exceptions;

import javax.swing.*;

public class ExceptionDemo {
    /**
     * Exception Handling:
     * 1. try catch block
     * 2. finally block
     * 3. throws
     * 4. throw
     *
     * try{
     *     //statements
     * }
     * catch(ExceptionType e){
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
