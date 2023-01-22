package com.ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class TVS {
    void m5() {
        System.out.println("In m5");
        try {
            int i = 10 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    void m4() throws ArithmeticException, SQLException {
        System.out.println("in m4");
   try
    {
        throw new IOException();
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
    }
void m3() throws SQLException,FileNotFoundException{
    System.out.println("m3 in hello");
    m5();
    m4();
}
void m2()throws FileNotFoundException,IOException{
    System.out.println("m2 in hello");
    try{
        m3();
    }
    catch (SQLException e){
        System.out.println(e);
    }
}
void m1() throws  ArithmeticException{
    System.out.println("m1 in tvs");
    throw new ArithmeticException();
}
}
public class jtc115 {
    public static void main(String[] args) {
        TVS t1= new TVS();
        try{
            t1.m1();
            t1.m2();
            t1.m3();
            t1.m4();
        }
       catch(ArithmeticException|FileNotFoundException|SQLException e){
            System.out.println(e);
        }
        catch (IOException e){

        }
    }
}
