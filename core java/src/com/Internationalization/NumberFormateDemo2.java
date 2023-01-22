package com.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormateDemo2 {
    public static void main(String[] args) {
        double d=123456.789;
        NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
        System.out.println("Italy form is...:"+nf.format(d));
    }
}
