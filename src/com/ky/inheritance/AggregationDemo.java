package com.ky.inheritance;
class Address{
    String city,state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Student{
    int id;
    String name;
    Address address;
}
class Teacher{
    int id;
    String name;
    Address address;

    public Teacher(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=100;
        s1.name="Ram";
        s1.address=new Address("ktm","bagmati","nepal");

        Student s2=new Student();
        s2.id=101;
        s2.name="Hari";
        s2.address=new Address("lalitpur","bagmati","nepal");


        System.out.println("ID:"+s1.id);
        System.out.println("Name:" +s1.name);
        System.out.println("Address: "+s1.address.city+", "+s1.address.state+", "+s1.address.country);

        System.out.println("-------------------------------------");
        System.out.println("ID:"+s2.id);
        System.out.println("Name:" +s2.name);
        System.out.println("Address: "+s2.address.city+", "+s2.address.state+", "+s2.address.country);

        Address address=new Address("Pokhara","Gandki","Nepal");
        Teacher t1=new Teacher(1001,"Mohan",address);
        System.out.println("-------------------------------------");
        System.out.println("ID:"+t1.id);
        System.out.println("Name:" +t1.name);
        System.out.println("Address: "+t1.address.city+", "+t1.address.state+", "+t1.address.country);

    }

}
