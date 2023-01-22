package com.company;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Arraycopy {
    public static void main(String[] args)throws Exception {
        System.out.println("-----array copy-----");
        int a[]={11,22,33,44,55,66,77};
        int b[]=new int[15];
        for(int i=0;i<a.length;i++){
            System.out.println("A array "+a[i]+"\t"+i);
        }
        for(int i=0;i<b.length;i++){
            System.out.println("B array "+b[i]+"\t"+i);
        }
        System.arraycopy(a,0,b,7,7);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
       // System.exit(-4);
        System.out.println("system class");
        System.out.println("for error message");
        System.out.println("System.in");
        System.out.println("System.out");
        System.out.println("System.err");
        System.out.println("System.out==System.err");
        System.setOut(new PrintStream(new FileOutputStream("ABC.txt")));
        System.out.println("i am going to file");
    }
}
