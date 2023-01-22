package com.company;
class rectangle{
    private int breadth;
    private int length;
    public rectangle(int breadth,int length){
        this.breadth =breadth;
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    public int perimeter() {
        return 2 *(length + breadth) ;
    }
    public int area(){
        return length*breadth;
    }
}

public class cwh_rectangle {
    public static void main(String[] args) {
        rectangle r= new rectangle(8,6);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}
