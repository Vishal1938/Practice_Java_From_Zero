package com.company;

public class workbook4_of4 {
    public static void main(String[] args) {
        try{
            new Aciloc().show();
        }catch (Exception e){
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.getCause());
            System.out.println();
            e.printStackTrace();
        }
    }
}
class Aciloc{
    void show(){
        System.out.println("only for acidity");
        new Brufen().m1();
    }
}
class Brufen{
    void m1(){
        System.out.println("it's a painkiller");
        new Citrizin().m2();
    }
}
class Citrizin{
    void m2(){
        System.out.println("for allergy");
        new Dizine().m3();
    }
}
class Dizine{
        void m3(){
            System.out.println("--m3 in D class---");
            int x=10/0;
    }
}