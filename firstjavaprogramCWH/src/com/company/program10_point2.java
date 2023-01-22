package com.company;
class yello{
    void m1(){
        System.out.println("m1 in hello");
    }
    void m2(){
        System.out.println("m2 in hello");
    }
    private void m3(){
        System.out.println("m3 in hello");
    }
    protected int m4(){
        System.out.println("m4 in hello");
        return 111;
    }
}
class lelo extends yello{
    void m1(){
        System.out.println("m1 in hai");
    }
    void m2(int a){
        System.out.println("m2(int a) in hai");
    }
    void m2(int a,int b){
        System.out.println("m2(int a,int b) in hai");
    }
    public void m3(){
        System.out.println("m3 in hai");
    }
    public int m4(){
        System.out.println("m4 in hai");
        return 101;
    }
    private void m5(){
        System.out.println("m5 in hai");
    }
}
public class program10_point2 {
    public static void main(String[] args) {
        lelo lelo=new lelo();
        lelo.m1();
        lelo.m2(11);
        lelo.m2(11,22);
    }
}
