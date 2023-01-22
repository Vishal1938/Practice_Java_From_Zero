package com.company;
class hello20{
    static {
        System.out.println("SB in hai");
        String str[]={"abc"};
                program6point_20.main(str);
                program6point_20.main(10);
         //       program6point_20.main(1);
       //         program6point_20.main();
    }
}


public class program6point_20 {
    public static void main(String[] args) {
        System.out.println("main in (String arg[] in public class");
    }
hello20 h1=new hello20();
    public static void main(String args) {
        System.out.println("main(String arg) in main");

    }

    public static void main(int a) {
        System.out.println("(int a) in main");
    }

    public static void main(short s) {
        System.out.println("(short s) in main");
        program6point_20.main(10);

    }
}
