package com.ky.oop;
class Employee{
    /**
     * 1.static variable:
     * static type variable;
     * Classname.staticVariable
     *
     * 2. static method
     * public static type methodname(){
     *     //...
     * }
     * Classname.methodName()
     */
    String name; //non-static variable
    String address;
    int age;
    static String company="Abc"; //static variable
    static String companyPhone;

    //static method
    public static void getCompanyName(){
        System.out.println("Company name: "+company);
    }
    //non-static method
    public void test(){
        age=45;
        System.out.println("Age:"+age);
    }

    //static block
    static {
       companyPhone="123456789";
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.name="Ram";
        e1.address="Ktm";
        e1.age=40;


        e2.name="Hari";
        e2.address="Pokhara";
        e2.age=35;

        System.out.println("Name: "+e1.name);
        System.out.println("Address: "+e1.address);
        System.out.println("Age: "+e1.age);
        System.out.println("Company: "+Employee.company);
        System.out.println("----------------------------------");
        System.out.println("Name: "+e2.name);
        System.out.println("Address: "+e2.address);
        System.out.println("Age: "+e2.age);
        Employee.getCompanyName();

        System.out.println("Company contact: "+Employee.companyPhone);

    }
}
