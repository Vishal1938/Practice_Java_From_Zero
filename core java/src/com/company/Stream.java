package com.company;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Stream {
    public static void main(String[] args)throws IOException {
        System.out.println(System.err);
        System.out.println(System.out);
        FileOutputStream f1= new FileOutputStream("ABC.txt");
        PrintStream p1=new PrintStream(f1);
        System.out.println(10+20);
        System.out.println("10"+"20");
    }
}

