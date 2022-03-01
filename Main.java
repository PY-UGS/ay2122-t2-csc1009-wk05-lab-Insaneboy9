package com.daryl;

import java.util.Date;

class GeometricObject{
    private String color;
    private boolean filled;
    private Date dateCreated= new Date();

    public GeometricObject(){
       color="white";
       filled=false;
    }

    public GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public Boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public String toString(){
        return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
    }

}

class circleGeo extends GeometricObject{
    private double radius;
    final double PI=3.14;
    private double perimeter;
    private double area;
    private double diameter;

    circleGeo(){
        radius=0;
        perimeter=0;
        area=0;
        diameter=0;
    }

    circleGeo(double radius){
        this.radius=radius;
    }

    circleGeo(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double radius){
        this.radius=radius;
    }

    double getArea(){
        this.area= 3.14*this.radius*this.radius;
        return this.area;
    }

    double getPerimeter(){
        this.perimeter= 2*3.14*this.radius;
        return this.perimeter;
    }

    double getDiameter(){
        this.diameter= 2*this.radius;
        return diameter;
    }

    void printCircle(){
        System.out.println("Circle");
    }
}

class rectangleGeo extends GeometricObject{
    private double width;
    private double height;
    private double area;
    private double perimeter;

    rectangleGeo(){
        width=0;
        height=0;
        area=0;
        perimeter=0;
    }

    rectangleGeo(double width, double height){
        this.width=width;
        this.height=height;
    }

    rectangleGeo(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.height=height;
    }

    double getWidth(){
        return this.width;
    }

    void setWidth(double width){
        this.width=width;
    }

    double getHeight(){
        return this.height;
    }

    void setHeight(double height){
        this.height=height;
    }

    double getArea(){
        this.area=this.height*this.width;
        return this.area;
    }

    double getPerimeter(){
        this.perimeter= 2*this.width+2*this.height;
        return this.perimeter;
    }
}



public class Main {

    public static void main(String[] args) {
        circleGeo circle= new circleGeo(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        rectangleGeo rectangle= new rectangleGeo(2,4);
        System.out.println(" A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
