package com.company;

import java.util.Arrays;

public class Logic_ques {
    public static void main(String[] args) {
        int a[]={4,6,8,9,3};
        int sum=0;
        /*for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }*/
        for(int value:a){
            sum=sum+value;
        }
        System.out.println("Sum of Array element :"+sum);
        for(int i=0;i<a.length;i++){
            if (a[i]%2==0) {
                System.out.println("Even no:"+a[i]);
            }
            else {
                System.out.println("Odd no:"+a[i]);
            }
        }
        int a1[]={1,2,3,4,5};
        int a2[]={1,2,3,4,5};
        boolean status= Arrays.equals(a1,a2);
        System.out.println(status);
        if(status==true){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
        boolean status1=true;
        if(a1.length==a2.length){
            for(int i=0;i< a1.length;i++){
                if(a1[i]!=a2[i]){
                    status1=false;
                }
            }
        }
        else{
            status1=false;
        }
        if(status1==true){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum Element of Array is:"+max);
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum Element of Array is:"+min);
    }
}
