package com.company;
interface Tee1{
    void m1();
    default char driver(){
        System.out.println("Driver");
        return '@';
    }
}
interface Tee2{
    int m2();
    static int m1(){
        System.out.println("staic");
        return 10;
    }
}
interface Tee3{
    String m3();
    }

class Tee implements Tee1,Tee2,Tee3{
    public void m1(){
        System.out.println("m1 in tee");
    }
    public int m2(){
        System.out.println("m2 in Tee");
        return 10;
    }
    public String m3(){
        System.out.println("m3 in Tee");
        return "vishal";
    }
}

public class Example12_point {
    public static void main(String[] args) {
        Tee1 t1= null;
        t1= new Tee();
        t1.m1();
        Tee t2= new Tee();
        t2.m1();
        t2.m2();
        t2.m3();
        int i=Tee2.m1();
        System.out.println(i);
    }
}
