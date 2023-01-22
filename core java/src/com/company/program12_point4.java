package com.company;
interface f1 {
    void m1();
    }
   interface f2{
    int m1();
   }
   interface f3{
    int m1(int a);
   }
  class Hai2 implements f1,f3{
    public void m1(){
        System.out.println("m1 in hai");
    }
    public int m1(int a){
        System.out.println("int m1 in hai");
        System.out.println(a);
        return a;
    }
}

public class program12_point4 {
    public static void main(String[] args) {
        f1 i1=new Hai2();
        f3 i3=new Hai2();
        i1.m1();
        i3.m1(11);


    }
}
