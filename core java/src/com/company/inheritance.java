package com.company;
class we{
    int a=11;
    int b=22;
void m1(){
    System.out.println("m1 in we class");
}
    void m2(){
        System.out.println("m2 in we");
    }
    we(){
        System.out.println("def con we");
    }
}
class me extends we{
    int a=44;
    int b=55;
     void m1(int a){
        System.out.println("m1 in me");
    }
}
class hum extends me{
    int a=77;
    void m1(int a){
        System.out.println("m1 in hum");
    }
}
public class inheritance {
    public static void main(String[] args) {
        we w1 = new me();
        w1.m2();
        System.out.println(w1.a);
        we w2= new hum();
        w2.m1();
    }
}
