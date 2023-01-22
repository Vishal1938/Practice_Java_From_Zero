package com.company;
class hello2{
    int a =10;
    int b=20;
   static int c=30;
   void m1(){
       System.out.println("m1 in hello......instance method");
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
   }
   static void m2(){
       System.out.println("m2 in hello.....static method");
     //  System.out.println(a);
       System.out.println(c);
   }
}

public class vishal_methode {
    public static void main(String[] args) {

        hello2 h2=new hello2();
        h2.m1();
        h2.m2();
        hello2 h1=null;
        h1.m2();
        hello2.m2();
    }
}
