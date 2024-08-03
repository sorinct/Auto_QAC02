package oop1;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }
    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return 2*(this.length + this.width);
    }
    public double getDiagonal(){
        return Math.sqrt((this.length*this.length) + (this.width*this.width));
    }
}
