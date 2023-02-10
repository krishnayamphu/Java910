package com.ky.exceptions;

public class ThrowDemo {
    /**
     * type methodName() throws Exception{
     *     //statements
     *     throw new ExceptionType();
     * }
     */
    public void checkVoterAge(int age) throws Exception{
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else {
            throw new Exception("Age not valid");
        }
    }
    public static void main(String[] args) {

        ThrowDemo td=new ThrowDemo();
        try{
            td.checkVoterAge(17);
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Age must be above 18");
        }
    }
}
