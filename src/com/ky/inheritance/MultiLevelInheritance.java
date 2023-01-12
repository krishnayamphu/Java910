package com.ky.inheritance;
/* multilevel inheritance */
class Animal{
    public String color;
}
class Dog extends Animal{
    public String name;
}
class Puppy extends Dog{
    public int weight;
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy puppy=new Puppy();
        puppy.name="Sandy";
        puppy.color="Brown";
        puppy.weight=4;

        System.out.println(puppy.name);
        System.out.println(puppy.color);
        System.out.println(puppy.weight);
    }
}
