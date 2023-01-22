package com.company;

public class CWH_ps3 {
    public static void main(String[] args) {
       // String name = "Peter Parker";
      //  name = name.toUpperCase();
     //   System.out.println(name);

        String text = "To lower     case";
        text = text.replace(" " ,"_");
        System.out.println(text);
        //problem 3
        String letter =  "Dear name tum bhadwachod ho!";
         letter = letter.replace("name","vipin");
        System.out.println(letter);

        //problem4
        String myString = "this string contain  dobb and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem 5
        String better = "Dear priya,\n\t you are cutie,\n\tThanks! ";
        System.out.println(better);


    }
}
