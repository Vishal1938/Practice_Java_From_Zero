package com.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        double d=123456.789;
        Locale INDIA=new Locale("pa","IN");
        NumberFormat nf=NumberFormat.getCurrencyInstance(INDIA);
        System.out.println("INDIA notation is :"+nf.format(d));
        NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("UK nototion is :"+nf.format(d));
        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US nototion is :"+nf2.format(d));
        NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println("CANADA notation is :"+nf3.format(d));
    }
}
