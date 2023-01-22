package com.company;

public class workbook21_of3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        char arr[]={'A','B','C','D'};
        sb.append(true);
        sb.append(123);
        sb.append(arr);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);
        System.out.println(sb.length());
        sb.setLength(20);
        System.out.println(sb.length());
        System.out.println(sb);
        sb.append("somprakssh");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.setLength(7);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.insert(4,"RDSSCHOOL");
        System.out.println(sb);
        System.out.println("------------");
        String str="ABC";
        StringBuffer sbo=new StringBuffer("ABC");
        System.out.println(str.equals(sbo));
        System.out.println(str.contentEquals(sbo));
        System.out.println("-------");
        StringBuffer obj=new StringBuffer("OKRDS");
        System.out.println(obj.length());
        System.out.println(obj.capacity());
        obj.trimToSize();
        System.out.println(obj.length());
        System.out.println(obj.capacity());
    }
}
