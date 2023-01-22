package com.company;
class over{

}
class loading{
    void m1(){
        System.out.println("m1 in loading");
    }
    void m1(over over){
        System.out.println("m1(hai hai) in loading");
    }
    void m1(int a[]){
        System.out.println("m1(int a[]) in hello");
    }
    void m1(Object O){
        System.out.println("m1(m1(object O) in hello");
    }
    void m1(String str){
        System.out.println("m1(string str) in hello");
    }
}
public class program6_point18 {
    public static void main(String[] args) {
        loading l1= new loading();
        l1.m1();
        l1.m1(new over());
   //     l1.m1(null);
        l1.m1("abc");
        l1.m1(new Object());
    }
}
