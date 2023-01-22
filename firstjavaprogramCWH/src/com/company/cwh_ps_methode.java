package com.company;

public class cwh_ps_methode {
    static  void multiplication(int n){
     /*   for (int i=1;i<=10;i++){
            System.out.format("%d * % d = %d\n",n,i,n*i);
        }
    }
static void pattern(int n){
        for(int i=n; i>=0; i--){
            for(int j=0; j<i+1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
}
static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n+ sumRec(n-1);*/
}
static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        /*else if(n==2){
            return  1;
        }*/
        else {
            return fib(n - 1) + fib(n - 2);
        }
}
    public static void main(String[] args) {
      //  multiplication(7);
      // pattern(7);
      // int c= sumRec(5);
      //  System.out.println(c);
        int result = fib(11);
        System.out.println(result);
    }
}
