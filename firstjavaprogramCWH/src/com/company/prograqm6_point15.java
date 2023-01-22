package com.company;
class Arith{
    void sum1(byte x){
        System.out.println("sum1 in arith");
    }
    void sum1(int a,byte b){
        System.out.println("sum in(int)(byte) arith");
    }
    void sum1(byte b1,int a){
        System.out.println("sum in(byte)(int) arith");
    }
    void sum1(double d,int a){
        System.out.println("sum in(double)(int) arith");
    }
    void sum1(int a,double d){
        System.out.println("sum in(int)(double) arith");
    }
}

public class prograqm6_point15 {
    public static void main(String[] args) {
        Arith ar = new Arith();
        ar.sum1((byte)55);
        ar.sum1(11,(byte)33);
        ar.sum1((byte)33,44);
        ar.sum1(22.22,111);
        ar.sum1(11,44.44);
    }
}
