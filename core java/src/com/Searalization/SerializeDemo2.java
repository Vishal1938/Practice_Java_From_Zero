package com.Searalization;

import java.io.*;

class Lion implements Serializable {
   Deer d1=new Deer();
}
class Deer implements Serializable{
    grass g1=new grass();
}
class grass implements Serializable{
    String s1="Jungle";
}
public class SerializeDemo2 {
    public static void main(String[] args) throws Exception{
        Lion l1=new Lion();
        FileOutputStream fos=new FileOutputStream("xyz.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(l1);

        FileInputStream fis=new FileInputStream("xyz.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Lion l2=(Lion) ois.readObject();
        System.out.println(l2.d1.g1.s1);
    }
}
