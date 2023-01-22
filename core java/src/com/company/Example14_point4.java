package com.company;
public class Example14_point4 {
    public static void main(String[] args) {
        String s1=new String("Apple");
        String s2=new String("Apple");
        String s3=new String("Amazon");
        String s4=new String("AppleAmazon");
        String s5=s1+s4;
        String s6="Apple";
        String s12="Apple";
        String s7="Amazon";
        String s8="Apple"+"Amazon";
        String s9=s6+s7;
        String s10=new String("Apple")+"Amazon";
        String s11="Apple"+new String("Amazon");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s4==s5);
        System.out.println(s5==s8);
        System.out.println(s8==s9);
        System.out.println(s11==s10);
        System.out.println(s10==s9);
        System.out.println(s8==s10);
        System.out.println(s6==s12);

    }
}
