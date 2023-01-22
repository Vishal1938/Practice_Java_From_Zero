package com.company;

public class vishal_practice_varrags {
   /* static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int num(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else
            return n*factorial(n-1);
    }
    static  void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d * %d =%d\n",n,i,n*i);
        }
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
        if(n==1){
            return 1;
        }else {
            return n+sumRec(n-1);
        }
      //  System.out.println(sumRec(5));

    }
    static void pattern1(int n){
        for(int i=n ;i>=1;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
            else {
            return fib(n-1) + fib(n-2);
        }
    }
   /* static  float  temperature(float n){
        if (n==0){
            return 32;
        }
        else{
             return temperature((n*9)/5+32);

        }


    }*/

    public static void main(String[] args) {
        System.out.println("sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("sum of 4,5,9 is :"+sum(4,5,9));
        System.out.println("sum of 4,5,6,7 is :"+ sum(4,5,6,7));
        int x=6;
        System.out.println("the value of factorial n is "+ factorial(x));
        multiplication(8);
pattern(4);
        System.out.println(sumRec(4));
        pattern1(5);
        System.out.println(fib(7));
       // temperature(55);
       // System.out.println(temperature(55));
    }

}
