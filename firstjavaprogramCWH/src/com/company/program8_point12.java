package com.company;
class wow{
    static int s;
    static final int c=30;
    static final int b;
    static {
        System.out.println("SB in hello");
        b=10;
    }
}

public class program8_point12 {
    public static void main(String[] args) {
        System.out.println("in main");
        System.out.println(wow.s);
    }
}
