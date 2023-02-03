package com.ky.p2;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person person=new Person();
//        person.name="";
//        System.out.println(person.name);
        person.setName("Ram"); //write member

        System.out.println(person.getName()); //read member

        Book book=new Book("Java Language","Abc",200);
        System.out.println("Book Title: "+book.getTitle());
        System.out.println("Book Author: "+book.getAuthor());
        System.out.println("Book Price: "+book.getPrice());

        Book book1=new Book();
        book1.setTitle("C Language");
        book1.setAuthor("Abc");
        book1.setPrice(150);

        System.out.println("Book Title: "+book1.getTitle());
        System.out.println("Book Author: "+book1.getAuthor());
        System.out.println("Book Price: "+book1.getPrice());


    }
}
