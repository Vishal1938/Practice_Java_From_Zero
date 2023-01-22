package com.company;
class operator{
    int a=10;
    int b=11;
    int c=a+++b++;
    void m1(){
        int ab;
       ab=++a;
       ab=++a;
       ab=++a;
       ab=++a;
    //    System.out.println(ab);
      /*  System.out.println(ab1);
        System.out.println(ab2);
        System.out.println(ab3);*/
        System.out.println(ab);
        System.out.println(a);
    }
}

public class Pro_operator {
    public static void main(String[] args) {
        operator o1=new operator();
        o1.m1();
        System.out.println(o1.c);
    }
}
