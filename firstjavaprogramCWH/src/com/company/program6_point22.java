package com.company;
class hii{
    public static void main(String[] args) {

    }
}

public class program6_point22 {
    static {
        System.out.println("SB in public class");
        String str[] ={"abc"};
        program6_point22.main(str);
    //    program6_point22.main(str);
    }

    public static void main(String[] args) {
        System.out.println("main in public class");
    }
}
