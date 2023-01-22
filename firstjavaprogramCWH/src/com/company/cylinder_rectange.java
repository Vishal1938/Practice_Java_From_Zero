package com.company;
class cylinders{
    private int radius;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public cylinders(int radius,int height) {
        this.radius = radius;
        this.height = height;
    }

    public double SurfaceArea(){
        return 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }

}

public class cylinder_rectange {
    public static void main(String[] args) {
     //   cylinders myclinders = new cylinders(9,12);
      //  myclinders.setHeight(9);
      //  System.out.println(myclinders.getHeight());
    //    myclinders.setRadius(12);
    //    System.out.println(myclinders.getRadius());
     //   System.out.println(myclinders.SurfaceArea());
     //   System.out.println(myclinders.volume());
        rectangle myrectangle= new rectangle(12,11);
       // myrectangle.setLength(10);
        System.out.println(myrectangle.getLength());
     //   myrectangle.setBreadth(16);
        System.out.println(myrectangle.getBreadth());
        System.out.println(myrectangle.area());
        System.out.println(myrectangle.perimeter());
    }
}
