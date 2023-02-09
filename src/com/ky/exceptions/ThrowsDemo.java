package com.ky.exceptions;

public class ThrowsDemo {
    /**
     *  public void methodName() throws Exception1,Exception2,...ExceptionN{
     *      //statements
     *  }
     */

    public void calc(int n) throws ArithmeticException{
        System.out.println(n/0);
    }
    public void test() throws ArrayIndexOutOfBoundsException,ArithmeticException{
        int num[]={10,20};
        System.out.println(num[0]);
        calc(0);
    }

    public static void main(String[] args) {
        ThrowsDemo td=new ThrowsDemo();
        try {
            td.test();
        }catch (ArithmeticException e){
            System.err.println(e);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex);
        }

    }
}
