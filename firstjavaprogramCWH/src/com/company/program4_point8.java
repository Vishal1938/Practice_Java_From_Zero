package com.company;

public class program4_point8 {
    public static void main(String[] args) {
        int i=3;
        final int i1=3;
        final int i2;
        i2=3;
        switch (1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
          /*  case i:
                System.out.println("three i");
                break;*/
            case i1:
                System.out.println("three i1");
                break;
           /* case i2:
                System.out.println("three i2");
                break;
            case 3:
                System.out.println("three");*/
            default:
                System.out.println("Default");
        }
    }
}
