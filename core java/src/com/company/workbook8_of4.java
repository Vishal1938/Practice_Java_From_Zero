package com.company;

import java.io.IOException;
import java.sql.SQLException;

public class workbook8_of4 {
    public static void main(String[] args) throws IOException,ArithmeticException{
        Hydrogen h1=new Oxygen();
        Hydrogen h2=new Hydrogen();
        h2.m1(1);
    }
}
class Hydrogen{
    void m1(int x)throws IOException,ArithmeticException{
        if(x==2){
            throw new ArithmeticException();
        }
        else {
            throw new IOException();
        }
    }
}
class Oxygen extends Hydrogen{
   public void m1(int x){
        System.out.println("Oxygen-o2");
    }
   /* public void m1(int x)throws ArithmeticException, SQLException {
        System.out.println("");
    }*/
}