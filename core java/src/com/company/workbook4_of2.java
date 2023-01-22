package com.company;

public class workbook4_of2 {
    public static void main(String[] args) {
        MethodParamService ref=new MethodParamService();
        System.out.println("=====primitive=====");
        int ab=123;
        System.out.println("in main before\t:"+ab);
        ref.modify(ab);
        System.out.println("In main after\t:"+ab);
        System.out.println("\n====REFERENCE===");
        User ur=new User();
        ur.uid=101;
        ur.phone=6526668l;
        System.out.println("In main Before \t:"+ur.uid+"\t"+ur.phone);
        ref.modify(ur);
        System.out.println("In Main After\t:"+ur.uid+"\t"+ur.phone);
        System.out.println("In main before \t:"+ur.uid+"\t"+ur.phone);
        ref.change(ur);

        System.out.println("In Main After\t:"+ur.uid+"\t"+ur.phone);
    }
}
class MethodParamService{
    void modify(int ab){
        System.out.println("--modify(int)--");
        System.out.println("Before modifying\t:"+ab);
         ab=ab+100;
        System.out.println("After Modifying\t:"+ab);
    }
    void modify(User user) {
        System.out.println("--modify(user)--");
        System.out.println("Before Modifying\t:"+user.uid+"\t"+user.phone);
        user =new User();
        System.out.println("Before Modifying\t:"+user.uid+"\t"+user.phone);
        user.uid=user.uid+1000;
        user.phone=999999999999l;
        System.out.println("After Modifying\t:"+user.uid+"\t"+user.phone);
    }
    void change(User user){
        System.out.println("---change(user)---");
        System.out.println("Before Modifying\t:"+user.uid+"\t"+user.phone);
        user.uid=user.uid+1000;
        user.phone=9999999999l;
        System.out.println("After Modifying\t:"+user.uid+"\t"+user.phone);
        user=new User();
        user.uid=33333;
        user.phone=85833828785l;
        System.out.println("After Modifying Ref\t:"+user.uid+"\t"+user.phone);
    }
}
class User{
    int uid;
    long phone;
}