package com.company;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "notepad";
        String s2 = "calc";
        String s3 ="mspaint";
        switch (s1) {
            case "notepad":
                System.out.println("opening the notepad");
                break;
            case "calc":
                System.out.println("opening the calculator");
                break;
            case "mspaint":
                System.out.println("opening the mspaint");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}