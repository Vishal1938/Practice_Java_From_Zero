package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Logic_1 {
    public static void main(String[] args) {
        //finding the prime number
     /*   Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the no :"+num);
        int count=0;
        if (num>1){
            for(int i=1;i<=num;i++) {
                if (num % i == 0) {
                    count++;
                }
                if (count == 2) {
                    System.out.println("prime no");
                } else {
                    System.out.println("not a prime no");
                }
            }
        }*/
        //find the maximum no
        int a[]={50,60,70,30,12,45};
        /*int max=a[0];
        for(int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("maximum Element in array is :"+max);*/
       /* int min=a[0];
        for(int i=0;i<a.length;i++) {
            if (a[i]<min){
                min =a[i];
            }
        }
        System.out.println("minimum element in array is:"+min);*/
        //find duplicate element
        /*String arr[]={"phy","eng","math","ra","eng"};
        for(int i=0;i< arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("found duplicate element:" + arr[i]);
                }
            }
        }*/

       /* System.out.println("Array befor sorting :"+ Arrays.toString(a));
        int n=a.length;
        for(int i=0; i<n-1;i++){
            for (int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("arrays after sorting :"+Arrays.toString(a));*/
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of given no :"+fact);
    }

}
