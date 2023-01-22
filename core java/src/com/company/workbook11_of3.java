package com.company;

import java.util.Locale;

public class workbook11_of3 {
    public static void main(String[] args) {
        String str="Hi this is vishal and i am going to be legend one day and leave a legecy behind";
        System.out.println(str.startsWith("Hi"));
        System.out.println(str.startsWith("vishal"));
        System.out.println(str.startsWith("this"));
        System.out.println(str.endsWith("one"));
        System.out.println(str.endsWith("behind"));
        System.out.println("--------");
        String st1=str.replace('i','e');
        System.out.println(st1);
        String st2=str.replace("and","AND");
        String st3=str.toUpperCase();
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('z'));
        System.out.println(str.indexOf('a',11));
        System.out.println(str.indexOf('a',12));
        System.out.println(str.indexOf('a',17));
        System.out.println(str.indexOf("ABC"));
        System.out.println(str.indexOf("and"));
        System.out.println(str.indexOf("and",11));
        System.out.println(str.indexOf("and",200));
        System.out.println(str.length());
        String str11="ya thats true";
        System.out.println(str.concat(str11));
        System.out.println(str.substring(11));
        System.out.println(str.substring(3,17));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(567));
    }
}
