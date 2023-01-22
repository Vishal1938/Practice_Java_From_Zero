package com.company;
class hello7{
    int m1(){
        System.out.println("m1 in hello");
        return 10;
    }
    static int m2(){
        System.out.println("m2 in hello");
        return 20;
    }
    int i1=m2();
     int i2=m1();
    int i3=m2();
    static int m3(){
        System.out.println("m3 in hello");
        return 100;
    }
    static void m4(int a){
        System.out.println("m4(int a) in hello");
        System.out.println(a);
    }
}

public class program_6point14 {
    public static void main(String[] args) {
         hello7 h1= new hello7();
    /*     int h2= h1.m1();
        System.out.println(h2);
         int h3= h1.m2();
        System.out.println(h3);*/
    //     hello7.m2();
      // hello7.m4(hello7.m3());
     //   System.out.println(h4);
    //    hello7.m3(hello7.m2())
    }
}
