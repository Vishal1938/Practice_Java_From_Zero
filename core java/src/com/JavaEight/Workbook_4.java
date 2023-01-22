package com.JavaEight;

import java.util.function.Function;

public class Workbook_4 {
    interface ReverseType{
        String reverse(String text);
    }
    public static void main(String[] args) {
        ReverseType newText=(testText)->{
            String tempStr="";
            for(String part:testText.split(" ")){
                tempStr=new StringBuilder(part).reverse().toString();
            }
            return tempStr;
        };
        Function<String,String> newText2=(testText)->{
            String tempStr="";
            for(String part:testText.split(" ")){
                tempStr=new StringBuilder(part).reverse().toString();
            }
            return tempStr;
        };
        System.out.println(newText.reverse("HELLO"));
        System.out.println(newText2.apply("JTC"));
    }
}
