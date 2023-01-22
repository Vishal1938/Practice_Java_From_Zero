package com.Searalization;

import java.io.*;

public class ExternalizationDemo implements Externalizable {
    String s;
    int i;
    int j;
    public ExternalizationDemo(){
        System.out.println("Public no-arg Constructor");
    }

    public ExternalizationDemo(String s,int i,int j){
        this.s=s;
        this.i=i;
        this.j=j;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeObject(i);
    }

    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
        s=(String) in.readObject();
        i=in.readInt();
    }

    public static void main(String[] args) throws Exception{
        ExternalizationDemo t1=new ExternalizationDemo("Durga",10,20);
        FileOutputStream fos=new FileOutputStream("RTI.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t1);

        FileInputStream fis=new FileInputStream("RTI.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ExternalizationDemo t2=(ExternalizationDemo) ois.readObject();
        System.out.println(t2.s+"_____"+t2.i+"_____"+t2.j);
    }
}
