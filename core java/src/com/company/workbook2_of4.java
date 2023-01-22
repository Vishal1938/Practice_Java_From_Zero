package com.company;

public class workbook2_of4 {
    public static void main(String[] args) {
        System.out.println("main begin");
        String s="null";
        try {
           s=args [0];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please provide the value");
            System.out.println(e);
        }
        int x=0;
        try {
            x=Integer.parseInt(s);
            System.out.println(x);
        }
        catch (NumberFormatException e){
            System.out.println("please provide integer number");
            System.out.println(e);
        }
        try{
            int y=10/x;
            System.out.println(y);
        }
        catch (ArithmeticException e){
            System.out.println("please Don't Provide Zero");
        }
        System.out.println("main end");

    }
}
