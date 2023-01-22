package com.company;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class workbook8_of2 {
    public static void main(String[] args)throws Exception {
        FileOutputStream f1=new FileOutputStream("Test.txt");
        System.setOut(new PrintStream(f1));
        System.out.println("**MAIN METHODE**");
        System.out.println(Xyz.var);
        System.out.println("\n--value accssed--");
        Xyz x1=new Xyz();
        System.out.println(new Xyz());
        System.out.println(x1);
    }
}
class Xyz{
    static int var=123;
    static {
        System.out.println("--static of xyz--");
    }
}
