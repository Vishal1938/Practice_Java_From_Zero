package com.company;

public class Reversing {
    public static void main(String[] args) {
        String str="Welcome to jtc india";

        String rev1="";
        String[] s1=str.split(" ");
        for(int j=s1.length-1;j>=0;j--){
            String rev=" ";
            for (int i=s1[j].length()-1;i>=0;i--){
                rev=rev+s1[j].charAt(i);
            }
            rev1=rev1+rev+" ";
        }
        System.out.println(rev1);
    }

}
