package com.ExceptionHandling;

import java.io.IOException;

class CheckedException extends Exception{
}
class UncheckedException extends RuntimeException{
}
class Duster {
    void m1(int a) throws CheckedException, IOException {
        System.out.println("m1 in hello");
        if (a == 0) {
            throw new UncheckedException();
        } else {
            throw new CheckedException();
        }
    }

    void m2() {
        System.out.println("m2 in hello");
        try {
            m1(0);
        } catch (CheckedException | IOException e) {
            e.printStackTrace();
        }
    }
}
public class jtc117 {
    public static void main(String[] args) {
        new Duster().m2();
    }
}

