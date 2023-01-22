package com.company;

public class wrkbook3_of2 {
    public static void main(String[] args) {
        byte by1=123;
        OverloadManager mngr=new OverloadManager();
        mngr.show(12,by1);
        mngr.show(by1,123);
        mngr.show((int)by1,by1);
        mngr.show(by1,(int)by1);
        String str=null;
        Object obj=null;
        int arr[]=null;
        mngr.display(str);
        mngr.display(obj);
        mngr.display(arr);
        mngr.display(null);
        mngr.showValues(arr);
        mngr.showValues(str);
        mngr.showValues((String) null);
        mngr.showValues((int[])null);
    }
}
class OverloadManager{
    void show(int ab,byte b1){
        System.out.println("**show(int,byte)**");
    }
    void show(byte b1,int ab){
        System.out.println("**show(byte,int)**");
    }
    void display(String str){
        System.out.println("___display(string)_____");
    }
    void display(Object obj){
        System.out.println("___display(Object)------");
    }
    void showValues(String str) {
        System.out.println("--showValues(string)---");
    }
    void showValues(int[]arr){
        System.out.println("--showValues(int[])--");
    }
}