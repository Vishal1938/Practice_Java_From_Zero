package com.company;

public class program_4point9 {
    public static void main(String[] args) {
   /*     for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("value");
            if (i == 3)
                break;
        }*/
        int i = 0;
        for (; i < 10; ) {
            System.out.println(i);
            i++;
        }/*
        for (int j = 0; j < 10; j++){
            if(i==3)
            {
                System.out.println("IN FOR LOOP"+i);
                System.exit(0);
            }
            System.out.println(i);
        }*/
        int k=0;
        for(k=0;k<10;k++)
            i=i++;
        System.out.println(i);
    }
}