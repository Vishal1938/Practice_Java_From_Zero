package com.company;

public class workbook17_of3 {
    public static void main(String[] args) {
        String st="BBCmni45";
        String pattern="^[A-H][A-Za-z0-9]*";
        System.out.println(st.matches(pattern));
        System.out.println("---------");
        String st11="RDS is no 1 in region";
        String st12="welcome to RDS Ajnera";
        String st13="welcome to RDS Ajnera";
        System.out.println(st11.regionMatches(12,st12,14,5));
        System.out.println(st11.regionMatches(12,st12,14,2));
        System.out.println(st11.regionMatches(12,st13,14,2));
        System.out.println(st11.regionMatches(true,12,st13,14,2));
        System.out.println(st11.regionMatches(false,12,st13,14,2));
        /*int ab=10;
        int bc=23;
        String str=String.format("sum of %d and %d is %d ",ab,bc,(ab+bc));
        System.out.println(str);
        int val=97;
        String st1=String.format("%d %h %o %c",val,val,val,val);
        System.out.println(st1);
        System.out.printf("%d %h %o %c" ,val,val,val,val);*/
    }
}
