package com.company;
abstract class Shape{
    double length;
    Shape(double length){
        this.length=length;
    }
    final double getLength(){
        return this.length;
    }
    abstract double findArea();
    abstract String gettype();
    static void display(){
        System.out.println("--Static Display in shape---");
    }
}
class Square extends  Shape{
    Square(double side){
        super(side);
    }
   double findArea(){
       System.out.println("**square find Area***");
       return length*length;
   }
   double getside(){
        return length;
   }
   String gettype(){
        return "Square";
   }
   static void display(){
       System.out.println("====Static display in square");
   }
}
class Rectangle extends  Shape{
    double width;
    Rectangle(double length,double width){
        super(length);
        this.width=width;
    }

    @Override
    double findArea() {
        System.out.println("**Rectangle Find Area**");
        return length*width;
    }
    String gettype(){
        return "Rectangle";
    }
    double getWidth(){
        return width;
    }
    static void display(){
        System.out.println("**Static display in Rectangle");
    }
}
class ShapeUtil{
    public void showShapeInfo(Shape sp){
        System.out.println("\nType\t:"+sp.gettype());
        System.out.println("Length\t:"+sp.getLength());
        System.out.println("Area\t:"+sp.findArea());
        sp.display();
        if(sp instanceof Square){
            Square sq=(Square) sp;
            System.out.println("side\t:"+sq.getside());
            sq.display();
            System.out.println();
        }
        else if(sp instanceof Rectangle){
            Rectangle res=(Rectangle) sp;
            res.display();
            System.out.println("Width\t:"+res.getWidth());
        }
    }
}
public class workbook20_of2 {
    public static void main(String[] args) {
        ShapeUtil util=new ShapeUtil();
      //  util.showShapeInfo(new Square(12.0));
        util.showShapeInfo(new Rectangle(12.0,10.0));
    }
}