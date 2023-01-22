package com.company;

import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("you are going to be adult");
            case 26 -> System.out.println("you are going to get a job");
            case 60 -> System.out.println("you are going to retired");
            default -> System.out.println("enjoy your life!");

            //  if (age>56){
            //       System.out.println("you are experianced");
            //   }
            //  else if(age>46){
            //    System.out.println("you are semi experianced");
            //   }
            //   else if(age>36){
            //       System.out.println("you are semi-semi-experianced");
            //   }
            //  else{
            //      System.out.println("you are not experianced");
        }
    }
}
