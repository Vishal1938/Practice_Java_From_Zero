package com.company;
interface Type1{
    void f()throws CloneNotSupportedException;

}
interface Type2{
    void f()throws InterruptedException;

}
interface Type3 extends Type1,Type2{
}
public class page340  implements Type3{
    public void f(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        Type3 t3 =new page340();
        t3.f();
    }
}
