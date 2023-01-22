package com.company;

public class Logical {
    public static void main(String[] args) {
        int num=24;
        int count=0;
        int a[]={10,34,23,27,54};
        if(num>0){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num+" prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
        int max=a[0];
        for(int i=0;i<a.length-1;i++){
                if (a[i]>max){
                    max=a[i];
            }
        }
        System.out.println("Maximum :"+max);
        int min=a[0];
        for(int i=0;i<a.length-1;i++) {
            if (a[0] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum :"+min);
        int sum=max+min;
        System.out.println("Sum of maximum and minmum no :"+sum);
        String arr[]={"phy","eng","math","ra","eng"};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length-1;i++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found :"+arr[i]);
                }
            }
        }


    }
}
