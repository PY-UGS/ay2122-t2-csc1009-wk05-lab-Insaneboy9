package com.daryl;

abstract class Shape{
    double dim1;
    double dim2;
    final double PI=3.14;
    double area;


    public Shape(double dim1, double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }

    abstract double area();
    }

class Rectangle extends Shape{
    Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    double area(){
        this.area=this.dim1*this.dim2;
        return this.area;
    }

}

class Triangle extends Shape{
    Triangle(double dim1, double dim2){
        super(dim1,dim2);
    }

    double area(){
        this.area=this.dim1*this.dim2*0.5;
        return this.area;
    }

}

class Circle extends Shape{
    Circle(double dim1, double dim2){
        super(dim1,dim2);
    }

    double area(){
        this.area=PI*this.dim1*this.dim1;
        return this.area;
    }

}

class Ellipse extends Shape{
    Ellipse(double dim1, double dim2){
        super(dim1,dim2);
    }

    double area(){
        this.area=PI*this.dim1*this.dim2;
        return this.area;
    }

}

class Square extends Shape{
    Square(double dim1, double dim2){
        super(dim1,dim2);
    }
    double area(){
        this.area=this.dim1*this.dim2;
        return this.area;
    }

}



public class Q2 {
    public static void main(String[] args){
        Rectangle r= new Rectangle(9,5);
        Triangle t= new Triangle(10,8);
        Circle c= new Circle(5,5);
        Ellipse e= new Ellipse(7,7);
        Square s= new Square(6,6);
        Shape figref;
        figref=r;
        System.out.println("Inside area for Rectangle.");
        System.out.println("Area is "+ figref.area());
        figref=t;
        System.out.println("Inside area for Triangle.");
        System.out.println("Area is "+ figref.area());
        figref=c;
        System.out.println("Inside area for Circle.");
        System.out.println("Area is "+ figref.area());
        figref=e;
        System.out.println("Inside area for Ellipse.");
        System.out.println("Area is "+ figref.area());
        figref=s;
        System.out.println("Inside area for Square.");
        System.out.println("Area is "+ figref.area());
    }
}
