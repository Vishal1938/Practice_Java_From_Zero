package com.company;
class vis{
    int a;
    int b;
    static int c;

    vis(int a1,int b1){
        System.out.println("i am a 1 param constuctor of vishal");
        a=a1;
        b=b1;
    }
}

public class program_construcor {
    public static void main(String[] args) {
        vis v1= new vis(11,22);
        System.out.println(v1.a);
        System.out.println(v1.b);
        System.out.println(v1.c);

    }
}

