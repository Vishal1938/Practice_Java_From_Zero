package com.company;
class Clone1{
    int p;
    Clone1(int p){
        this.p=p;
    }
}
class Clone2{
    int q;
    Clone1 c1;
    Clone2(int q,Clone1 c1){
        this.q=q;
        this.c1=c1;
    }
}
class Clone3{
    int r;
    Clone2 c2;
    Clone3(int r,Clone2 c2){
        this.r=r;
        this.c2=c2;
    }
}
class shallow implements Cloneable{
    int x;
    Clone3 c3;
    shallow(int x,Clone3 c3){
        this.x=x;
        this.c3=c3;
    }
    public Object clone()throws CloneNotSupportedException{
        Class ar[]=this.getClass().getInterfaces();
        shallow sh=null;
        if(ar[0].getName().equals("java.lang.Cloneable")){
            Clone1 c11=new Clone1(c3.c2.c1.p);
            Clone2 c22=new Clone2(c3.c2.q,c11);
            Clone3 c33=new Clone3(c3.r,c22);
            sh=new shallow(x,c33);
        }else {
            throw new CloneNotSupportedException();
        }
        return sh;
    }
    shallow MyClone()throws Exception{
        return (shallow) this.clone();//s1.clone();
    }
}
public class shallow_cloning {
    public static void main(String[] args)throws Exception {
        Clone1 c1=new Clone1(101);
        Clone2 c2=new Clone2(202,c1);
        Clone3 c3=new Clone3(303,c2);
        shallow s1=new shallow(404,c3);
        shallow s2= s1.MyClone();//current working object=s1
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.x);//404
        System.out.println(s2.x);//404
        s1.x=1000;
        System.out.println(s1.x);//1000
        System.out.println(s2.x);//404
        System.out.println(s1.c3.hashCode());
        System.out.println(s2.c3.hashCode());
        System.out.println(s1.c3.hashCode()==s2.c3.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.c3==s2.c3);
        System.out.println(s1.c3.c2==s2.c3.c2);
        System.out.println(s1.c3.c2.c1==s2.c3.c2.c1);
        System.out.println();
    }
}
