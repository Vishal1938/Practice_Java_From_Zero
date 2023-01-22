package com.JavaEight;
interface Interf{
   // public void m1();
   // public int m1(int a,int b);
   // public int Squareit(int n);
   // public String m1(String name,int rollno);
    public void add(int a,int b);
}
public class JavaEightDemo{
    public static void main(String[] args) {
     /*   Lamda l1=new Lamda();
        l1.m1();*/
     /* Interf i1  =()-> System.out.println("hello in lamda expression");
      i1.m1();*/
      /*  Interf i1=(a,b)-> {System.out.println("sum of two :"+(a+b));
            return a+b;};
      int i =i1.m1(6,7);
        System.out.println(i);*/
      /*  Interf i1=n->n*n;
        System.out.println("Square of n is :"+i1.Squareit(7));*/
       /* Interf i1=(String name, int rollno)-> {System.out.println("Name :"+name+"Roll no :"+rollno);
                return name +""+rollno;};
        System.out.println(i1.m1("vishal",123));*/
        Interf i1=(a,b)-> System.out.println("Adition of two :"+(a+b));
        i1.add(5,6);
        i1.add(45,78);
        i1.add(89,12);
    }
}
