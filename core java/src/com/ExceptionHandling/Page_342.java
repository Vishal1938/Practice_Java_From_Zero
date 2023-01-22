package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Page_342 {
    static void Copy(String src,String dest)throws Exception{
        InputStream in =null;
        OutputStream out=null;
        try{
            in =new FileInputStream(src);
            out=new FileOutputStream(dest);
            byte[] buf=new byte[1024];
            int n;
            while((n =in.read(buf))>0){
                out.write(buf,0,n);
            }
        }finally {
            if(in!=null)in.close();
            if(out!=null)out.close();
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("usage.java copy<src><dest>");
            } else {
                Copy(args[0], args[1]);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
