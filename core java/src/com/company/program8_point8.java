package com.company;
class HAI1{
    static HELLO1 h1=new HELLO1();
}
class HELLO1{
    HELLO1(){
        this(new HELLO1());
       // this(HAI1.h1);
        System.out.println("Default constructor in hello");
        System.out.println(this);
    }
    HELLO1(HELLO1 h1){
        System.out.println("1 param constructor in hello");
    }
    HELLO1(HELLO1 h1,HELLO1 h2){
        System.out.println("Hello1(hello h1,hello h2) in hello");
    }
}
public class program8_point8 {
    public static void main(String[] args) {
        HELLO1 h1=new HELLO1();
        System.out.println(h1);
    }
}
