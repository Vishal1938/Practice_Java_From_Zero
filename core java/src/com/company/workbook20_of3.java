package com.company;
public class workbook20_of3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(true);
        sb.append(1234);
        sb.append(985.251);
        System.out.println("----------");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println('A');
        System.out.println(new STUdent666());
        System.out.println("-----------");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println("------------");
        StringBuffer sb1=new StringBuffer(30);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        System.out.println("----");
        StringBuffer sb2=new StringBuffer("HELLO");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        System.out.println("--------");
        StringBuffer sb3=new StringBuffer();
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
        System.out.println("--------");
        sb3.append("qwertyuiop1234567ASDFGHJK");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
    }
}
class STUdent666{}