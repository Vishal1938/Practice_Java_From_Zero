package com.JavaEight;

public class Workbook_2 {
    public interface HelloType{
        void hello(String text,String name);
    }
    public interface HaiType{
        void main(int a);
    }
    public static void main(String[] args) {
        HelloType helloLamda=(String text1,String name)->{
            System.out.println("Hello :"+text1);
        };
        HaiType haiType=(int al)->{
            System.out.println("HaiTypes :"+al);
        };
        HaiType ht=(int a)->{
            System.out.println(" ");
        };
        helloLamda.hello("Lamda","SOM");
        System.out.println(helloLamda);
        haiType.main(111);
    }
}
