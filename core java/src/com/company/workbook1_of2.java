package com.company;

public class workbook1_of2 {
    public static void main(String[] args) {
        methodeservice serv = new methodeservice();
        serv.show('A');
        byte by1 = 123;
        serv.show(123);
        serv.show(by1);
        serv.show((int)123l);
        serv.display((byte)123);
        serv.display(by1);
    }
}
class methodeservice{
    void show(int ab){
        System.out.println("-show(int)\t:"+ab);
    }
    void display(byte by1){
        System.out.println("-display(byte)\t:"+by1);
    }
}
