package com.company;
class Student333 {
     int sid;
     String name;
     String Address;

    Student333(int sid, String name, String Address) {
        this.sid = sid;
        this.name = name;
        this.Address = Address;
    }

    void show() {
        System.out.println("Show in Student");
        System.out.println(sid);
        System.out.println(name);
        System.out.println(Address);;
    }
    public String toString(){
        return "sid\t:"+sid+" name\t:"+name+" Address  \t:"+Address;
    }
    public boolean equals(Object o){
        Student333 s1=(Student333) o;
        if((s1.sid==this.sid)&&(s1.name.equals(this.name)&&(s1.Address.equals(this.Address)))) {
            return true;
        }
        else{
            return false;
        }
    }
}

public class Example14_point3 {
    public static void main(String[] args) {
        Student333 s1 = new Student333(101, "vishal", "Ballia");
        Student333 s2 = new Student333(102, "sameer", "Gorakhpur");
        Student333 s3 = new Student333(103, "vivek", "jaunpur");
        s1.show();
        s2.show();
        s3.show();
        System.out.println(s1);
        System.out.println(s2.toString());
        System.out.println(s1.hashCode());
        System.out.println(s3);
        System.out.println("****compare****\n");
        boolean bn=s1.equals(s2);
        System.out.println(bn);
        System.out.println(s1==s2);
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}