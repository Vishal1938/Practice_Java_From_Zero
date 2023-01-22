package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        int num=1234;
        int count=0;
        int rev=0;
        int even_count=0;
        int ood_count=0;
        int sum=0;
        int arr[]={23,45,67,24,87,12,45};
       /* while(num>0){
            num=num/10;
            count++;
        }*/
       /* System.out.println("No of digit :"+count);
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reversing no is :"+rev);*/
        /*while(num>0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                even_count++;
            } else {
                ood_count++;
            }
            num=num/10;
        }
        System.out.println("Even count :"+even_count+" Odd Count"+ood_count);*/
       /* for(int value:arr){
            sum=sum+value;
        }
        System.out.println("Sum of array :"+sum);*/
        /*Arrays.sort(arr);
        for(int sort:arr){
            System.out.println(sort);
        }*/
       /* for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Value after sorting :"+Arrays.toString(arr));
        for(int rev1:arr){
            System.out.println(rev1);
        }*/
        /*ArrayList l=new ArrayList();
        for(int val:arr){
            l.add(val);
        }*/

        /*int arr2[]={23,45,67,24,87,12,45};
        if(arr.length==arr2.length){
            for(int i=1;i< arr.length-1;i++){
                for (int j=i+1;j< arr2.length-1;j++){
                    if (arr[i]==arr[j]) {
                        System.out.println("Arrays are equal");
                    }

                }
            }
        }*/
        /*String s="Hii I am a java developer";
        String[] str=s.split(" ");
        String revstr=" ";
        for(int i=str.length-1;i>0;i--){
            revstr=revstr+str[i]+" ";
        }
        System.out.println(revstr);
        String s1="Vishal";
        int l=s1.length();
        String revstr1="";
        System.out.println(l);
        for(int i=l-1;i>=0;i--){
            revstr1=revstr1+s1.charAt(i);
        }
        System.out.println(revstr1);
        for(int i=0;i<s.length()-1;i++) {
            if (s.charAt(i) == ' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("No of Words :"+count);*/
        int[] arr1={11,33,44,55,22,11,66};
        boolean flag=false;
        if(!flag) {
            for (int i = 0; i < arr1.length - 1; i++) {
                for (int j = i + 1; j < arr1.length - 1; j++) {
                    if (arr1[i] == arr1[j]) {
                        System.out.println("Duplicate found :" + arr1[i]);
                        flag = true;
                        break;
                    }
                }
            }
        }
        else {
            System.out.println("Duplicate Not found");
        }
    }
}
