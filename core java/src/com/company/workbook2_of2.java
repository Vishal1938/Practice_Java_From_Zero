package com.company;

public class workbook2_of2 {
    public static void main(String[] args) {
        int ab=98;
        System.out.println("ab in main Before\t:"+ab);
        Mno ref=new Mno();
        ref.showvalue(ab);
        System.out.println("ab in main After\t:"+ab);
    }
}
class Mno {
    void showvalue(int ab){
        System.out.println("Before show value\t:"+ab);
        if(ab!=0) {
            showvalue(ab / 10);
        }
        System.out.println("After showvalue\t:"+ab);
    }
}