package com.company;

public class workbook14_of3 {
    public static void main(String[] args) {
        String st="RDSINDIA";
        char arr[]=st.toCharArray();
        for (int i=0;i< arr.length;i++){
            char c=arr[i];
            System.out.println(i+"\t"+c);
            System.out.println();
        }
        System.out.println("------------");
        byte bArr[]=st.getBytes();
        for(int i=0;i<arr.length;i++){
            byte b=bArr[i];
            System.out.println(i+"\t"+b+"\t"+(char)b);
        }
        System.out.println("---------");
        char chArr1[]=new char[10];
        st.getChars(2,7,chArr1,2);
        for (int i=0;i< chArr1.length;i++){
            char c=chArr1[i];
            System.out.println(i+"\t"+c);
        }
    }
}
