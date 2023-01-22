package com.company;
class Book{
    int price;
    String name;
    Book(String name){
        this.name=name;
    }
}

public class practice3 {
    public static void main(String[] args) {
        Book b1=new Book(" Indian polity");
        Book b2=new Book("core java");
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b1.toString()==b2.toString());
        System.out.println(b1.toString().equals(b2.toString()));
    }
}
