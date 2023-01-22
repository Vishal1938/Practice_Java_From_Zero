package com.Searalization;

import java.io.*;

class Animal {
    int i = 10;

    Animal() {
        System.out.println("Animal Constructor called");
    }
}
class Leopard extends Animal implements Serializable {
    int j=20;
    Leopard(){
        System.out.println("Leopard Constructor called");
    }
}
public class SerializeDemo6 {
    public static void main(String[] args)  throws Exception{
        Leopard l1=new Leopard();
        l1.i=888;
        l1.j=999;

        FileOutputStream fos=new FileOutputStream("abx.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(l1);
        System.out.println("Deserization started");
        FileInputStream fis =new FileInputStream("abx.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Leopard l2=(Leopard) ois.readObject();
        System.out.println(l2.i+"_____"+l2.j);

    }
}
