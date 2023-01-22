package com.company;

import java.util.Scanner;

public class cwh_ch11_ex_sol {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your physics marks : ");
        int physics =scan.nextInt();
        System.out.println("Enter your english marks :");
        int english =scan.nextInt();
        System.out.println("Enter your chemistrey marks : ");
        int chemistrey = scan.nextInt();
        System.out.println("enter your maths marks :");
        int maths =scan.nextInt();
        System.out.println("Enter your hindi marks :");
        int hindi = scan.nextInt();

        float percentage = ((physics + english + chemistrey + maths + hindi)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);

    }
}
