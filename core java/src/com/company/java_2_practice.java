package com.company;
class Z{
    int a;
    final int b= 3;
    static final int c;
     {
          a=10;
         int  b=22;
          int c=33;
        System.out.println("instance block in z");
         System.out.println(a);
        System.out.println(b);
         System.out.println(c);
         System.out.println(this.a);
         System.out.println(this.b);
         System.out.println(b>>3);
    //     System.out.println(this.c);
    }
    static {
        int a=11;
        int b=22;
        c=20;
        System.out.println("static block in z");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class java_2_practice {
    public static void main(String[] args) {
        Z z1 =new Z();
        System.out.println(z1.a);
        System.out.println(z1.b);
        System.out.println(new Z().c);
    }
}
