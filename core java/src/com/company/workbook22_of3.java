package com.company;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class workbook22_of3 {
    public static void main(String[] args) throws Exception{
        System sys=null;
        System.out.println("OUT MSG 1");
        System.out.println("OUT MSG 2");
        System.out.println("ERR MSG 1");
        System.out.println("ERR MSG 1");
        System.out.println("ERR MSG 2");
        long ms=System.currentTimeMillis();
        System.out.println(new Date(ms));
        System.out.println(System.getenv("path"));
        System.out.println("*********");
        Map values =System.getenv();
        Iterator it =values.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry ent = (Map.Entry) it.next();
            System.out.println(ent.getKey() + "\t\t" + ent.getValue());
        }
        System.out.println("\n****proprties Name*******\n");
        System.setProperty("java.ins.name","java Training centre");
        System.out.println(System.getProperty("os.name"));
        Properties p=System.getProperties();
        Enumeration enu=p.propertyNames();
        while (enu.hasMoreElements()){
            String nm=(String) enu.nextElement();
            System.out.println(nm+"\t\t"+p.getProperty(nm));
        }
        System.out.println("*********");
        System.setProperty("ruintim.test",("true"));
        System.out.println(Boolean.getBoolean("true"));
        System.out.println(Boolean.getBoolean("runtim.test"));
        System.out.println("**********");
        System.out.println("-----------");
        System.out.println("Message Before changing");
        System.out.println(System.out);
        System.err.println(System.err);
        System.out.println(System.out==System.err);
        System.setOut(new PrintStream(new FileOutputStream("res.txt")));
        System.out.println("Message After changing 1");
        System.out.println("message after changing 2");
        System.err.println("ERR MSG after changing 2");
        System.exit(0);
        System.err.println("Error");
        for(int i=0;i<10;i++){
            System.err.println("value is\t:"+i);
        }
    }
}
