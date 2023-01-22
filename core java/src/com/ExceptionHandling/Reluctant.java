package com.ExceptionHandling;

public class Reluctant {
    //public Reluctant internalInstance=new Reluctant();
    public Reluctant()throws Exception{
        throw new Exception("i am not coming out");
    }

    public static void main(String[] args) {
        try {
            Reluctant b=new Reluctant();
            System.out.println("surprise!!");
        }
        catch (Exception e){
            System.out.println("I told u so");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println();
        }
    }
}
