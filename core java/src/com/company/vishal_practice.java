package com.company;
class EX{
    int a=1;
    static int b=2;
    class in {
        static int a = 22;
        int c = 44;

        void show() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(EX.b);
            System.out.println(new EX().a);
        }
    }
    in i=new in();
}

public class vishal_practice {
    public static void main(String[] args) {
        EX.in ei=new EX().new in();
        ei.show();
        EX e=new EX();
        System.out.println(e.a);
        System.out.println(EX.b);


    }
}
