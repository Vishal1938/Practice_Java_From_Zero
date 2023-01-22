package com.company;

class animal{
   public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base and setting the value of x :"+ x);
        this.x = x;
    }
    public void printme(){
        System.out.println("i am a constructor :"+ x);
    }
}
class Dog extends animal{
   public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class phone{
    public String name;
    public int phone_no;

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
class smartphone extends phone{
    public String music;
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}
public class vishal_inheritance {
    public static void main(String[] args) {
        animal b = new animal();
        b.setX(4);
        System.out.println(b.getX());
        Dog d = new Dog();
        d.setX(6);
        System.out.println(d.getX());
        phone m= new phone();
        m.setPhone_no(100);
        System.out.println(m.phone_no);
        m.setName("papa");
        System.out.println(m.getName());
        smartphone sm= new smartphone();
        sm.setMusic("jai ho");
        System.out.println(sm.getMusic());
        sm.setId(131);
        System.out.println(sm.getId());

    }
}
