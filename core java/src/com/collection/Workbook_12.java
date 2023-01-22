package com.collection;

import java.util.StringTokenizer;

public class Workbook_12 {
    public static void main(String[] args) {
        String str="Welcome to java training Center to learn java and advance java. Thankyou";
        StringTokenizer token=new StringTokenizer(str);
        System.out.println(token.hasMoreTokens());
        System.out.println(token.countTokens());
        while(token.hasMoreTokens()){
            String str1=token.nextToken();
            System.out.println(str1);
        }
        System.out.println(token.hasMoreTokens());
        System.out.println(token.countTokens());
        StringTokenizer token1=new StringTokenizer(str,"ja");
        System.out.println(token1.hasMoreTokens());
        System.out.println(token1.countTokens());
        while (token1.hasMoreTokens()){
            Object obj=token1.nextElement();
            System.out.println(obj);
        }
    }
}
