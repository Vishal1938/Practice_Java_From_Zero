package com.company;
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius ,int height){
        this.height = radius;
        this.radius = height;
        }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class cwh_44_ps9 {
    public static void main(String[] args) {
        cylinder myclinder =new cylinder(1,7);
        System.out.println(myclinder.getHeight());
        System.out.println(myclinder.getRadius());
        System.out.println(myclinder.surfacearea());
        System.out.println(myclinder.volume());
    }
}
