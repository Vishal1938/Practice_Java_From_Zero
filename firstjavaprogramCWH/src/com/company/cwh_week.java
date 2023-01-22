package com.company;

import java.util.Scanner;

public class cwh_week {
    public static void main(String[] args) {
        System.out.println("name of the day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
        }
    }
}
