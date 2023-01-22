package com.Internationalization;

import java.text.DateFormat;
import java.util.*;
public class DateFormateDemo2 {
    public static void main(String[] args) {
        DateFormat UK=DateFormat.getDateInstance(0,Locale.UK);
        DateFormat US=DateFormat.getDateInstance(0,Locale.US);
        DateFormat ITALY=DateFormat.getDateInstance(0,Locale.ITALY);
        System.out.println("UK style is :"+UK.format(new Date()));
        System.out.println("US style is :"+US.format(new Date()));
        System.out.println("ITALY style is :"+ITALY.format(new Date()));
    }
}
