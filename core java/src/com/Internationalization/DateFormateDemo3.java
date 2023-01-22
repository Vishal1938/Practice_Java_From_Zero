package com.Internationalization;
import java.text.*;
import java.util.*;
public class DateFormateDemo3 {
    public static void main(String[] args) {
        DateFormat ITALY =DateFormat.getDateTimeInstance(0,0,Locale.ITALY);
        System.out.println("ITALY style is :"+ITALY.format(new Date()));
    }
}
