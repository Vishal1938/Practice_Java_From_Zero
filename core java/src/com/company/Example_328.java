package com.company;
class WINDOW{
    WINDOW(){
        System.out.println("open window");
    }
    public void close(){
        System.out.println("close window");
    }
}
class Door{
    Door(){
        System.out.println("open door");
    }
    public void  close(){
        System.out.println("close door");
    }
}
class UseRes{
    int m1(){
        Door dr=null;
        WINDOW wn=null;
        try {
            dr=new Door();
            wn= new WINDOW();
            System.out.println("perform your task");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            {
                dr.close();
                wn.close();
            }
            return 20;
        }
    }
}
public class Example_328 {
    public static void main(String[] args) {
        UseRes ur=new UseRes();
        ur.m1();
    }
}
