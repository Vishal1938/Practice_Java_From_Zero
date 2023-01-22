package com.ExceptionHandling;

import java.io.IOException;

public class Workbook_8 {
    public static void main(String[] args) throws IOException,ArithmeticException{
        Hello h=new Hello();
        h.m1(1);
    }
}
class AException extends IOException{}
class Hello{
    void m1(int x)throws IOException,ArithmeticException{
        if(x==1){
            throw new ArithmeticException();
        }else {
            throw new IOException();
        }
    }
}
class Hai extends Hello{
  /* public void m1(int x){
        System.out.println("Hai-m1");
    }OK
    public void m1(int x) throws IOException,ArithmeticException{
        System.out.println("Hai-m1");
    }/* OK
    public void m1(int x) throws  AException,ArithmeticException {
        System.out.println("Hai-m1");
    }OK
   public void m1(int x)throws  Exception,ArithmeticException{
       System.out.println("Hai-m1");
   }NOT OK
   public void m1(int x) throws AException,ArithmeticException,IOException{
       System.out.println("Hai-m1");
   }OK
   public void m1(int x) throws AException,ArithmeticException, SQLException {
       System.out.println("Hai-m1");
   }NOT OK*/
}
