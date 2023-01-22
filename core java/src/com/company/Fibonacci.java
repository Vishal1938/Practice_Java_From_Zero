package com.company;

public class Fibonacci{
    public static void main(String[] args){
        Fibonacci f1=new Fibonacci();
        int fib=f1.fib(4);
        System.out.println("Fibonaci of N is :"+fib);
    }
    public int  fib(int n){
        if(n<1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}