package com.company;
class Excp{
    int m1(int a){
        System.out.println("m1 in hello");
        try {
            int x =10/a;
            return 10;
        }
        catch (Exception e){
            e.printStackTrace();
            return 20;
        }
        finally {
            System.out.println("finally ");
            return 30;
        }
    }
}

public class EXAMPLE_327 {
    public static void main(String[] args) {
        Excp e1 = new Excp();
        int i= e1.m1(0);
        System.out.println(i);
    }
}
