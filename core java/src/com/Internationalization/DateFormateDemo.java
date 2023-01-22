package com.Internationalization;

import java.text.DateFormat;
import java.util.Date;

public class DateFormateDemo {
    public static void main(String[] args) {
        System.out.println("Full form is :"+ DateFormat.getDateInstance(0).format(new Date()));
        System.out.println("Long form is :"+ DateFormat.getDateInstance(1).format(new Date()));
        System.out.println("Medium form is :"+DateFormat.getDateInstance(2).format(new Date()));
        System.out.println("short form is :"+DateFormat.getDateInstance(3).format(new Date()));
    }
}
