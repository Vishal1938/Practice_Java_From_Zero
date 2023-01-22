package com.company;

public class program6_point21 {
    static {
        System.out.println("SB in public class");
        String str[] = {"abc"};
                jtc73.main(str);
    }

    public static void main(String[] args) {
        System.out.println("main in hai");
    }
}
class jtc73{
    static{
        System.out.println("SB in jtc73");
        String str[]={"abcd"};
        program6_point21.main(str);
    }

    public static void main(String[] args) {
        System.out.println("main in jtc73");
    }
}
