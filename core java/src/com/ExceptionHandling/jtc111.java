package com.ExceptionHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class jtc111 {
    public static void main(String[] args) {
        System.out.println("in main");
        try(FileOutputStream fos=new FileOutputStream("abc.txt");
            BufferedOutputStream bos =new BufferedOutputStream(fos);
            DataOutputStream dos=new DataOutputStream(bos))
        {
            dos.writeUTF("Hello jtc");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
