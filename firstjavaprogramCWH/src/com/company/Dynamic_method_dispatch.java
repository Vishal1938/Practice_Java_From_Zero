package com.company;
class Myphone {
    public void showtime(){
        System.out.println("this is 8 am");
    }
    public void on(){
        System.out.println("Turning on the phone");
    }
}
class Mysmartphone extends Myphone {
    public void music(){
        System.out.println("Turning on the music...");
    }
    public void on(){
        System.out.println("turning on the smartphone");
    }
}
class A{
    public void meth1(){
        System.out.println(" I am method 1 of class A");
    }
}
class B extends A{
    public void meth2(){
        System.out.println(" i am method 2 of class B");
    }
    public void meth1(){
        System.out.println(" I am method 1 of class B");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        Myphone m= new Mysmartphone();
        m.on();
        m.showtime();
        A a= new A();
        a.meth1();
        B b= new B();
        b.meth1();

    }
}
