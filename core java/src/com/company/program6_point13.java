package com.company;
class Hai{
    void m1(){
        System.out.println("m1 in hai");
    }
}
class Hello4{
    static Hai hai=new Hai();
    static Hai gethai(){
        System.out.println("gethai() in hello");
        return hai;
    }
}

public class program6_point13 {
    public static void main(String[] args) {
        Hai hai =Hello4.gethai();
        Hai hai1=Hello4.gethai();
        System.out.println(hai);
        System.out.println(hai1);
    }
}
