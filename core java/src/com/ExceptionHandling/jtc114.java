package com.ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

class XUV {
    void m1(int a) throws ArithmeticException {
        System.out.println("in m1");
        throw new ArithmeticException();
    }

    void m2(boolean b) throws IOException, InstantiationException {
        System.out.println("in m2");
        if (!b) {
            throw new IOException();
        } else {
            throw new InstantiationException();
        }
    }

    void m3() {
        System.out.println("in m3");
        try {
            throw new SQLException();
        } catch (SQLException e) {

        }
    }

    void m4() throws IOException {
        System.out.println("m4 in hello");
        try {
            m2(true);
        } catch (InstantiationException e) {
        }
    }
    void m5() {
        System.out.println("m3 in hello");
        m3();
    }
}
public class jtc114 {
    public static void main(String[] args) throws IOException{
        XUV x1=new XUV();
        x1.m4();
        x1.m5();
    }
}
