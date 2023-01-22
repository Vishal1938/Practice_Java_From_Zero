package com.ExceptionHandling;
class window1 implements AutoCloseable{
    window1(){
        System.out.println("open the window");
    }
    public void close(){
        System.out.println("close the window");
    }
}
class door1 implements AutoCloseable{
    door1(){
        System.out.println("open the door");
    }
    public void close(){
        System.out.println("close the door");
    }
}

public class JTC110 {
    public static void main(String[] args) {
        try(  door1 dr= new door1() ;window1 wn= new window1();){
            System.out.println("Use resource");
        }
        catch (Exception e){
        }
    }
}
