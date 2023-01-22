package com.ExceptionHandling;

import java.io.FileInputStream;

public class Page_346 {
    public static void main(String[] args) {
        long res=ResourceUser.readFile("info.txt");
        System.out.println("In main Result\t :"+res);
        System.out.println();
        long res2=ResourceUser.readFile("Empty.java");
        System.out.println("In main Result\t :"+res2);
    }
}
class ResourceUser {
    static long readFile(String fileName) {
        System.out.println("--File Name in method\t :" + fileName);
        long length = 0;
        try (JtcResource resource = new JtcResource();
             FileInputStream fis = new FileInputStream(fileName);
        ) {
            while (true) {
                int x = fis.read();
                if (x == -1)
                    break;
                length++;
            }
            long res = 13 / length;
            System.out.println("Result\t:" + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return length;
    }
}
     class JtcResource implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("** close method() of jtcResource **\t:" + this);
        }
    }

    class JtcAnotherResource {
    }
