package com.company;
class practice{
    {
        System.out.println("instance block ");
    }
    static {
        System.out.println("Static block");
    }
     void m1(){
        System.out.println("m1 in hello");
    }
}

public class program6_oractice {
    public static void main(String[] args) {
        practice p1= new practice();
        p1.m1();

    }
}
