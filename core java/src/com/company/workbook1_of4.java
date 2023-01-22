package com.company;

public class workbook1_of4 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            int x = Integer.parseInt("0");
            System.out.println(x);
            int y = 10 / x;
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("Please Don't provide zero");
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("Please Provide integer value");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Please don't do this ");
            System.out.println(e);
        }
        System.out.println("main end");
    }
}
