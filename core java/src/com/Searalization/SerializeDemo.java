package com.Searalization;

import java.io.*;

class Dog implements Serializable{
    int i=10;
    int j=45;
    transient int k=23;
    static String name="Kumar";
    final char c='A';
    transient static int ts=67;
    transient final String tf="Qwery";
}
public class SerializeDemo {
    public static void main(String[] args) throws  Exception {
        Dog d1=new Dog();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
        System.out.println(d2.i+"____"+d2.j+"____"+d2.k+"____"+d2.name+"____"+d2.c+"____"+d2.ts+"____"+d2.tf);
    }//10____45
}
