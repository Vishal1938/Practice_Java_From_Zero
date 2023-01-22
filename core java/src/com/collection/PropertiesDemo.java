package com.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("abc1.Properties");
        p.load(fis);
        System.out.println(p);
        String s= p.getProperty("Vishal");
        System.out.println(s);
        p.setProperty("Ravi","8888");
        FileOutputStream fos=new FileOutputStream("abc1.Properties");
        p.store(fos,"Updated value for core java developer");
    }
}
