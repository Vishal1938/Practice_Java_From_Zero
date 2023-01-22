package com.company;
class FOR{
    static {
        System.out.println("SB in a class");
    }
    {
        System.out.println("IB in a class");
    }
    FOR(){
        System.out.println("Default cons....");
    }
}

public class forname {
    public static void main(String[] args) throws Exception{
        Class.forName("FOR").newInstance();
    }
}
