package com.JavaEight;

public class Workbook_3 {
    interface StringReturns{
        String returnMessage();
    }
    interface ActionCode{
        int returnCode(String codestr);
    }
    public static void noArgument(){
        StringReturns msg=()->"This is a test";
        System.out.println(msg.returnMessage());
    }
    public static void returnCode(){
        ActionCode code=(codestr)->{
            switch (codestr){
                case"ACTIVE":
                    return 0;
                case"INACTIVE":
                    return 1;
                default:
                    return -1;
            }
        };
        System.out.println("Return :"+code.returnCode("ACTIVE"));
    }
    public static void main(String[] args) {
        noArgument();
        returnCode();
    }
}
