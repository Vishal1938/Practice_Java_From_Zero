package com.ExceptionHandling;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Workbook_6 {
    public static void main(String[] args){
        try {
            new A().show();
        }catch (Exception e){
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.getCause());
            System.out.println();
            e.printStackTrace();
            try {
                e.printStackTrace(new PrintStream(new FileOutputStream("ex.txt")));
            }catch (Exception e1){
                e.printStackTrace();
            }
        }
    }
}
class A{
    void show(){
        System.out.println("--show in A class--");
        new B().m1();
    }
}
class B{
    void m1(){
        System.out.println("--m1 in B class--");
        new c().m2();
    }
}
class c{
    void m2(){
        System.out.println("--m2 in C class--");
        new D().m3();
    }
}
class D{
    void m3(){
        System.out.println("--m3 in D class--");
        int x=10/0;
    }
}