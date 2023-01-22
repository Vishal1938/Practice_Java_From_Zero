package com.company;
class fan1{
    String st1;
    fan1(String st1){
        this.st1=st1;
    }
}
class fan2{
    String st2;
    fan1 f1;
    fan2(String st2,fan1 f1){
        this.st2=st2;
        this.f1=f1;
    }
}
class fan3{
    String st3;
    fan2 f2;
    fan3(String st3,fan2 f2){
        this.st3=st3;
        this.f2=f2;
    }
}
class celeb implements Cloneable{
    String st;
    fan3 f3;
    celeb(String st,fan3 f3){
      this.f3=f3;
    }
    celeb myclone()throws Exception{
        return (celeb)this.clone();
    }
    public Object clone()throws CloneNotSupportedException{
        Class ar[]=this.getClass().getInterfaces();
        celeb cl=null;
        if (ar[0].getName().equals("java.lang.Cloneable")){
            fan1 f11=new fan1(f3.f2.f1.st1);
            fan2 f22=new fan2(f3.f2.st2,f11);
            fan3 f33=new fan3(f3.st3,f22);
            cl=new celeb(st,f33);
        }else{
            throw new CloneNotSupportedException();
        }
        return cl;
    }
}

public class practice_clone {
    public static void main(String[] args) throws Exception{
        fan1 f1=new fan1("vishal");
        fan2 f2=new fan2("rahul",f1);
        fan3 f3=new fan3("ram",f2);
        celeb c11=new celeb("srk",f3);
        celeb c12=c11.myclone();
        System.out.println(c11.hashCode());
        System.out.println(c12.hashCode());
        System.out.println(c11.f3==c12.f3);
        System.out.println(c11.f3.hashCode());
        System.out.println(c12.f3.hashCode());
        System.out.println(c11.f3.f2.f1==c12.f3.f2.f1);
    }
}
