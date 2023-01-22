package com.company;
class SUN{
    String name;
    int age;
    SUN(String name, int age){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object o){
        boolean flag=false;
        if(o instanceof SUN){
            SUN s=(SUN) o;
            if(name.equals(s.name)&&age==s.age)
                flag= true;
        }else {
            flag= false;
        }
        return flag;
    }

}
public class Example14_point2 {
    public static void main(String[] args) {
        SUN s1=new SUN("vishal",88);
        SUN s2=new SUN("vishal",89);
        System.out.println(s1.equals(s2));
    }
}
