package com.company;
class RTO{
    final static int val=9090;
    static {
        System.out.println("**STATIC BLOCK OF RTO\t:"+val);
    }
}
public class workbook10_of2 {
    public static void main(String[] args) {
        System.out.println("**MAIN METHODE**");
        System.out.println(RTO.val);
        System.out.println(RTO.val+100);

    }
}
