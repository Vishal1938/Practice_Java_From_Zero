package com.company;
class outer2{
    private int ab=1010;
    class Inner{
        public int a1=10;
        private int b1=202;
        void m1(){
            System.out.println("m1 in inner");
        }
    }
    void showOuter(){
        Inner inr=new Inner();
        System.out.println(ab);
        System.out.println(inr.a1);
        System.out.println(inr.b1);
    }}
public class program_point9 {
    public static void main(String[] args) {
        outer2 otr = new outer2();
        outer2.Inner oi1=otr.new Inner();
        otr.showOuter();
    }
}
