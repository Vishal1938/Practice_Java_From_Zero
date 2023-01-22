package com.Searalization;

import java.io.*;

class Account implements Serializable{
    String username="Ravi";
    transient String pwd="Alpha";
    private void writeObject(ObjectOutputStream os)throws Exception{
        os.defaultWriteObject();
        String epwd="123"+pwd;
        os.writeObject(epwd);

    }
    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String epwd=(String) is.readObject();
        pwd=epwd.substring(3);
    }
}
public class CustomizeSerializeDemo {
    public static void main(String[] args) throws Exception{
        Account a1=new Account();
        System.out.println(a1.username+"____"+a1.pwd);
        FileOutputStream fos=new FileOutputStream("pqr.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis=new FileInputStream("pqr.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2=(Account) ois.readObject();
        System.out.println(a2.username+"____"+a2.pwd);
    }
}
