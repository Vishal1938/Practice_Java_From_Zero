package com.company;
class hai1{
    void m1(){
        System.out.println("m1 in hello");
    }
}
class hello6{
    static hai1 hai= new hai1();
    static hai1 getHai(){
        System.out.println("gethai() in hello");
        return hai;
    }
}
public class program_6point13 {
    public static void main(String[] args) {
        hai1 hai = hello6.getHai();
        hai1 hai1 = hello6.getHai();
        System.out.println(hai1);
        System.out.println(hai);
        System.out.println(hai1.hashCode());
        System.out.println(hai1.hashCode());
    }
}
