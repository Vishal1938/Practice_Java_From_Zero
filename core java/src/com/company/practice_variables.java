package com.company;
class Var{
    int a=11;
    static int b=22;
 void m1(){
     System.out.println("m1 in var class");
 }
 static void m2(Var v1){
     System.out.println("m2 in var class");
     System.out.println(v1.a);
 }
        }

public class practice_variables {
    public static void main(String[] args) {
        Var v1=new Var();
v1.m1();
v1.m2(v1);
    }
}