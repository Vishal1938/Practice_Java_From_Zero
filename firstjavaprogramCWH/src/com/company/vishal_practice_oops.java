package com.company;
class square1{
    int side;
    public int Area(){
        return side*side ;
    }
    public int perimeter(){
        return 4*side;
    }
}
class circle{
    int radius ;
    public double Area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return  2*Math.PI*radius;

    }
}
class mycellphone{
    public void Ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("vibrating....");
    }
    public void call(){
        System.out.println("calling....");
    }

}
class tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("ruuning from the enemy");
    }
    public void fire(){
        System.out.println("firing the gun");
    }

}
class myemployee {
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }
    public String getname(){
        return name;
    }
    /*public void setName(String n){
        name =n ;
    }*/
}
public class vishal_practice_oops {
    public static void main(String[] args) {


        square1 sq = new square1();
        sq.side = 3;
        System.out.println(sq.Area());
        System.out.println(sq.perimeter());
        circle cl = new circle();
        cl.radius=1;
        System.out.println(cl.Area());
        System.out.println(cl.perimeter());
        mycellphone vivo=new mycellphone();
        vivo.vibrate();
        vivo.call();
        vivo.Ring();
        tommy game= new tommy();
        game.fire();
        game.hit();
        game.run();
        myemployee vishal= new myemployee();
        vishal.salary=500000;
        vishal.name= "webdeveloper";
        System.out.println(vishal.getSalary());
        System.out.println(vishal.getname());
    }
}
