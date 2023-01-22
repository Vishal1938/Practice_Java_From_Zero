package com.ExceptionHandling;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class jtc112 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        DataOutputStream dos=null;
        try{
            fos=new FileOutputStream("abc.txt");
            bos=new BufferedOutputStream(fos);
            dos=new DataOutputStream(bos);
            dos.writeUTF("Hello jtc student");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                fos.close();
                bos.close();
                dos.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
