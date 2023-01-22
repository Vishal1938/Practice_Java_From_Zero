package com.company;
public class cwh_ps14_strings {
    public static void main(String[] args) {
        String name = "vishal";
    //  System.out.println(name);
   //  System.out.println(name);
        int value = name.length();
      System.out.println(value);

       // String lstring = name.toLowerCase();
      // System.out.println(lstring);
      //  String ustring = name.toUpperCase();
      // System.out.println(ustring);
     //   String nonTrimmedString = "     vishal    ";
     //   System.out.println(nonTrimmedString);
     //   String trimmedString = nonTrimmedString.trim();
      //  System.out.println(trimmedString);
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,6));

       // System.out.println(name.replace('v',"b"));
       // System.out.println(name.replace('i',"ai"));
        //System.out.println(name.startsWith("is"));
      //  System.out.println(name.endsWith("y"));

        //System.out.println(name.charAt(5));
      //  System.out.println(name.indexOf("al"));
      //  String modifiedName = "vishalishal";
       // System.out.println(modifiedName.indexOf("hal",222));
        System.out.println(name.equals("vishal"));
        System.out.println(name.equalsIgnoreCase("VISHAL"));
        System.out.println("i am sameer rai \t  the bhadwa");

    }
}
