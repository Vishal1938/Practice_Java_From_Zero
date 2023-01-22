package com.company;

public class workbook11_of2 {
    public static void main(String[] args) throws Exception{
        if(args.length==1){
            String cName=args[0];
            Class cl=Class.forName(cName);
            Class cl1=Class.forName(cName);
            System.out.println(cl);
            System.out.println(cl1);
            System.out.println(cl1==cl);
            System.out.println("--Class Loaded\t:"+cl.getName());
        }else {
            System.out.println("Provide Classname as CLA");
        }
    }
}
