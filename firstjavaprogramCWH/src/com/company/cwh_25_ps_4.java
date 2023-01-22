package com.company;

public class cwh_25_ps_4 {
    public static void main(String[] args) {
    //    int n =4;
    //    for (int i=n ;i>0; i--){
    //        for (int j=0;j<i;j++) {
    //            System.out.print("*");
    //        }
    //        System.out.print("\n");
    //   }
        int sum=0;
        int n=3;
        for(int i=0; i<n; i++){
            sum = sum +(2*i);
        }
        System.out.print("sum of the even numbers is :");
        System.out.println(sum);
    }
}
